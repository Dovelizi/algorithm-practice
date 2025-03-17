package com.lizi.test;

import java.util.ArrayList;
import java.util.Collection;
import java.util.List;
import java.util.concurrent.CompletableFuture;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.TimeUnit;
import java.util.stream.Collectors;
import java.util.stream.Stream;

/**
 * @author lizi
 * @since 2023-05-19
 **/
class LRUCache {
    public static void main(String[] args) {
//       test();
//       test1();
//       test2();
//       test3();
        test4();
    }

    public static void test(){
        CompletableFuture<List<String>> painting = CompletableFuture.supplyAsync(() -> {
            // 第一个任务获取美术课需要带的东西，返回一个list
            List<String> stuff = new ArrayList<>();
            stuff.add("画笔");
            stuff.add("颜料");
            return stuff;
        });
        CompletableFuture<List<String>> handWork = CompletableFuture.supplyAsync(() -> {
            // 第二个任务获取劳技课需要带的东西，返回一个list
            List<String> stuff = new ArrayList<>();
            stuff.add("剪刀");
            stuff.add("折纸");
            return stuff;
        });
        CompletableFuture<List<String>> total = painting
                // 传入handWork列表，然后得到两个CompletableFuture的参数Stuff1和2
                .thenCombine(handWork, (stuff1, stuff2) -> {
                    // 合并成新的list
                    return Stream.of(stuff1, stuff2).flatMap(Collection::stream)
                            .collect(Collectors.toList());
                });
        System.out.println(total.join());
    }
    public static void test1(){
        CompletableFuture<Integer> future1 = CompletableFuture.supplyAsync(() -> {
            try {
                // 使用 sleep() 模拟耗时操作
                TimeUnit.SECONDS.sleep(2);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
            return 1;
        });

        CompletableFuture<Integer> future2 = CompletableFuture.supplyAsync(() -> 2);
        CompletableFuture.allOf(future1, future1);
        // 输出3
        System.out.println(future1.join() + future2.join());
    }

    public static void test2(){
        CompletableFuture<Integer> future = CompletableFuture.supplyAsync(() -> {
            throw new NullPointerException();
        });

        CompletableFuture<Integer> future2 = CompletableFuture.supplyAsync(() -> {
            try {
                // 睡眠3s模拟延时
                TimeUnit.SECONDS.sleep(3);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
            return 1;
        });
        CompletableFuture<Object> anyOf = CompletableFuture
                .anyOf(future, future2)
                .exceptionally(error -> {
                    error.printStackTrace();
                    return 2;
                });
        System.out.println(anyOf.join());
    }

    public static void test3(){
        CompletableFuture.supplyAsync(() -> 1)
                .whenComplete((result, error) -> {
                    System.out.println(result);
                    error.printStackTrace();
                })
                .handle((result, error) -> {
                    error.printStackTrace();
                    return error;
                })
                .thenApply(Object::toString)
                .thenApply(Integer::valueOf)
                .thenAccept((param) -> System.out.println("done"));
    }
    public static void test4(){
        long begin = System.currentTimeMillis();
        // 自定义一个线程池
        ExecutorService executorService = Executors.newFixedThreadPool(10);
        // 循环创建10个CompletableFuture
        List<CompletableFuture<Integer>> collect = new ArrayList<>();
        for (int j = 1; j < 10; j++) {
            int i = j;
            CompletableFuture<Integer> exceptionally = CompletableFuture.supplyAsync(() -> {
                        // 在i=5的时候抛出一个NPE
                        if (i == 5) {
                            throw new NullPointerException();
                        }
                        try {
                            // 每个依次睡眠1-9s，模拟线程耗时
                            TimeUnit.NANOSECONDS.sleep(1);
                        } catch (InterruptedException e) {
                            e.printStackTrace();
                        }
                        System.out.println(i);
                        return i;
                    }, executorService)
                    // 这里处理一下i=5时出现的NPE
                    // 如果这里不处理异常，那么异常会在所有任务完成后抛出,小伙伴可自行测试
                    .exceptionally(Error -> {
                        try {
                            TimeUnit.NANOSECONDS.sleep(1);
                            System.out.println(100);
                        } catch (InterruptedException e) {
                            e.printStackTrace();
                        }
                        return 100;
                    });
            collect.add(exceptionally);
        }
        // List列表转成CompletableFuture的Array数组,使其可以作为allOf()的参数
        // 使用join()方法使得主线程阻塞，并等待所有并行线程完成
        CompletableFuture.allOf(collect.toArray(new CompletableFuture[]{})).join();
        System.out.println(collect);
        System.out.println("最终耗时" + (System.currentTimeMillis() - begin) + "毫秒");
        executorService.shutdown();
    }
}
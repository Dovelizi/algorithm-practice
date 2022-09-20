package com.lizi.test;

import java.util.*;

/**
 * @author lizi
 * @description TODO
 * @date 2022/6/29 14:21
 **/
public class CollectionDemo {
    public static void main(String[] args) {
        List<String> list = new ArrayList<>();
        list.add("lizi");
        list.add("demo");
        list.add("lemon");

        for(String str : list){
            if(Objects.equals("lemon", str)){
                list.remove(str);
            }
        }

        Iterator iterator = list.iterator();
        while (iterator.hasNext()){
            if(Objects.equals("lemon", iterator.next())){
                iterator.remove();
            }
        }

        System.out.println(Arrays.toString(list.toArray()));
    }

    public static void test(int[] arr){
        int idx = 2;
        int size = arr.length;
        System.arraycopy(arr, idx + 1, arr, idx, arr.length - idx - 1);
        System.out.println(Arrays.toString(arr));
    }
}

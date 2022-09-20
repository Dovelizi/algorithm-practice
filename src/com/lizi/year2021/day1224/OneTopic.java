package com.lizi.year2021.day1224;

import java.util.*;

/**
 * @author lizi
 * @description TODO
 * @date 2021/12/24 09:59
 **/
public class OneTopic {
    public static void main(String[] args) {
       // eatenApples(new int[]{2,1,1,4,5}, new int[]{10,10,6,4,2});
        int[] arr = new int[4];
        List<Integer> list = new ArrayList<>();
        list.add(1);
        list.add(2);
        list.add(3);
        list.add(4);
        list.stream().mapToInt(Integer :: valueOf).toArray();
        list.toArray();
    }
    public static int eatenApples(int[] apples, int[] days) {
        PriorityQueue<Apple> appleHeap = new PriorityQueue<>((a1, a2) -> a1.expireTime - a2.expireTime);
        int resApples = 0;
        int day = 0;
        int dayLen = days.length;
        while(day < dayLen){
            int num = apples[day];
            int expireTime = day + days[day];
            if(num != 0){
                appleHeap.add(new Apple(num, expireTime));
            }
            while(!appleHeap.isEmpty() && appleHeap.peek().expireTime <= day){
                appleHeap.poll();
            }
            if(!appleHeap.isEmpty()){
                Apple apple = appleHeap.peek();
                if((apple.appleNum - 1) >= 1){
                    resApples++;
                }
                if(apple.appleNum == 0){
                    appleHeap.poll();
                }
            }
            while(!appleHeap.isEmpty()){
                Apple apple = appleHeap.poll();
                if(apple.expireTime > day){
                    int enableApple = Math.min(apple.expireTime - day, apple.appleNum);
                    resApples += enableApple;
                    day += enableApple;
                }
            }
            day++;
        }
        return resApples;
    }
}

class Apple{
    int appleNum;
    int expireTime;
    public Apple(int appleNum, int expireTime){
        this.appleNum = appleNum;
        this.expireTime = expireTime;
    }
}
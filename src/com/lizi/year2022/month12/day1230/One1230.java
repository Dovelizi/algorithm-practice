package com.lizi.year2022.month12.day1230;

import java.util.TreeSet;

/**
 * @author lizi
 * @date 2022/12/30 08:55
 * @description 855. 考场就座
 **/
public class One1230 {
    public static void main(String[] args) {
        One1230 one = new One1230(10);
        one.seat();
        one.seat();
        one.seat();
        one.leave(0);
        one.leave(4);
        one.seat();
        one.seat();
        one.seat();
        one.seat();
        one.seat();
        one.seat();
        one.seat();
        one.seat();
        one.seat();
        one.leave(0);
    }
    TreeSet<Integer> set;
    int size;
    public One1230(int n) {
        set = new TreeSet<>();
        size = n - 1;
    }

    public int seat() {
       int idx = 0;
       if(!set.isEmpty()){
           int dist = set.first();
           int prev = -1;
           for (int n : set){
               if(prev != -1){
                   int d = (n - prev) >> 1;
                   if(d > dist){
                       dist = d;
                       d = (n + prev) >> 1;
                       idx = d;
                   }
                   System.out.println(d);
               }
               prev = n;
           }
           if(size - set.last() > dist){
                idx = size;
           }
       }
       set.add(idx);
       return idx;
    }

    public void leave(int p) {
        set.remove(p);
    }
}

package com.lizi.year2021.day1227;

import java.util.LinkedList;
import java.util.List;

/**
 * @author lizi
 * @description TODO
 * @date 2021/12/27 17:31
 **/
public class TwoTopic {
    public static void main(String[] args) {
        nthUglyNumber(10);

    }
    public static int nthUglyNumber(int n) {
        if(n == 0){
            return 0;
        }
        List<Integer> list = new LinkedList<>();
        int p1 = 0,p2 = 0,p3 = 0;
        list.add(1);
        for(int i = 1; i < n; i++){
            int temp = Math.min(list.get(p1) * 2, list.get(p2) * 3);
            temp = Math.min(temp, list.get(p3) * 5);
            if(temp == list.get(p1) * 2){
                p1++ ;
            }
            if(temp == list.get(p2) * 3){
                p2++ ;
            }
            if(temp == list.get(p3) * 5){
                p3++ ;
            }
            list.add(temp);
        }
        return list.get(n - 1);
    }
}

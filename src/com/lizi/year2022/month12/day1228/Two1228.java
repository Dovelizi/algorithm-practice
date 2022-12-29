package com.lizi.year2022.month12.day1228;

import java.util.Arrays;

/**
 * @author lizi
 * @date 2022/12/28 09:11
 * @description 2517. 礼盒的最大甜蜜度
 **/
public class Two1228 {
    public int maximumTastiness(int[] price, int k) {
       int left = 0, right = 1000000000;
       Arrays.sort(price);
       while (left < right){
           int mid = (left + right + 1) >> 1;
           int count = 1;
           for (int i = 1, prev = 0; i < price.length; i++){
               if(price[i] - price[prev] >= mid){
                   count++ ;
                   prev = i;
               }
           }
           if(count < k){
               right = mid - 1;
           }else {
               left = mid;
           }
       }
        return left;
    }
}

package com.lizi.year2022.month12.day1229;

import java.util.Arrays;

/**
 * @author lizi
 * @date 2022/12/29 14:13
 * @description 875. 爱吃香蕉的珂珂
 **/
public class Three1229 {
    public static void main(String[] args) {
        minEatingSpeed(new int[]{805306368,805306368,805306368}, 1000000000);
    }
    public static int minEatingSpeed(int[] piles, int h) {
        int len = piles.length;
        Arrays.sort(piles);
        int left = 0, right = piles[len - 1];
        while (left < right){
            int mid = left + ((right - left) >> 1);
            if(mid == 0){
                return mid + 1;
            }
            long costH = 0;
            for (int i = 0; i < len; i++){
                costH += piles[i] / mid + (piles[i] % mid == 0 ? 0 : 1);
            }
            if(costH > h){
                left = mid + 1;
            }else {
                right = mid;
            }
        }
        return left;
    }
}

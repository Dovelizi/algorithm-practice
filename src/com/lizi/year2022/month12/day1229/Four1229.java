package com.lizi.year2022.month12.day1229;

import java.util.Arrays;

/**
 * @author lizi
 * @date 2022/12/29 15:25
 * @description 1011. 在 D 天内送达包裹的能力
 **/
public class Four1229 {
    public static void main(String[] args) {
        shipWithinDays(new int[]{1,2,3,4,5,6,7,8,9,10}, 10);
    }
    public static int shipWithinDays(int[] weights, int days) {
        int sum = Arrays.stream(weights).sum();
        int max = Arrays.stream(weights).max().getAsInt();
        int left = max, right = sum;
        while (left < right){
            int mid = left + ((right - left) >> 1);
            int costDay = 0;
            long costWeight = 0;
            for (int n : weights){
                if(costWeight + n <= mid){
                    costWeight += n;
                }else {
                    costDay += costWeight / mid + (costWeight % mid == 0 ? 0 : 1);
                    costWeight = n;
                }
            }
            costDay += costWeight / mid + (costWeight % mid == 0 ? 0 : 1);
            if(costDay > days){
                left = mid + 1;
            }else {
                right = mid;
            }
        }
        return left;
    }
}

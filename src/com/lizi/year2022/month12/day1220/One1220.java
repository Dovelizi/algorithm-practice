package com.lizi.year2022.month12.day1220;

import java.util.Arrays;

/**
 * @author lizi
 * @date 2022/12/20 09:37
 * @description 1760. 袋子里最少数目的球
 **/
public class One1220 {
    public static void main(String[] args) {
        minimumSize(new int[]{9}, 2);
    }
    public static int minimumSize(int[] nums, int maxOperations) {
        int min = 1;
        int max = Arrays.stream(nums).max().getAsInt();
        while (min <= max){
            int mid = (max + min) >> 1;
            int temp = 0;
            for (int n : nums){
                temp += (n - 1) / mid;
            }
            if (temp > maxOperations){
               min = mid + 1;
            }else {
               max = mid - 1;
            }
        }
        return min;
    }
}

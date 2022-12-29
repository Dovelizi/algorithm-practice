package com.lizi.year2022.month12.day1214;

import java.util.Arrays;

/**
 * @author lizi
 * @date 2022/12/14 13:37
 * @description TODO
 **/
public class Two1214 {
    public static void main(String[] args) {
        longestSquareStreak(new int[]{10,2,13,16,8,9,13});
    }
    public static int longestSquareStreak(int[] nums) {
        int ans = 0;
        Arrays.sort(nums);
        int len = nums.length;
        int maxIdx = 100001;
        int maxValue = 317;
        int[] hash = new int[maxIdx];
        for (int i = 0; i < len; i++) {
            hash[nums[i]]++ ;
        }
        for (int i = 0; i < len - 1; i++) {
            int temp = nums[i];
            int count = 1;
            while (temp <= maxValue){
                temp *= temp;
                if(temp <= nums[len - 1] && hash[temp] != 0){
                    count++ ;
                }else {
                    break;
                }
            }
            ans = Math.max(count, ans);
        }
        return ans == 1 ? -1 : ans;
    }
}

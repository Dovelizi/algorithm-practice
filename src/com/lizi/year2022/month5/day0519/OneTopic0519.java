package com.lizi.year2022.month5.day0519;

import java.util.Arrays;

/**
 * @author lizi
 * @description TODO
 * @date 2022/5/19 10:52
 **/
public class OneTopic0519 {
    public static void main(String[] args) {
        System.out.println(Integer.MAX_VALUE);
    }
    public int minMoves2(int[] nums) {
        Arrays.sort(nums);
        long ans1 = 0;
        long ans2 = 0;
        int len = nums.length;
        if(len < 3){
            return Math.abs(nums[0] - nums[len - 1]);
        }
        for (int n : nums){
            ans1 += Math.abs(n - nums[len / 2]);
            ans2 += Math.abs(n - nums[len / 2 + 1]);
        }
        return (int) Math.min(ans1, ans2);
    }
}

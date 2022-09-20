package com.lizi.year2022.month4.day0422;

import java.util.Arrays;

/**
 * @author lizi
 * @description TODO
 * @date 2022/4/22 09:36
 **/
public class OneTopic0422 {
    public static void main(String[] args) {
        maxRotateFunction(new int[]{4,3,2,6});
    }
    public static int maxRotateFunction(int[] nums) {
        int ans = Integer.MIN_VALUE;
        int sum = Arrays.stream(nums).sum();
        int len = nums.length;
        int fSum = 0;
        for (int i = 0; i < len; i++) {
            fSum += i * nums[i];
        }
        for (int i = len - 1; i >= 1; i--) {
            //枚举最右边的数字最右边的移到第一个
            fSum = fSum - len * nums[i] + sum;
            ans = Math.max(fSum, ans);

        }
        return ans;
    }
}

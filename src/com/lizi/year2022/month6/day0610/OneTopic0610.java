package com.lizi.year2022.month6.day0610;

import java.math.BigDecimal;

/**
 * @author lizi
 * @description TODO
 * @date 2022/6/10 08:56
 **/
public class OneTopic0610 {
    public static void main(String[] args) {
        minMaxGame(new int[]{0,38,21,22});
        double d = 0.000000234;
        BigDecimal.valueOf(d).compareTo(BigDecimal.ZERO);
    }
    public static int minMaxGame(int[] nums) {
        if (nums.length <= 2) {
            return Math.min(nums[0], nums.length == 2 ? nums[1] : nums[0]);
        }
        int[] arrs = new int[nums.length >> 1];
        for (int i = 0; i < arrs.length; i++) {
            arrs[i] = Math.min(nums[i << 1], nums[i << 1 | 1]);
            i++;
            arrs[i] = Math.max(nums[i << 1], nums[i << 1 | 1]);
        }
        return minMaxGame(arrs);
    }
}

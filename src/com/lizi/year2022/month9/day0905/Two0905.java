package com.lizi.year2022.month9.day0905;

/**
 * @author lizi
 * @date 2022/9/4 10:29
 * @description TODO
 **/
public class Two0905 {
    public int longestNiceSubarray(int[] nums) {
        int max = 0;
        for (int i = 0; i < nums.length; i++) {
            int mask = 0;
            for (int j = i; j < nums.length && (mask & nums[j]) == 0; j++) {
                mask ^= nums[j];
                max = Math.max(max, j - i + 1);
            }
        }
        return max;
    }
}

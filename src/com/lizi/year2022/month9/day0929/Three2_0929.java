package com.lizi.year2022.month9.day0929;

import java.util.Arrays;

/**
 * @author lizi
 * @date 2022/9/29 16:37
 * @description 698. 划分为k个相等的子集(元素的纬度)
 **/
public class Three2_0929 {
    public boolean canPartitionKSubsets(int[] nums, int k) {
        int sum = Arrays.stream(nums).sum();
        int len = nums.length;
        if(sum % k != 0){
            return false;
        }
        int target = sum / k;
        return true;
    }
    public boolean dfs(int[] nums, int target, int sum, boolean[] used){
    return false;
    }
}

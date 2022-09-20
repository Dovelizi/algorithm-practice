package com.lizi.year2022.month9.day0920;

import java.util.Arrays;
import java.util.List;

/**
 * @author lizi
 * @date 2022/9/20 19:38
 * @description 698.划分为k个相等的子集
 **/
public class One0920 {
    public boolean canPartitionKSubsets(int[] nums, int k) {
        boolean ans = false;
        int len = nums.length;
        int sum = Arrays.stream(nums).sum();
        if(sum % k != 0){
            return ans;
        }
        int avg = sum / k;
        return ans;
    }
    public boolean dfs(int[] nums, boolean[] vis, List<Integer> list, int k, int avg){
        if(list.size() == k){
            return list.stream().reduce(Integer::compareTo).get() == avg;
        }
        return false;
    }
}

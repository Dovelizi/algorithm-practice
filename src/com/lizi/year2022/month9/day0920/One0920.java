package com.lizi.year2022.month9.day0920;

import java.util.Arrays;

/**
 * @author lizi
 * @date 2022/9/20 19:38
 * @description 698.划分为k个相等的子集
 **/
public class One0920 {
    public static void main(String[] args) {
        canPartitionKSubsets(new int[]{4, 3, 2, 3, 5, 2, 1}, 4);
    }
    public static boolean canPartitionKSubsets(int[] nums, int k) {
        int len = nums.length;
        int sum = Arrays.stream(nums).sum();
        if(sum % k != 0){
            return false;
        }
        Arrays.sort(nums);
        return  dfs(nums,new boolean[len], nums.length - 1, sum / k, 0, k);
    }
    public static boolean dfs(int[] nums, boolean[] vis, int step, int tar, int cur, int k){
       if(k == 1){
           return true;
       }
       if(cur == tar){
           return dfs(nums, vis, nums.length - 1, tar,0, k - 1);
       }
        for (int i = step; i >= 0 ; i--) {
            if(vis[i] || cur + nums[i] > tar){
                continue ;
            }
            vis[i] = true;
            if(dfs(nums, vis, i - 1, tar, cur + nums[i], k)){
                return true;
            }
            vis[i] = false;
        }
        return false;
    }
}

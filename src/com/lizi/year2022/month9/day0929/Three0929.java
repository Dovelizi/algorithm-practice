package com.lizi.year2022.month9.day0929;

import java.util.Arrays;
import java.util.HashMap;

/**
 * @author lizi
 * @date 2022/9/29 14:19
 * @description 698. 划分为k个相等的子集(桶的纬度)
 **/
public class Three0929 {
    public static void main(String[] args) {
        canPartitionKSubsets(new int[]{1,2,3,5}, 2);
    }

    static HashMap<Integer, Boolean> memo = new HashMap<>();

    public static boolean canPartitionKSubsets(int[] nums, int k) {
        int len = nums.length;
        Arrays.sort(nums);
        int target = Arrays.stream(nums).sum() / k;
        for (int i = 0; i < len / 2; i++) {
            int temp = nums[i];
            nums[i] = nums[len - i - 1];
            nums[len - i - 1] = temp;
        }
        if (nums[0] > target) {
            return false;
        }
        return dfs(nums, target, 0, 0, k, 0);
    }

    public static boolean dfs(int[] nums, int target, int step, int sum, int k, int used) {
        if (k == 0) {
            return true;
        }
        if (sum == target) {
            boolean ret = dfs(nums, target, 0, 0, k - 1, used);
            memo.put(used, ret);
            return ret;
        }

        for (int i = step; i < nums.length; i++) {
            if (((used >> i) & 1) == 1) {
                continue;
            }
            if (nums[i] + sum > target) {
                continue;
            }
            used |= 1 << i;
            sum += nums[i];
            if (dfs(nums, target, i + 1, sum, k, used)) {
                return true;
            }
            used ^= 1 << i;
            sum -= nums[i];
        }
        return false;
    }
}

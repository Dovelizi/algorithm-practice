package com.lizi.year2023.month1.day07;

import java.util.Arrays;

/**
 * @author lizi
 * @date 2023/1/7 10:14
 * @description 1658. 将 x 减到 0 的最小操作数
 **/
public class One0107 {
    public int minOperations(int[] nums, int x) {
        int ans = Integer.MAX_VALUE;
        int sum = Arrays.stream(nums).sum();
        int left = 0, right = 0;
        int curSum = 0;
        int len = nums.length;
        while (sum >= x && right < len){
            curSum += nums[right++];
            while (curSum > sum - x && left < len){
                curSum -= nums[left++];
            }
            if(curSum == sum - x){
                ans = Math.min(ans, len - (right - left));
            }
        }
        return ans == Integer.MAX_VALUE ? -1 : ans;
    }
}

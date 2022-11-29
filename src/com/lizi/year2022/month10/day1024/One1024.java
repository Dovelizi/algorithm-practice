package com.lizi.year2022.month10.day1024;

/**
 * @author lizi
 * @date 2022/10/24 08:51
 * @description 915. 分割数组
 **/
public class One1024 {
    public static void main(String[] args) {
        partitionDisjoint(new int[]{5,0,3,8,6});
    }
    public static int partitionDisjoint(int[] nums) {
        int n = nums.length;
        int leftMax = nums[0], leftPos = 0, curMax = nums[0];
        for (int i = 1; i < n - 1; i++) {
            curMax = Math.max(curMax, nums[i]);
            if (nums[i] < leftMax) {
                leftMax = curMax;
                leftPos = i;
            }
        }
        return leftPos + 1;
    }
}

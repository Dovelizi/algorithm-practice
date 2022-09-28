package com.lizi.year2022.month9.day0926;

/**
 * @author lizi
 * @date 2022/9/26 11:03
 * @description 面试题17.19 消失的两个数字
 **/
public class Two0926 {
    public int[] missingTwo(int[] nums) {
        int len = nums.length;
        int n = len + 2;
        int xorSum = 0;
        for (int num : nums){
            xorSum ^= num;
        }
        for (int i = 1; i <= n; i++) {
            xorSum ^= i;
        }

        int lastOne = xorSum == Integer.MIN_VALUE ? xorSum : xorSum & (-xorSum);
        int target1 = 0, target2 = 0;
        for (int num : nums){
            if((num & lastOne) != 0){
                target1 ^= num;
            }else {
                target2 &= num;
            }
        }
        for (int i = 1; i <= n; i++) {
            if((i & lastOne) != 0){
                target1 ^= i;
            }else {
                target2 ^= i;
            }
        }
        return new int[]{target1, target2};
    }
}

package com.lizi.year2022.month11.day1106;

/**
 * @author lizi
 * @date 2022/11/6 10:29
 * @description TODO
 **/
public class One1106 {
    public int[] applyOperations(int[] nums) {
        int len = nums.length;
        int[] ans = new int[len];
        int idx = 0;
        for (int i = 0; i < len - 1; i++) {
            if(nums[i] == nums[i + 1]){
                nums[i] = 2 * nums[i];
                nums[i + 1] = 0;
            }
        }
        for (int i = 0; i < len; i++) {
            if(nums[i] != 0){
                ans[idx++] = nums[i];
            }
        }
        return ans;
    }
}

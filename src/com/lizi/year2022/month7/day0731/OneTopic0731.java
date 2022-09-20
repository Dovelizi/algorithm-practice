package com.lizi.year2022.month7.day0731;

import java.util.Arrays;

/**
 * @author lizi
 * @description TODO
 * @date 2022/7/31 10:30
 **/
public class OneTopic0731 {
    public int minimumOperations(int[] nums) {
        int ans = 0;
        while (!allZero(nums)){
            Arrays.sort(nums);
            int idx = 0;
            int min = 0;
            for (int i = 0; i < nums.length; i++) {
                if(nums[i] != 0){
                    idx = i;
                    min = nums[i];
                    break;
                }
            }
            for(int i = idx; i < nums.length; i++){
                nums[i] -= min;
            }
            ans++ ;
        }
        return ans;
    }
    public boolean allZero(int[] nums){
        for (int n : nums){
            if(n != 0){
                return false;
            }
        }
        return true;
    }
}

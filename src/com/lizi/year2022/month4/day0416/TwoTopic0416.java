package com.lizi.year2022.month4.day0416;

import java.util.Arrays;

/**
 * @author lizi
 * @description TODO
 * @date 2022/4/16 16:26
 **/
public class TwoTopic0416 {
    public int findClosestNumber(int[] nums) {
        Arrays.sort(nums);
        int ans = Integer.MAX_VALUE;
        for(int i = 1; i < nums.length; i++){
            if(nums[i-1] < 0 && nums[i] > 0){
                if(nums[i-1] == 0 || nums[i] == 0){
                    return 0;
                }
                if(Math.abs(nums[i-1]) < nums[i]){
                    ans = nums[i-1];
                }else{
                    ans = nums[i];
                }
            }
        }
        if(ans == Integer.MAX_VALUE){
            if(nums[0] < 0){
                ans = nums[nums.length - 1];
            }else{
                ans = nums[0];
            }
        }
        return ans;
    }
}

package com.lizi.year2021.day1203;

import java.util.Arrays;

/**
 * @author lizi
 * @description TODO
 * @date 2021/12/3 09:10
 **/
public class OneTopic {
    public static void main(String[] args) {
        largestSumAfterKNegations(new int[]{-4,-2,-3},4);
    }
    public static int largestSumAfterKNegations(int[] nums, int k) {
        int negativeNum = 0;
        int result = 0;
        Arrays.sort(nums);
        for(int i = 0; i < nums.length; i++){
            if(i < k && nums[i] < 0){
                nums[i] = -nums[i];
                negativeNum++ ;
            }else{
                break;
            }
        }
        Arrays.sort(nums);
        if(k > negativeNum){
            int symbolNum = ((k - negativeNum) & 1) == 0 ? 1 : -1;
            nums[0] = nums[0] * symbolNum;
        }
        for (int item : nums){
            result += item;
        }
        return result;
    }
}

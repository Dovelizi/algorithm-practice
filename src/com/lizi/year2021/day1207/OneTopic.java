package com.lizi.year2021.day1207;

/**
 * @author lizi
 * @description TODO
 * @date 2021/12/7 15:35
 **/
public class OneTopic {
    public static void main(String[] args) {
        maxSubArray(new int[]{-2,1,-3,4,-1,2,1,-5,4});
    }
    public static int maxSubArray(int[] nums) {
        int result = 0 ;
        int idx = 0;
        for(int i = 0; i < nums.length; i++){
            if(nums[i] > 0){
                idx = i;
                break;
            }
        }
        for(int i = idx; i < nums.length; i++){
            if(nums[i] > 0){
                if(result <= 0){
                    result = 0;
                }
            }
            result += nums[i];
        }
        return result;
    }
}

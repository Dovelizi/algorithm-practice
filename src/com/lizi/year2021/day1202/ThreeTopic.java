package com.lizi.year2021.day1202;

/**
 * @author lizi
 * @description TODO
 * @date 2021/12/2 23:22
 **/
public class ThreeTopic {
    public static void main(String[] args) {
        missingNumber(new int[]{0,1});
    }
    public static int missingNumber(int[] nums) {
        int left = 0;
        int right = nums.length - 1;
        int middle = (left + right) / 2;
        int result = nums[nums.length - 1] + 1;
        if(nums.length == 1){
            result = nums[0] == 0 ? nums[0] + 1 : nums[0] - 1;
        }
        while(left < right){
            int leftValueDiff = nums[middle] - nums[left];
            int leftIdxDiff = middle - left;
            int rightValueDiff = nums[right] - nums[middle];
            int rightIdxDiff = right - middle;
            if(leftValueDiff != leftIdxDiff){
                right = middle;
            }
            if(rightValueDiff != rightIdxDiff){
                left = middle;
            }
            if(right - left == 1 && (nums[right] - nums[left] != 1)){
                result = (nums[left] + nums[right]) / 2;
                break;
            }
            if(right - left == nums.length - 1){
                if(nums[0] != 0){
                    result = 0;
                }
                break;
            }
            middle = (left + right) / 2;
        }
        return result;
    }
}

package com.lizi.year2021.day1211;

/**
 * @author lizi
 * @description TODO
 * @date 2021/12/11 18:18
 **/
public class TwoTopic {
    public static void main(String[] args) {
        twoSum(new int[]{21,44,45,54,62,73,74,74,74,81},128);
    }
    public static int[] twoSum(int[] nums, int target) {
        int pre = 0;
        int next = pre + 1;
        int len = nums.length;
        if(len == 1){
            return nums[0] == target ? nums : new int[0];
        }
        while(nums[pre] + nums[next] != target){
            if(nums[pre] + nums[next] < target){
                if(next < len - 1){
                    next++ ;
                }else{
                    pre++ ;
                }
            }
            if(nums[pre] + nums[next] > target){
                next-- ;
                len--;
            }
        }
        return new int[]{nums[pre], nums[next]};
    }
}

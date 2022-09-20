package com.lizi.year2021.day1208;

import java.util.Arrays;

/**
 * @author lizi
 * @description TODO
 * @date 2021/12/8 19:24
 **/
public class ThreeTopic {
    public static void main(String[] args) {
        nextPermutation(new int[]{1,3,2});
    }
    public static void nextPermutation(int[] nums) {
        int len = nums.length;
        int point = len - 2;
        int next = len - 1;
        for(int i = 1; i < len; i++){
            if(nums[i] > nums[i - 1]){
                break;
            }
            if(i == len - 1){
                for(int j = 0; j < len / 2; j++){
                    swapArr(nums,j,len - j  - 1);
                }
                return;
            }
        }
        if(nums[point] < nums[next]){
            swapArr(nums,point,next);
            return;
        }
        Arrays.sort(nums,point,len);
        while(next >= 0 && point >= 0){
            if(nums[point] >= nums[next]){
                point--;
                if(point < 0){
                    next-- ;
                    point = next - 1;
                }
            }else{
                swapArr(nums,point,next);
                if(nums[len - 1] < nums[len - 2]){
                    swapArr(nums,len - 2,len - 1);
                }
                break;
            }
        }
    }
    public static void swapArr(int[] nums,int pre, int next){
        int temp = nums[pre];
        nums[pre] = nums[next];
        nums[next] = temp;
    }
}

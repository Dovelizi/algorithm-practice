package com.lizi.year2022.month2.day0218;

import java.util.HashMap;
import java.util.Map;

/**
 * @author lizi
 * @description TODO
 * @date 2022/2/18 09:52
 **/
public class OneTopic0218 {
    public static void main(String[] args) {
        search(new int[]{1,3} ,1);

    }
    public static int search(int[] nums, int target) {
        int idx = -1;
        int resIdx = -1;
        int len = nums.length;
        if(len < 3){
            for(int i = 0; i < len; i++){
                if(nums[i] == target){
                    return i;
                }
            }
        }
        for(int i = 1; i < len; i++){
            if(nums[i] < nums[i-1]){
                resIdx = i;
                break;
            }
        }
        if(target == nums[resIdx]){
            return resIdx;
        }
        int left = 0;
        int right = resIdx - 1;
        if(target > nums[resIdx] && target < nums[len - 1]){
            left = resIdx;
            right = len - 1;
        }
        int middle = (left + right) / 2;
        while(left <= right){
            if(target > nums[middle]){
                left = middle + 1;
            }else if(target < nums[middle]){
                right = middle - 1;
            }else{
                idx = middle;
            }
            middle = (left + right) / 2;
        }
        return idx;
    }
}

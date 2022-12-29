package com.lizi.year2022.month12.day1229;

/**
 * @author lizi
 * @date 2022/12/29 11:01
 * @description 34. 在排序数组中查找元素的第一个和最后一个位置
 **/
public class Two1229 {
    public static void main(String[] args) {
        searchRange(new int[]{5}, 8);
    }
    public static int[] searchRange(int[] nums, int target) {
        int[] ans = {-1, -1};
        int len = nums.length;
        int left = 0, right = len;
        while (left < right){
            int mid = left + ((right - left) >> 1);
            if(nums[mid] < target){
                left = mid + 1;
            }else {
                right = mid;
            }
        }
        if(len < 1 || left >= len || nums[left] != target){
            return ans;
        }
        int idx = left;
        while (idx <= len){
            if(idx == len || nums[idx] != target){
                return new int[]{left, idx - 1};
            }else{
                idx++ ;
            }
        }
        return ans;
    }
}

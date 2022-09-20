package com.lizi.year2022.month6.day0628;

import java.util.Arrays;

/**
 * @author lizi
 * @description TODO
 * @date 2022/6/28 08:57
 **/
public class OneTopic0628 {
    public static void main(String[] args) {
        wiggleSort(new int[]{4,5,5,6});
    }
    public static void wiggleSort(int[] nums) {
        int[] arr = nums.clone();
        Arrays.sort(arr);
        int left = 0, right = arr.length - 1;
        int mid = (arr.length + 1) >> 1;
        int center = mid - 1;
        int idx = 0;
        while(left <= center || mid <= right) {
            if(left <= center){
                nums[idx++] = arr[center--];
            }
            if(mid <= right){
                nums[idx++] = arr[right--];
            }
        }
    }
}

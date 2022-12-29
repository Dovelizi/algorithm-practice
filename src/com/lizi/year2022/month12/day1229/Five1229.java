package com.lizi.year2022.month12.day1229;

import java.util.Arrays;

/**
 * @author lizi
 * @date 2022/12/29 16:24
 * @description 410. 分割数组的最大值
 **/
public class Five1229 {
    public static void main(String[] args) {
        splitArray(new int[]{2,16,14,15}, 2);
    }
    public static int splitArray(int[] nums, int k) {
        int left = Arrays.stream(nums).max().getAsInt(), right = Arrays.stream(nums).sum();
        while (left < right){
            int mid = left + ((right - left) >> 1);
            int count = 1;
            int sum = 0;
            for (int n : nums){
                if(sum + n <= mid){
                    sum += n;
                }else {
                    count++ ;
                    sum = n;
                }
            }
            if(count > k){
                left = mid + 1;
            }else {
                right = mid;
            }
        }
        return left;
    }
}

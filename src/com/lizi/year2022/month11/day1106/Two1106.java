package com.lizi.year2022.month11.day1106;

import java.util.HashSet;
import java.util.Set;

/**
 * @author lizi
 * @date 2022/11/6 10:29
 * @description TODO
 **/
public class Two1106 {
    public static void main(String[] args) {
        maximumSubarraySum(new int[]{14,2,11,19,6,18,8,20,11}, 6);
    }
    public static long maximumSubarraySum(int[] nums, int k) {
        long ans = 0L;
        int len = nums.length;
        Set<Integer> set = new HashSet<>();
        if(len < k){
            return ans;
        }
        long temp = 0L;
        for (int i = 0; i < len; i++) {
            temp += nums[i];
            final boolean add = set.add(nums[i]);
            if(!add){
                set.clear();
                i-- ;
                temp = 0L;
            }else {
                if(set.size() == k){
                    if(temp >= ans){
                        ans = temp;
                    }
                    int idx = i - k + 1;
                    temp -= nums[idx];
                    set.remove(nums[idx]);
                }

            }
        }
        return ans;
    }
}

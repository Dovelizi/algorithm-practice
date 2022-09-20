package com.lizi.year2022.month8.day0804;

import java.util.Arrays;
import java.util.Collections;
import java.util.LinkedList;
import java.util.List;

/**
 * @author lizi
 * @description TODO
 * @date 2022/8/4 08:49
 **/
public class One0804 {
    public static void main(String[] args) {
        minSubsequence(new int[]{8,8});
    }
    public static List<Integer> minSubsequence(int[] nums) {
        int sum = Arrays.stream(nums).sum();
        List<Integer> ans = new LinkedList<>();
        Arrays.sort(nums);
        int len = nums.length;
        if(len < 2){
            return Collections.singletonList(nums[len - 1]);
        }
        int total = 0;
        for (int i = len - 1; i >= 0; i--) {
            total += nums[i];
            ans.add(nums[i]);
            if( total > sum - total ){
                break;
            }
        }
        return ans;
    }
}

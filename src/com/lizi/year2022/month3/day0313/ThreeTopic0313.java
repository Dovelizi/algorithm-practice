package com.lizi.year2022.month3.day0313;

import java.util.Stack;

/**
 * @author lizi
 * @description TODO
 * @date 2022/3/13 10:25
 **/
public class ThreeTopic0313 {
    public int maximumTop(int[] nums, int k) {
        if(nums.length == 1){
            return -1;
        }
        Stack<Integer> stack = new Stack<>();
        for(int n : nums){
            stack.push(n);
        }

        return 0;
    }
}

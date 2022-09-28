package com.lizi.year2022.month9.day0926;

import java.util.Arrays;
import java.util.Stack;

/**
 * @author lizi
 * @date 2022/9/26 09:26
 * @description TODO
 **/
public class One0926 {
    public static void main(String[] args) {
        missingTwo(new int[]{2,4});
    }
    public static int[] missingTwo(int[] nums) {
        Arrays.sort(nums);
        Stack<Integer> stack = new Stack<>();
        int len = nums.length;
        int count = 1;
        for (int i = 0; i < len;) {
            if(stack.size() == 2){
                break;
            }
            if(nums[i] != count){
                stack.add(count);
            }else {
                i++ ;
            }
            count++ ;
        }
        while (stack.size() < 2){
            stack.add(count++);
        }
        return new int[]{stack.pop(), stack.pop()};
    }
}

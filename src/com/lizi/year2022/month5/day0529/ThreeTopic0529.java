package com.lizi.year2022.month5.day0529;

import java.util.*;

/**
 * @author lizi
 * @description TODO
 * @date 2022/5/29 10:25
 **/
public class ThreeTopic0529 {
    public static void main(String[] args) {
        totalSteps(new int[]{5,3,4,4,7,3,6,11,8,5,11});
    }
    public static int totalSteps(int[] nums) {
        int ret = 0;
        List<int[]> stack = new ArrayList<>();
        for (int i = 0;i < nums.length;i++) {
            int p = 0;
            while (stack.size() > 0 && stack.get(stack.size() - 1)[0] <= nums[i]) {
                p = Math.max(p, stack.get(stack.size() - 1)[1]);
                stack.remove(stack.size() - 1);
            }
            if (stack.size() != 0) {
                p++;
            }
            ret = Math.max(ret, p);
            stack.add(new int[]{nums[i], p});
        }
        return ret;
        }
}

// 5,3,4,4,7,3,6,11,8,5,11
package com.lizi.year2022.month10.day1016;

import java.util.HashSet;
import java.util.Set;

/**
 * @author lizi
 * @date 2022/10/16 10:48
 * @description TODO
 **/
public class Two1016 {
    public static void main(String[] args) {
        countDistinctIntegers(new int[]{1,13,10,12,31});
    }
    public static int countDistinctIntegers(int[] nums) {
        Set<Integer> setNum = new HashSet<>();
        int len = nums.length;
        for (int i = 0; i < len; i++) {
            int n = nums[i];
            StringBuilder stringBuilder = new StringBuilder(String.valueOf(n));
            int tranNum = Integer.parseInt(stringBuilder.reverse().toString());
            setNum.add(n);
            setNum.add(tranNum);
        }
        return setNum.size();
    }
}

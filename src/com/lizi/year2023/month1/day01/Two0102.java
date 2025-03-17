package com.lizi.year2023.month1.day01;

import java.util.HashSet;

/**
 * @author lizi
 * @date 2023/1/2 18:23
 * @description 6279. 数组乘积中的不同质因数数目
 **/
public class Two0102 {
    public int distinctPrimeFactors(int[] nums) {
        HashSet<Integer> set = new HashSet<>();
        for (int num : nums) {
            for (int i = 2; num > 1; i++) {
                for (; num % i == 0; num /= i) {
                    set.add(i);
                }
            }
        }
        return set.size();
    }
}

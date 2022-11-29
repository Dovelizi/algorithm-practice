package com.lizi.year2022.month10.day1018;

import java.util.HashMap;
import java.util.Map;

/**
 * @author lizi
 * @date 2022/10/18 08:44
 * @description 902. 最大为 N 的数字组合
 **/
public class One1018 {
    public static void main(String[] args) {
        atMostNGivenDigitSet(new String[]{"1","3","5","7"}, 100);
    }
    public static int atMostNGivenDigitSet(String[] digits, int n) {
        int ans = 0;
        int count = 0;
        Map<String, Integer> map = new HashMap<>(16);
        for (String str : digits){
            map.put(str, 1);
        }
        return n - count;
    }
}

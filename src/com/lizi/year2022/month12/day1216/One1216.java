package com.lizi.year2022.month12.day1216;

import java.util.Arrays;
import java.util.stream.Collectors;

/**
 * @author lizi
 * @date 2022/12/15 19:56
 * @description 1945. 字符串转化后的各位数字之和
 **/
public class One1216 {
    public static void main(String[] args) {
        getLucky("leetcode", 3);
    }
    public static int getLucky(String s, int k) {
        String num = Arrays.stream(s.split(""))
            .map(item -> String.valueOf(item.toCharArray()[0] - 'a' + 1))
            .collect(Collectors.joining());
        for (int i = 0; i < k; i++) {
            num = Arrays.stream(num.split(""))
                    .map(Integer::parseInt)
                    .reduce(0, Integer::sum).toString();
        }
        return Integer.parseInt(num);
    }
}

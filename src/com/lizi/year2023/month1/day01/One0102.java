package com.lizi.year2023.month1.day01;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

/**
 * @author lizi
 * @date 2023/1/2 18:10
 * @description 6278. 统计能整除数字的位数
 **/
public class One0102 {
    public int countDigits(int num) {
        int ans = 0;
        List<Integer> collect = Arrays.stream(String.valueOf(num).split(""))
                .map(item -> item.toCharArray()[0] - '0')
                .collect(Collectors.toList());

        for (Integer n : collect) {
            if(num % n == 0){
                ans++ ;
            }
        }
        return ans;
    }
}

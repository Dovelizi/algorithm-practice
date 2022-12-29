package com.lizi.year2022.month12.day1216;

import java.util.Arrays;

/**
 * @author lizi
 * @date 2022/12/16 08:58
 * @description 1785. 构成特定和需要添加的最少元素
 **/
public class Two1216 {
    public static void main(String[] args) {
        String str = "sfdf   sdf sdf    sdf  + sdf   sdfs  dfd  ";
        str.split("\\s+");
    }
    public int minElements(int[] nums, int limit, int goal) {
        int sum = Arrays.stream(nums).sum();
        return (Math.abs(sum - goal) + limit + 1) / limit;
    }
}

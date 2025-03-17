package com.lizi.year2023.month1.day08;

/**
 * @author lizi
 * @date 2023/1/8 10:28
 * @description 6283. 正整数和负整数的最大计数
 **/
public class One0108 {
    public int maximumCount(int[] nums) {
        int len = nums.length;
        int count = 0;
        for(int n : nums){
            if(n < 0){
                count++ ;
            } else if (n == 0) {
                len-- ;
            }
        }
        return len / 2 > count ? len - count : count;
    }
}

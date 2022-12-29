package com.lizi.year2022.month12.day1203;

/**
 * @author lizi
 * @date 2022/12/3 12:24
 * @description 1796. 字符串中第二大的数字
 **/
public class One1203 {
    public int secondHighest(String s) {
        int max = Integer.MIN_VALUE;
        int secondMax = -1;
        for (char ch : s.toCharArray()){
            if(ch - 'a' < 0){
                int temp = ch - '0';
                if(temp > max){
                    secondMax = max;
                    max = temp;
                } else if (temp < max && temp > secondMax) {
                    secondMax = temp;
                }
            }
        }
        return secondMax;
    }
}

package com.lizi.year2023.month1.day11;

/**
 * @author lizi
 * @date 2023/1/11 08:59
 * @description 2283. 判断一个数的数字计数是否等于数位的值
 **/
public class One0111 {
    public boolean digitCount(String num) {
        int len = num.length();
        int[] hash = new int[len];
        char[] arr = num.toCharArray();
        for(char ch : arr){
            hash[ch - '0']++;
        }
        for(int i = 0; i < len; i++){
            int idx = num.charAt(i) - '0';
            if(hash[i] != idx){
                return false;
            }
        }
        return true;
    }
}

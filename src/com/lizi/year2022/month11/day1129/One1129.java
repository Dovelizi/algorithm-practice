package com.lizi.year2022.month11.day1129;

/**
 * @author lizi
 * @date 2022/11/29 19:05
 * @description 1758. 生成交替二进制字符串的最少操作数
 **/
public class One1129 {
    public int minOperations(String s) {
        int minZero = 0, minOne = 0;
        for (int i = 0; i < s.length(); i++) {
            if(((i + 1) & 1) == 1){
                if(s.charAt(i) == '0'){
                    minOne++ ;
                }else {
                    minZero++ ;
                }
            }else {
                if(s.charAt(i) == '1'){
                    minOne++ ;
                }else {
                    minZero++ ;
                }
            }
        }
        return Math.min(minOne, minZero);
    }
}

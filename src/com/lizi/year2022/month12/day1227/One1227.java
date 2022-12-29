package com.lizi.year2022.month12.day1227;

/**
 * @author lizi
 * @date 2022/12/27 20:21
 * @description 2027. 转换字符串的最少操作次数
 **/
public class One1227 {
    public int minimumMoves(String s) {
        int ans = 0;
        int len = s.length();
        int idx = 0;
        while (idx < len){
            if(s.charAt(idx) == 'X'){
                idx += 3;
            }
            ans++ ;
        }
        return ans;
    }
}

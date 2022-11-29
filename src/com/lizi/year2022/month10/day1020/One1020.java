package com.lizi.year2022.month10.day1020;

/**
 * @author lizi
 * @date 2022/10/20 09:11
 * @description 779. 第K个语法符号
 **/
public class One1020 {
    public static void main(String[] args) {
        kthGrammar(3,2);
    }
    public static int kthGrammar(int n, int k) {
        String str1 = "01";
        String str2 = "10";
        String begin = "0";
        for (int i = 0; i < n; i++) {
            String s1 = "";
            String s2 = "";
            if(begin.contains("0")){
                s1 = begin.replace("0", str1);
            }
            if(begin.contains("1")){
                s2 = begin.replace("1", str2);
            }
           begin = s1 + s2;
        }
        return begin.charAt(k - 1);
    }
}

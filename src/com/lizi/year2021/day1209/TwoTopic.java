package com.lizi.year2021.day1209;

import java.math.BigDecimal;

/**
 * @author lizi
 * @description TODO
 * @date 2021/12/9 16:44
 **/
public class TwoTopic {
    public static void main(String[] args) {
        String str = "sdfEFDF43534DDFD";
        str.toLowerCase();
        myAtoi("words and 987");
    }
    public static int myAtoi(String s) {
        StringBuilder sb = new StringBuilder();
        long count = 0L;
        BigDecimal bigDecimal = new BigDecimal("0");
        for(int i = 0; i < s.length();i++){
            int num = s.charAt(i) - '0';
            int idx = i;
            if(s.charAt(i) == '-'|| s.charAt(i) == '+' || num >= 0 && num <= 9){
                if(s.charAt(idx) != '+'){
                    sb.append(s.charAt(i));
                }
                while(idx++ < s.length() - 1 && s.charAt(idx) - '0' >= 0 && s.charAt(idx) - '0' < 10){
                    num = s.charAt(idx) - '0';
                    if(num < 10 && num >= 0){
                        sb.append(s.charAt(idx));
                    }else{
                        break;
                    }
                }
                break;
            }else if(s.charAt(i) == ' '){
                continue;
            }else{
                break;
            }
        }

        if(sb.length() == 0 || (sb.length() == 1 && sb.charAt(0) == '-' || sb.charAt(0) == '+')){
            count = 0;
        }else{
            bigDecimal = new BigDecimal(sb.toString());
        }
        if(bigDecimal.compareTo(new BigDecimal("-2147483648")) <= 0){
            count = Integer.MIN_VALUE;
        }else if(bigDecimal.compareTo(new BigDecimal("2147483647")) >= 0) {
            count = Integer.MAX_VALUE;
        }else{
            count = bigDecimal.intValue();
        }
        return (int) count;
    }
}

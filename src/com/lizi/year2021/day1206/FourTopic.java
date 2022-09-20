package com.lizi.year2021.day1206;

/**
 * @author lizi
 * @description TODO
 * @date 2021/12/6 23:14
 **/
public class FourTopic {
    public static void main(String[] args) {
        reverse(-2147483648);
    }
    public static int reverse(int x) {
        long positiveX  = x;
        positiveX = Math.abs(positiveX);
        long result = 0L;
        String str = String.valueOf(positiveX);
        StringBuilder sb = new StringBuilder();
        for(int i = str.length() - 1; i >= 0; i--){
            sb.append(str.charAt(i));
        }
        long resultNum = Long.valueOf(sb.toString());
        if(resultNum < Integer.MAX_VALUE && resultNum > Integer.MIN_VALUE){
            result = x > 0 ? (int) resultNum : (int)(-resultNum);
        }
        return (int) result;
    }
}

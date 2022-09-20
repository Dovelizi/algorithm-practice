package com.lizi.year2022.month5.day0508;

/**
 * @author lizi
 * @description TODO
 * @date 2022/5/8 10:30
 **/
public class OneTopic0508 {
    public static void main(String[] args) {
        largestGoodInteger("222");
    }
    public static String largestGoodInteger(String num) {
        String ans  = "";
        for (int i = 0; i <= num.length() - 3; i++) {
            String temp = num.substring(i,i+3);
           if(isSame(temp) && temp.compareTo(ans) > 0){
               ans = temp;
           }
        }
        return ans;
    }
    public static boolean isSame(String str){
        return str.charAt(0) == str.charAt(1) && str.charAt(1) == str.charAt(2);
    }
}

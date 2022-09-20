package com.lizi.year2022.month3.day0325;

/**
 * @author lizi
 * @description TODO
 * @date 2022/3/25 21:08
 **/
public class Three0335 {
    public static void main(String[] args) {
        addStrings("128","79");
    }
    public static String addStrings(String num1, String num2) {
        int carry = 0;
        StringBuilder ans = new StringBuilder();
        int len1 = num1.length() - 1;
        int len2 = num2.length() - 1;
        while(len1 >= 0 || len2 >= 0){
            int temp = 0;
            if(len1 >= 0 && len2 >= 0){
                temp = Integer.parseInt(String.valueOf(num1.charAt(len1))) + Integer.parseInt(String.valueOf(num2.charAt(len2))) + carry;
                len1-- ;
                len2-- ;
            }else if(len1 >= 0){
                temp = Integer.parseInt(String.valueOf(num1.charAt(len1))) + carry;
                len1-- ;
            }else{
                temp = Integer.parseInt(String.valueOf(num2.charAt(len2))) + carry;
                len2-- ;
            }
            carry = temp / 10;
            ans.insert(0,temp % 10);
        }
        return ans.toString();
    }
}

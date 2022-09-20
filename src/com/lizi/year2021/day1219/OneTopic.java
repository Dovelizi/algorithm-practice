package com.lizi.year2021.day1219;

/**
 * @author lizi
 * @description TODO
 * @date 2021/12/19 10:32
 **/
public class OneTopic {

    public static void main(String[] args) {
        firstPalindrome(new String[]{"notapalindrome","racecar"});
    }

    public static String firstPalindrome(String[] words) {
        String resStr = "";
        for(String s : words){
            if(isPalindrome(s)){
                resStr = s;
                break;
            }
        }
        return resStr;
    }
    public static boolean isPalindrome(String str){
        int pre = 0;
        int next = str.length() - 1;
        while(pre <= next){
            if(str.charAt(pre) != str.charAt(next)){
                return false;
            }
            pre++ ;
            next-- ;
        }
        return true;
    }
}

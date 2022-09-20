package com.lizi.year2022.month9.day0904;

/**
 * @author lizi
 * @date 2022/9/3 22:30
 * @description TODO
 **/
public class Two0904 {
    public static void main(String[] args) {
        isStrictlyPalindromic(4);
    }
    public static boolean isStrictlyPalindromic(int n) {
        for (int i = 2; i < n - 1; i++){
            if(!isPalindromic(Integer.toUnsignedString(n, i))){
                return false;
            }
        }
       return true;
    }
    public static boolean isPalindromic(String str){
        int len = str.length();
        int pre = 0, next = len - 1;
        while (pre < len / 2){
            if(str.charAt(pre) != str.charAt(next)){
                return false;
            }
            pre++ ;
            next-- ;
        }
        return true;
    }
}

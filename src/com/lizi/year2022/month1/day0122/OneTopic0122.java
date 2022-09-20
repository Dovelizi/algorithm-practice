package com.lizi.year2022.month1.day0122;

/**
 * @author lizi
 * @description TODO
 * @date 2022/1/22 20:58
 **/
public class OneTopic0122 {
    public static void main(String[] args) {
        //removePalindromeSub("babababbababab");
        palindromeSub("aba");
    }
    public static int removePalindromeSub(String s) {
        if(palindromeSub(s)){
            return 1;
        }
        return 2;
    }
    public static boolean palindromeSub(String sub){
        int pre = 0;
        int next = sub.length() - 1;
        while(pre < next && sub.charAt(pre) == sub.charAt(next)){
            pre++ ;
            next-- ;
        }
        return Math.abs(pre - next) <= 1;
    }
}

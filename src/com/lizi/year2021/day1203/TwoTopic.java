package com.lizi.year2021.day1203;

/**
 * @author lizi
 * @description TODO
 * @date 2021/12/3 23:12
 **/
public class TwoTopic {
    public static void main(String[] args) {
        firstUniqChar("sdfs");
    }
    public static char firstUniqChar(String s) {
        int pre = 0;
        int len = s.length();
        int next = pre + 1;
        char result = ' ';
        if(len == 1){
            return s.charAt(0);
        }
        while(pre < len){
            char chPre = s.charAt(pre);
            while(next < len){
                char chNext = s.charAt(next);
                if(chPre == chNext){
                    s = s.replace(String.valueOf(chPre),"");
                    pre = 0 ;
                    break;
                }
                next++ ;
            }
            if(next == len){
                result  = chPre;
                break;
            }
            next = pre + 1;
            len = s.length();
        }
        return result;
    }
}

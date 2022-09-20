package com.lizi.year2022.month2.day0223;

/**
 * @author lizi
 * @description TODO
 * @date 2022/2/23 09:20
 **/
public class OneTopic0223 {
    public static void main(String[] args) {
        reverseOnlyLetters("a-bC-dEf-ghIj");
    }
    public static String reverseOnlyLetters(String s) {
        char[] arr = s.toCharArray();
        int len = arr.length;
        int pre = 0, next = len - 1;
        while(pre <= next){
            if(checkWord(arr[pre]) && checkWord(arr[next])){
                char temp = arr[pre];
                arr[pre] = arr[next];
                arr[next] = temp;
                pre++ ;
                next-- ;
            }else if (!checkWord(arr[pre])){
                pre++ ;
            }else if(!checkWord(arr[next])){
                next-- ;
            }
        }
        return String.valueOf(arr);
    }

    public static boolean checkWord(char ch){
        return (ch >= 65 && ch <= 90) || (ch >= 97 && ch <= 122) ;
    }
}

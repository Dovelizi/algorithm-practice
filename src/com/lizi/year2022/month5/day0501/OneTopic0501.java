package com.lizi.year2022.month5.day0501;

/**
 * @author lizi
 * @description TODO
 * @date 2022/5/1 10:28
 **/
public class OneTopic0501 {
    public static void main(String[] args) {
        removeDigit("133235",
                '3');
    }
    public static String removeDigit(String number, char digit) {
        StringBuilder sb = new StringBuilder();
        int first = 0;
        int last = 0;
        int ans = 0;
        for (int i = 0; i < number.length() ; i++) {
            if(number.charAt(i) == digit){
              first = i;
              break;
            }
        }
        for (int i = number.length() - 1; i >= 0 ; i--) {
            if(number.charAt(i) == digit){
                last = i;
                break;
            }
        }
        if(last - first <= 1){
            ans = first;
        }else{
            if(number.charAt(first+1) < digit){
                ans = last;
            }
        }
        if(ans == 0){
            ans = first;
        }
        sb.append(number, 0, ans);
        sb.append(number.substring(ans+1));
        return sb.toString();
    }
}


// 1 2 3 4 5 6 7 7 2 3

// 13235
//13325
//13235
// 133235
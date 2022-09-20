package com.lizi.year2022.month6.day0619;

/**
 * @author lizi
 * @description TODO
 * @date 2022/6/19 10:33
 **/
public class OneTopic0619 {
    public static void main(String[] args) {
        greatestLetter("AAAAA");
    }
    public static String greatestLetter(String s) {
        String ans = "";
        int[] arr = new int[122];
        for (char ch : s.toCharArray()){
            arr[ch] ++ ;
        }
        for (char ch : s.toCharArray()){
            if (ch <= 90 && arr[ch+32] > 0) {
                ans = String.valueOf(ch).compareTo(ans) > 0 ? String.valueOf(ch) : ans;
            }
        }
        return ans;
    }
}

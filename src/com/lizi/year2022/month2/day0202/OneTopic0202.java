package com.lizi.year2022.month2.day0202;

import java.util.HashSet;
import java.util.Set;

/**
 * @author lizi
 * @description TODO
 * @date 2022/2/2 16:52
 **/
public class OneTopic0202 {
    public static void main(String[] args) {
        longestNiceSubstring("aaaaaAAAAA");
    }
    public static String longestNiceSubstring(String s) {
        int pre = 0, width = s.length(), next = pre + width;
        int len = s.length();
        while(width > 0){
            for(int i = 0; i <= len - width; i++){
                pre = i;
                next = i + width;
                String str = s.substring(pre,next);
                if(vaildString(str)){
                    return str;
                }
            }
            width--;
        }
        return "";
    }
    public static boolean vaildString(String s){
        Set<Character> set = new HashSet<>();
        for(char ch : s.toCharArray()){
            set.add(ch);
        }
        int[] zmArr = new int[26];
        for(char ch : set){
            if(ch >= 97 && ch <= 122){
                zmArr[ch - 97]++;
            }else{
                zmArr[ch - 65]--;
            }
        }
        for(int n : zmArr){
            if(n != 0){
                return false;
            }
        }
        return true;
    }
}

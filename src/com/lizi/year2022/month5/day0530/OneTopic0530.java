package com.lizi.year2022.month5.day0530;

import java.util.Arrays;
import java.util.List;

/**
 * @author lizi
 * @description TODO
 * @date 2022/5/30 10:55
 **/
public class OneTopic0530 {
    public static void main(String[] args) {
        validIPAddress("192.0.0.1");
    }
    public static String validIPAddress(String queryIP) {
        String ans = "Neither";
        if(queryIP.length() == 0 || queryIP.charAt(0) == '.' || queryIP.charAt(0) == ':' || queryIP.charAt(queryIP.length() - 1) == '.' ||
                queryIP.charAt(queryIP.length() - 1) == ':'){
            return ans;
        }
        if (queryIP.contains(".")){
            String[] split = queryIP.split("\\.");
            for(String s : split){
                int temp = 0;
                try {
                    temp = Integer.parseInt(s);
                }catch (Exception e){
                    return ans;
                }
                if(split.length != 4 || temp < 0 || temp > 255 ||(s.length() > 1 && s.charAt(0) == '0')){
                   return ans;
                }
            }
            ans = "IPv4";
        }else{
            String[] split = queryIP.split(":");
            for (String s : split){
                if(split.length != 8 || !validateStr(s)){
                    return ans;
                }
            }
            ans = "IPv6";
        }
        return ans;
    }
    public static boolean validateStr(String str){
        List<Character> list1 = Arrays.asList('0','1','2','3','4','5','6','7','8','9');
        List<Character> list2 = Arrays.asList('a','b','c','d','e','f');
        List<Character> list3 = Arrays.asList('A','B','C','D','E','F');
        if(str.length() < 1 || str.length() > 4){
            return false;
        }
        for(char ch : str.toCharArray()){
            if(!list1.contains(ch) && !list2.contains(ch) && !list3.contains(ch)){
                return false;
            }
        }
        return true;
    }
}

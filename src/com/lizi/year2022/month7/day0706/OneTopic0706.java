package com.lizi.year2022.month7.day0706;

import java.util.*;

/**
 * @author lizi
 * @description TODO
 * @date 2022/7/7 09:13
 **/
public class OneTopic0706 {
    public static void main(String[] args) {
        replaceWords(Arrays.asList("cat","bat","rat"), "the cattle was rattled by the battery");
    }
    public static String replaceWords(List<String> dictionary, String sentence) {
        String[] strArr = sentence.split(" ");
        Map<String, String> map = new HashMap<>();
        StringBuilder ans = new StringBuilder();
        for (String s : strArr) {
            if(Objects.nonNull(verifyStr(dictionary, s))){
                String str =( Objects.nonNull(map.get(s)) && map.get(s).length() < verifyStr(dictionary, s).length()) ? map.get(s) :
                        verifyStr(dictionary, s);
                map.put(s, str);
            }
        }
        for (int i = 0; i < strArr.length; i++) {
            if(Objects.nonNull(map.get(strArr[i]))){
                ans.append(map.get(strArr[i]) + " ");
            }else{
                ans.append(strArr[i] + " ");
            }
        }
        return ans.substring(0,ans.length() - 1);
    }
    public static String verifyStr(List<String> dictionary, String patStr){
       int len = patStr.length();
       int width = 1;
       while (width <= len){
           if(dictionary.contains(patStr.substring(0, width))){
               return patStr.substring(0, width);
           }
           width++ ;
       }
       return null;
    }
}

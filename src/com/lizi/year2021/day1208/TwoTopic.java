package com.lizi.year2021.day1208;

import java.util.*;

/**
 * @author lizi
 * @description TODO
 * @date 2021/12/8 15:38
 **/
public class TwoTopic {
    public static void main(String[] args) {
        lengthOfLongestSubstring("pwwkew");
    }
    public static int lengthOfLongestSubstring(String s) {
        int len = s.length();
        List<Character> list = new ArrayList<>();
        int maxLength = 0;
        for(int i = 0; i < len; i++){
            char ch = s.charAt(i);
            if(list.contains(ch)){
                maxLength = Math.max(list.size(),maxLength);
                Iterator iterator = list.iterator();
                while(iterator.hasNext()){
                    char tempCh = (char) iterator.next();
                    iterator.remove();
                    if (tempCh == ch){
                        break;
                    }
                }
            }
            list.add(ch);
        }
        return Math.max(list.size(), maxLength);
    }
}

package com.lizi.year2022.month10.day1001;

import java.util.HashSet;
import java.util.Set;

/**
 * @author lizi
 * @date 2022/10/2 00:33
 * @description TODO
 **/
public class One2_1001 {
    public static void main(String[] args) {
        equalFrequency("aabb");
    }
    public static boolean equalFrequency(String word) {
        for (int i = 0; i < word.length(); i++) {
            int[] words = new int[26];
            StringBuilder sb = new StringBuilder(word.substring(0, i) + word.substring(i + 1));
            for (char ch : sb.toString().toCharArray()){
                words[ch - 'a']++ ;
            }
            if(check(words)){
                return true;
            }
        }
        return false;
    }
    public static boolean check(int[] words){
        Set<Integer> set = new HashSet<>();
        for (int i = 0; i < words.length; i++) {
            if(words[i] != 0){
                set.add(words[i]);
            }
        }
        return set.size() == 1;
    }
}

package com.lizi.year2022.month10.day1011;

import java.util.ArrayList;
import java.util.List;

/**
 * @author lizi
 * @date 2022/10/11 08:46
 * @description 1790. 仅执行一次字符串交换能否使两个字符串相等
 **/
public class One1011 {
    public static void main(String[] args) {
        areAlmostEqual("bank", "kanb");
    }
    public static boolean areAlmostEqual(String s1, String s2) {
        int len = s1.length();
        List<Integer> list = new ArrayList<>();
        int[] hash = new int[26];
        for (int i = 0; i < len; i++) {
            if(list.size() > 2){
                return false;
            }
            if(s1.charAt(i) != s2.charAt(i)){
                list.add(i);
            }
            hash[s1.charAt(i) - 'a']++ ;
            hash[s2.charAt(i) - 'a']-- ;
        }

        for (int n : hash){
            if(n != 0){
                return false;
            }
        }
        return true;
    }
}

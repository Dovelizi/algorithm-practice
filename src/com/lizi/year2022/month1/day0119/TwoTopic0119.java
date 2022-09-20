package com.lizi.year2022.month1.day0119;

import java.util.LinkedList;
import java.util.List;

/**
 * @author lizi
 * @description 438. 找到字符串中所有字母异位词
 * @date 2022/1/19 10:32
 **/
public class TwoTopic0119 {
    public static void main(String[] args) {
        findAnagrams("cbaebabacd","abc");
    }
    public static List<Integer> findAnagrams(String s, String p) {
        int findWid = p.length();
        List<Integer> resList = new LinkedList<>();
        for (int i = 0; i < s.length() - findWid; i++) {
           if(equalsString(p,s.substring(i,i+findWid))){
               resList.add(i);
           }
        }
        return resList;
    }
    public static boolean equalsString(String s1, String s2){
        int[] arrTar = new int[26];
        int[] arrPar = new int[26];
        for (int i = 0; i < s1.length(); i++) {
            arrTar[s1.charAt(i) - 97]++;
            arrPar[s2.charAt(i) - 97]++;
        }
        for (int i = 0; i < arrPar.length; i++) {
            if(arrPar[i] != arrTar[i]){
                return false;
            }
        }
        return true;
    }
}

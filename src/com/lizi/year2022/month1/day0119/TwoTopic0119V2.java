package com.lizi.year2022.month1.day0119;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/**
 * @author lizi
 * @description TODO
 * @date 2022/1/19 11:30
 **/
public class TwoTopic0119V2 {
    public static void main(String[] args) {
        findAnagrams("cbaababacd","abb");
    }
    public static List<Integer> findAnagrams(String s, String p) {
        List<Integer> resList = new ArrayList<>();
        int len = p.length();
        int[] arrPar = new int[26];
        for (char ch : p.toCharArray()){
            arrPar[ch - 97]++;
        }
        for (int i = 0; i < s.length() - len; i++) {
            int pre = i;
            int next = i + len;
            boolean flag = true;
            int[] arrTar = Arrays.copyOf(arrPar, arrPar.length);
            while (pre < next){
                arrTar[s.charAt(pre) - 97]--;
                pre++;
            }
            for (int num : arrTar){
                if(num != 0){
                    flag = false;
                    break;
                }
            }
            if(flag){
                resList.add(i);
            }
        }
        return resList;
    }
}

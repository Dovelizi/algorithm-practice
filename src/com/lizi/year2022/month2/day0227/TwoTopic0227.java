package com.lizi.year2022.month2.day0227;

/**
 * @author lizi
 * @description TODO
 * @date 2022/2/27 10:39
 **/
public class TwoTopic0227 {
    public static void main(String[] args) {
        minSteps("leetcode","coats");
    }
    public static int minSteps(String s, String t) {
        int[] wordS = new int[26];
        int resNum = 0;
        for(char ch : s.toCharArray()){
            wordS[ch - 97]++ ;
        }
        for(char ch : s.toCharArray()){
            wordS[ch - 97]-- ;
        }
        for(int n : wordS){
            resNum += Math.abs(n);
        }
        return resNum;
    }
}

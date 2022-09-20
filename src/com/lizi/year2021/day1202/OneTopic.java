package com.lizi.year2021.day1202;

import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

/**
 * @author lizi
 * @description TODO
 * @date 2021/12/2 08:50
 **/
public class OneTopic {
    public static void main(String[] args) {
        findRelativeRanks(new int[]{9,2,1,4,3,6});
    }
    public static String[] findRelativeRanks(int[] score) {
        int len = score.length;
        String[] scoreRank = new String[len];
        Map<Integer,Integer> scoreMap = new HashMap<>();
        String first = "Gold Medal";
        String second = "Silver Medal";
        String third = "Bronze Medal";
        for(int i = 0; i < len; i++){
            scoreMap.put(score[i],i);
        }
        Arrays.sort(score);
        for (int i = len - 1; i >= 0; i--) {
            if (i == len - 1){
                scoreRank[scoreMap.get(score[i])] = first;
            }else if (i == len - 2){
                scoreRank[scoreMap.get(score[i])] = second;
            }else if (i == len - 3){
                scoreRank[scoreMap.get(score[i])] = third;
            }else {
                scoreRank[scoreMap.get(score[i])] = (len - i) + "";
            }
        }
        return scoreRank;
    }
}

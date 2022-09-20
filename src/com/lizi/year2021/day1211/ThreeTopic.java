package com.lizi.year2021.day1211;

import java.util.*;

/**
 * @author lizi
 * @description TODO
 * @date 2021/12/11 20:36
 **/
public class ThreeTopic {
    TreeMap<Integer,Integer> bigScore = new TreeMap<>();
    public ThreeTopic(int[] persons, int[] times) {
        int peo = -1;
        int beforeMaxIdx = 0;
        int[] score = new int[persons.length + 1];
        for(int i = 0; i < times.length; i++){
            score[persons[i]]++;
            beforeMaxIdx = score[persons[i]] >= score[beforeMaxIdx] ? persons[i] : beforeMaxIdx;
            if(score[persons[i]] >= score[beforeMaxIdx]){
                peo = persons[i];
            }
            bigScore.put(times[i],peo);
        }
    }

    public int q(int t) {
//        int winPeople = 0;
//        for (Map.Entry<Integer,Integer> map : bigScore.entrySet()){
//            if(t <  map.getKey()){
//                break;
//            }
//            winPeople = map.getValue();
//        }
//        return winPeople;
        return bigScore.floorEntry(t).getValue();
    }
}

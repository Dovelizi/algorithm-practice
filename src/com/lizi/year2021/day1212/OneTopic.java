package com.lizi.year2021.day1212;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * @author lizi
 * @description TODO
 * @date 2021/12/12 10:39
 **/
public class OneTopic {
    public static void main(String[] args) {
        countPoints("B0B6G0R6R0R6G9");

    }
    public static int countPoints(String rings) {
        Map<Integer,List<Character>> map = new HashMap<>();
        int count = 0;
        for(int i = 1; i < rings.length(); i+=2){
            int rank = rings.charAt(i) - '0';
            char ch = rings.charAt(i-1);
            List<Character> list = map.get(rank) == null ? new ArrayList<>() : map.get(rank);
            if(list == null || !list.contains(ch)){
                 list.add(ch);
            }
            map.put(rank,list);
        }
        for(Map.Entry<Integer,List<Character>> entry : map.entrySet()){
            if(entry.getValue().size() == 3){
                count++ ;
            }
        }
        return count;
    }
}

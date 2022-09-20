package com.lizi.year2022.month9.day0905;

import java.util.HashMap;
import java.util.Map;

/**
 * @author lizi
 * @date 2022/9/4 10:29
 * @description TODO
 **/
public class One0905 {
    public static void main(String[] args) {
        checkDistances("abaccb", new int[]{1,3,0,5,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0});
    }
    public static boolean checkDistances(String s, int[] distance) {
        Map<Character, Integer> map = new HashMap<>();
        for (int i = 0; i < s.length(); i++) {
            char ch = s.charAt(i);
            boolean condition = map.getOrDefault(ch, i) == i;
            if(condition){
                map.put(ch, i);
            }else {
                map.put(ch, i - map.get(ch) - 1);
            }
        }
        for (Map.Entry<Character, Integer> entry : map.entrySet()){
            if(distance[entry.getKey() - 'a'] != entry.getValue()){
                return false;
            }
        }
        return true;
    }
}

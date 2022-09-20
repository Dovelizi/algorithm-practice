package com.lizi.year2022.month4.day0418;

import java.util.HashMap;
import java.util.Map;

/**
 * @author lizi
 * @description TODO
 * @date 2022/4/18 10:00
 **/
public class OneTopic0418 {
    public static void main(String[] args) {
        mostCommonWord("Bob hit a ball, the,hit,BALL flew far after it was hit.", new String[]{"hit"});
    }
    public static String mostCommonWord(String paragraph, String[] banned) {
        Map<String, Integer> map = new HashMap<>();
        Map<Integer, String> mapRes = new HashMap<>();
        int max = Integer.MIN_VALUE;
        // !?',;.
        String replace = paragraph.replace("!", " ")
                .replace("?", " ")
                .replace(",", " ")
                .replace(";", " ")
                .replace(".", " ")
                .replace("  ", " ")
                .toLowerCase();
        String[] s = replace.split(" ");
        for (String str : s){
            map.put(str, map.getOrDefault(str, 0) + 1);
        }
        for(String str : banned){
            map.remove(str);
        }
        for(Map.Entry<String, Integer> enMap : map.entrySet()){
            max = Math.max(enMap.getValue(), max);
            mapRes.put(enMap.getValue(), enMap.getKey());
        }
        return mapRes.get(max);
    }
}

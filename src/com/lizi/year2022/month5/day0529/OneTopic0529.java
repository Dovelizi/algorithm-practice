package com.lizi.year2022.month5.day0529;

import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

/**
 * @author lizi
 * @description TODO
 * @date 2022/5/29 10:25
 **/
public class OneTopic0529 {
    public static void main(String[] args) {
        rearrangeCharacters("bcda","d");
    }
    public static int rearrangeCharacters(String s, String target) {
        int ans = Integer.MAX_VALUE;
        Map<Character, Integer> map  = new HashMap<>();
        Map<Character, Integer> map1  = new HashMap<>();
        char[] chars1 = s.toCharArray();
        char[] chars2 = target.toCharArray();
        Arrays.sort(chars1);
        for (int i = 0; i < chars1.length; i++) {
            map.put(chars1[i], map.getOrDefault(chars1[i], 0) + 1);
        }
        for (int i = 0; i < chars2.length; i++) {
            map1.put(chars2[i], map1.getOrDefault(chars2[i], 0) + 1);
        }
        for (Map.Entry<Character, Integer> entry : map1.entrySet()){
            if(map.get(entry.getKey()) == null){
                return 0;
            }
            ans = Math.min(ans, map.get(entry.getKey()) / entry.getValue());
        }
        return ans;
    }
}

package com.lizi.year2021.day1224;

import java.util.HashMap;
import java.util.Map;

/**
 * @author lizi
 * @description TODO
 * @date 2021/12/24 17:29
 **/
public class TwoTopic {
    public static void main(String[] args) {
    }
    public boolean isNumber(String s) {
        s  = s.replace(" ","");
        Map<Character,Integer> map = new HashMap<>();
        Map<Character,Integer> mapTime = new HashMap<>();
        for (int i = 0; i < s.length(); i++) {
            char ch = s.charAt(i);
            int times = mapTime.get(ch) == null ? 0 : mapTime.get(ch);
            map.put(ch,i);
        }

        return false;
    }
}

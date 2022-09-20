package com.lizi.year2021.day1201;

import java.util.HashMap;
import java.util.Map;
import java.util.Map.Entry;

/**
 * @author lizi
 * @description TODO
 * @date 2021/12/1 08:35
 **/
public class OneTopic {
    public static void main(String[] args) {
        maxPower("dfsdfsdffffffffsdfsdfsdfsdfffffffsdfsdfffffffff");
    }
    public static int maxPower(String s) {
        Map<Character,Integer> map = new HashMap<>(64);
        int maxNum = Integer.MIN_VALUE;
        for (int i = 0; i < s.length(); i++) {
            for (int j = i; j < s.length(); j++) {
                char chi = s.charAt(i);
                char chj = s.charAt(j);
                if (chi != chj) {
                    i = j - 1;
                    break;
                }else {
                    int flag = j - i + 1;
                    int curNum = map.get(s.charAt(i)) == null ? 0 : map.get(s.charAt(i));
                    if (flag >= curNum){
                        map.put(s.charAt(i),flag);
                    }
                    continue;
                }
            }
        }
        for (Entry<Character,Integer> integerEntry : map.entrySet()){
            if (integerEntry.getValue() > maxNum){
                maxNum = integerEntry.getValue();
            }
        }
        return maxNum;
    }
}

package com.lizi.year2022.month10.day1001;

import java.util.*;

/**
 * @author lizi
 * @date 2022/10/1 22:30
 * @description 6212. 删除字符使频率相同
 **/
public class One1001 {
    public static void main(String[] args) {
        equalFrequency("aaaa");
    }
    public static boolean equalFrequency(String word) {
        int[] words = new int[26];
        Map<Integer, Integer> map  = new HashMap<>();
        Set<Integer> set = new HashSet<>();
        int maxTimes = Integer.MIN_VALUE;
        int minTime = Integer.MAX_VALUE;
        for (char ch : word.toCharArray()){
            words[ch - 'a']++ ;
        }
        int count = 0;
        for(int n : words){
            if(n != 0){
                map.put(n, map.getOrDefault(n, 0) + 1);
            }else {
                count++ ;
            }
        }
        if(count == 25){
            return true;
        }
        boolean flag = true;
        for (Map.Entry<Integer,Integer> entry : map.entrySet()){
            maxTimes = Math.max(maxTimes, entry.getKey());
            minTime = Math.min(minTime, entry.getKey());
        }
        if(map.get(maxTimes) == 1){
            if(maxTimes != 1){
                set.add(maxTimes - 1);
            }
            flag = false;
        }else{
            set.add(maxTimes);
        }
        if(flag && minTime == 1 && map.get(minTime) == 1){
            flag = false;
        }else{
            set.add(minTime);
        }
        return (!flag || set.contains(1)) && set.size() == 1;
    }
}

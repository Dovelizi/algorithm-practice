package com.lizi.year2022.month4.day0424;

import java.util.*;
import java.util.stream.Collectors;

/**
 * @author lizi
 * @description TODO
 * @date 2022/4/24 10:22
 **/
public class OneTopic0424 {
    public List<Integer> intersection(int[][] nums) {
        List<Integer> ans = new LinkedList<>();
        Map<Integer, Integer> map = new HashMap<>();
        int len = nums.length;
        for(int [] arr : nums){
            for(int n : arr){
                map.put(n,map.getOrDefault(n, 0) + 1);
            }
        }
        for (Map.Entry<Integer, Integer> entry : map.entrySet()){
            if(entry.getValue() >= len){
                ans.add(entry.getKey());
            }
        }

        return ans.stream().sorted(Comparator.comparing(Integer::intValue)).collect(Collectors.toList());
    }
}

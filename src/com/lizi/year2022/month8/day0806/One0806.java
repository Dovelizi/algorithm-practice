package com.lizi.year2022.month8.day0806;

import java.util.*;

/**
 * @author lizi
 * @description TODO
 * @date 2022/8/6 22:26
 **/
public class One0806 {
    public List<List<Integer>> mergeSimilarItems(int[][] items1, int[][] items2) {
        List<List<Integer>> ans = new LinkedList<>();
        Map<Integer, Integer> map = new HashMap<>();
        for (int[] arr : items1){
            int value = arr[0];
            int weight = arr[1];
            map.put(value, map.getOrDefault(value, 0) + weight);
        }
        for (int[] arr : items2){
            int value = arr[0];
            int weight = arr[1];
            map.put(value, map.getOrDefault(value, 0) + weight);
        }
        for (Map.Entry<Integer, Integer> entry : map.entrySet()){
            ans.add(Arrays.asList(entry.getKey(), entry.getValue()));
        }
        ans.sort((o1, o2) -> o1.get(0) - o2.get(0));
        return ans;
    }
}

package com.lizi.year2022.month7.day0705;

import java.util.*;

/**
 * @author lizi
 * @description TODO
 * @date 2022/7/6 09:18
 **/
public class OneTopic0705 {
    List<List<Integer>> ans = new ArrayList<>();
    public List<List<Integer>> combinationSum2(int[] candidates, int target) {
        Map<Integer, Integer> map = new HashMap<>();
        for (int n : candidates){
            map.put(n, map.getOrDefault(n,0) + 1);
        }
        for(int n : candidates){
            if(map.get(target - n) > 0){
                ans.add(Arrays.asList(target - n, n));
                combinationSum2(candidates, n);
                combinationSum2(candidates, target - n);
            }
        }
        return null;
    }
}

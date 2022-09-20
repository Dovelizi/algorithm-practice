package com.lizi.year2022.month9.day0912;


import javafx.util.Pair;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * @author lizi
 * @date 2022/9/12 21:28
 * @description TODO
 **/
public class Two0912 {
    public static void main(String[] args) {
        mostFrequentEven(new int[]{0,1,2,2,4,4,1});
    }
    public static int mostFrequentEven(int[] nums) {
        int ans = Integer.MAX_VALUE;
        Map<Integer, Integer> map = new HashMap<>();
        int len = nums.length;
        List<Pair<Integer, Integer>> list = new ArrayList<>();
        int max = 0;
        for (int i = 0; i < len; i++) {
            if((nums[i] & 1) == 0){
                map.put(nums[i], map.getOrDefault(nums[i], 0) + 1);
            }
        }
        for (Map.Entry<Integer, Integer> entry : map.entrySet()){
            list.add(new Pair<>(entry.getKey(), entry.getValue()));
        }
        list.sort((o1, o2) -> o2.getValue() - o1.getValue());
        for(Pair<Integer, Integer> pair : list){
            if(max <= pair.getValue()){
                ans = Math.min(pair.getKey(), ans);
                max = pair.getValue();
            }
        }
        return ans == Integer.MAX_VALUE ? -1 : ans;
    }
}

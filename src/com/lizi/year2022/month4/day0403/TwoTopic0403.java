package com.lizi.year2022.month4.day0403;

import java.util.*;
import java.util.stream.Collectors;

/**
 * @author lizi
 * @description TODO
 * @date 2022/4/3 10:57
 **/
public class TwoTopic0403 {
    public static void main(String[] args) {
        findWinners(new int[][]{{1,3},{2,3},{3,6},{5,6},{5,7},{4,5},{4,8},{4,9},{10,4},{10,9}});
    }
    public static List<List<Integer>> findWinners(int[][] matches) {
        Set<Integer> set = new HashSet<>();
        Set<Integer> winSet = new HashSet<>();
        Map<Integer, Integer> loserMap = new HashMap<>();
        List<List<Integer>> ans = new ArrayList<>();
        List<Integer> one = new ArrayList<>();
        List<Integer> zero = new ArrayList<>();
        for(int[] a : matches){
            int win = a[0];
            int loser = a[1];
            int lN = loserMap.get(loser) == null ? 1 : loserMap.get(loser) + 1;
            loserMap.put(loser, lN);
            set.add(win);
            set.add(loser);
        }
        for(Map.Entry<Integer, Integer> entry : loserMap.entrySet()){
            if(entry.getValue() == 1){
                one.add(entry.getKey());
            }
          winSet.add(entry.getKey());
        }
        for(int n : set){
            if(!winSet.contains(n)){
                zero.add(n);
            }
        }
        List<Integer> collect = zero.stream().sorted(Comparator.comparing(Integer::intValue)).collect(Collectors.toList());
        List<Integer> collect1 = one.stream().sorted(Comparator.comparing(Integer::intValue)).collect(Collectors.toList());
        ans.add(collect);
        ans.add(collect1);
        return ans;
    }
}

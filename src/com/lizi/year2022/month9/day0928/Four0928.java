package com.lizi.year2022.month9.day0928;

import java.util.*;

/**
 * @author lizi
 * @date 2022/9/28 14:45
 * @description 216. 组合总和 III
 **/
public class Four0928 {
    public static void main(String[] args) {
        combinationSum3(3,9);
    }
    static List<List<Integer>> ans = new ArrayList<>();
    public static List<List<Integer>> combinationSum3(int k, int n) {
        traverse(k, n, new ArrayList<>());
        return ans;
    }

    public static void traverse(int k, int size, List<Integer> list){
        if(list.size() == size){
            if(list.stream().reduce(Integer::sum).get() == k){
                Set<Integer> set = new TreeSet<>(Comparator.comparingInt(o -> o));
                set.addAll(list);
                if(!ans.contains(new ArrayList<>(set))){
                    ans.add(new ArrayList<>(set));
                }
            }
            return ;
        }
        for(int i = 1; i < 10; i++){
            if(list.contains(i)){
                continue ;
            }
            list.add(i);
            traverse(k, size, list);
            list.remove(list.size() - 1);
        }
    }
}

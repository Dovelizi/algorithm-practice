package com.lizi.year2022.month12.day1204;

import java.util.Arrays;
import java.util.Comparator;
import java.util.HashSet;
import java.util.Set;

/**
 * @author lizi
 * @date 2022/12/4 10:28
 * @description TODO
 **/
public class Three1204 {
    public static void main(String[] args) {

        System.out.println();
    }
    public static  <T> Long get(T t){
        return (Long)t;
    }
    public int minScore(int n, int[][] roads) {
        int ans = Integer.MAX_VALUE;
        Set<Integer> set = new HashSet<>();
        set.add(1);
        set.add(4);
        Arrays.sort(roads, Comparator.comparingInt(o -> o[0]));
        for (int[] arr : roads){
            int num1 = arr[0];
            int num2 = arr[1];
            int path = arr[2];
            if(set.contains(num1) || set.contains(num2)){
                ans = Math.min(path, ans);
            }
        }
        return ans;
    }
}

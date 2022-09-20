package com.lizi.year2022.month7.day0709;

import java.util.*;

/**
 * @author lizi
 * @description TODO
 * @date 2022/7/9 09:56
 **/
public class OneTopic0709 {
    public static void main(String[] args) {
        lenLongestFibSubseq(new int[]{1,2,3,4,5,6,7,8});
    }
    public static int lenLongestFibSubseq(int[] arr) {
        Map<Integer, Integer> map = new HashMap<>();
        int ans = 0;
        List<Integer> list = new ArrayList<>();
        for (int n : arr){
            map.put(n, map.getOrDefault(n, 0) + 1);
        }
        for (int i = 0; i < arr.length; i++) {
            for (int j = i + 1; j < arr.length; j++) {
                int temp = arr[i] + arr[j];
                if(Objects.nonNull(map.get(temp))){
                    list.add(arr[i]);
                    list.add(arr[j]);
                    list.add(temp);
                    while(Objects.nonNull(map.get( list.get(list.size() - 2) + list.get(list.size() - 1)))){
                        list.add(list.get(list.size() - 2) + list.get(list.size() - 1));
                    }
                    ans = Math.max(ans, list.size());
                    list.clear();
                }
            }
        }

       return ans;
    }
}

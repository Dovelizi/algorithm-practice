package com.lizi.year2021.day1212;

import java.util.*;

/**
 * @author lizi
 * @description TODO
 * @date 2021/12/12 10:56
 **/
public class TwoTopic {
    static Set<List<Integer>> set = new HashSet<>();
    public static void main(String[] args) {
        //subArrayRanges(new int[]{4,-2,-3,4,1});
        int count = 0 ;
        int[] arr = {4,-2,-3,4,1};
        Arrays.sort(arr);
        boolean[] booleans = new boolean[arr.length];
        find(arr, 0, booleans);
        System.out.println(set);
        for (List<Integer> list : set){
            if (!list.isEmpty()){
                count += list.get(list.size() - 1) - list.get(0);
            }
        }
        StringBuilder sb = new StringBuilder();
        System.out.println(count);
    }
    public static long subArrayRanges(int[] nums) {
        Arrays.sort(nums);
        int count = 0;
        boolean[] booleans = new boolean[nums.length];
        find(nums, 0, booleans);
        return count;
    }
    public static void find(int[] arr, int position, boolean[] isIns) {
        if (position == arr.length) {
            List<Integer> list = new LinkedList<>();
            for (int i = 0; i < arr.length;i++) {
                if (isIns[i]) {
                    list.add(arr[i]);
                }
            }
            set.add(list);
        } else {
            isIns[position] = true;
            find(arr, position + 1, isIns);
            isIns[position] = false;
            find(arr, position + 1, isIns);
        }
    }
}






package com.lizi.year2022.month3.day0313;

import java.util.*;
import java.util.stream.Collectors;

/**
 * @author lizi
 * @description TODO
 * @date 2022/3/13 10:25
 **/
public class OneTopic0313 {
    public static void main(String[] args) {
        findKDistantIndices(new int[]{222,151,842,244,103,736,219,432,565,216,36,198,10,367,778,111,307,460,92,622,750,36,559,983,782,432,312,111,676,179,44,86,766,371,746,905,850,170,892,80,449,932,295,875,259,556,730,441,153,869}, 153, 19);
    }
    public static List<Integer> findKDistantIndices(int[] nums, int key, int k) {
        List<Integer> list = new ArrayList<>();
        Set<Integer> resSet = new HashSet<>();
        int len = nums.length;
        for (int i = 0; i < len; i++) {
            if(nums[i] == key){
                list.add(i);
            }
        }
        for(int n : list){
            int left = Math.max(n - k, 0);
            int right = Math.min(n + k, len);
            for(int i = left; i <= right; i++){
                if(i < len){
                    resSet.add(i);
                }
            }

        }
        return new ArrayList<>(resSet).stream().sorted(Comparator.comparing(Integer::intValue)).collect(Collectors.toList());
    }
}

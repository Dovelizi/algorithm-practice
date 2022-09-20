package com.lizi.year2022.month7.day0704;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/**
 * @author lizi
 * @description TODO
 * @date 2022/7/4 08:52
 **/
public class OneTopic0704 {
    public List<List<Integer>> minimumAbsDifference(int[] arr) {
        List<List<Integer>> ans = new ArrayList<>();
        Arrays.sort(arr);
        int min = arr[1] - arr[0];
        for (int i = 1; i < arr.length; i++) {
            min = Math.min(min, arr[i - 1] - arr[i]);
        }
        for (int i = 1; i < arr.length; i++) {
            if(arr[i] - arr[i - 1] == min){
                ans.add(Arrays.asList(arr[i - 1], arr[i]));
            }
        }
        return ans;
    }
}

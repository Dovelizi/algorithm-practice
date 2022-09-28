package com.lizi.year2022.month9.day0925;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;

/**
 * @author lizi
 * @date 2022/9/25 10:29
 * @description TODO
 **/
public class Three0925 {
    public static void main(String[] args) {
        goodIndices(new int[]{2,1,1,1,3,4,1}, 2);
    }
    public static List<Integer> goodIndices(int[] nums, int k) {
        List<Integer> ans = new ArrayList<>();
        int len = nums.length;
        for (int i = k; i < len - k; i++) {
            if(check(Arrays.copyOfRange(nums,i - k, i + k + 1))){
                ans.add(i);
            }
        }
        return ans.stream().sorted(Comparator.comparing(Integer::intValue)).collect(Collectors.toList());
    }
    public static boolean check(int[] arr){
        int len = arr.length;
        int mid = len / 2;
        for (int i = 0; i < mid - 1; i++){
            if(arr[i+1] > arr[i]){
                return false;
            }
        }
        for (int i = mid + 1; i < len - 1; i++){
            if(arr[i] > arr[i+1]){
                return false;
            }
        }
        return true;
    }
}

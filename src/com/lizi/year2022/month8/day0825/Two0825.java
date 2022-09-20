package com.lizi.year2022.month8.day0825;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

/**
 * @author lizi
 * @description TODO
 * @date 2022/8/25 14:56
 **/
public class Two0825 {
    public static void main(String[] args) {
        findClosestElements(new int[]{1,2,3,10,12,14},4, 12);
    }
    public static List<Integer> findClosestElements(int[] arr, int k, int x) {
        int n = arr.length;
        int left = 0;
        int right = n - k;
        while(left <= right){
            int mid = (left + right) >>> 1;
            if(mid + k < n && x - arr[mid] > arr[mid + k] - x){
                left = mid + 1;
            } else {
                right = mid - 1;
            }
        }
        return Arrays.stream(arr, left, left + k).boxed().collect(Collectors.toList());
    }
}

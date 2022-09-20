package com.lizi.year2022.month8.day0825;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

/**
 * @author lizi
 * @description TODO
 * @date 2022/8/25 09:45
 **/
public class One0825 {
    public static void main(String[] args) {
        findClosestElements(new int[]{1,1,1,10,10,10}, 1, 9);
    }
    public static List<Integer> findClosestElements(int[] arr, int k, int x) {
        int len = arr.length;
        int count = Integer.MAX_VALUE;
        int idx = 0;
        if(x > arr[len - 1]){
            return Arrays.stream(Arrays.copyOfRange(arr, len - k, len)).boxed().collect(Collectors.toList());
        }
        if(x < arr[0]){
            return Arrays.stream(Arrays.copyOfRange(arr, 0, k)).boxed().collect(Collectors.toList());
        }
        for (int i = 0; i <= len - k; i++) {
            int tempCount = 0;
            for (int j = i; j < i + k; j++) {
                tempCount += Math.abs(arr[j] - x);
            }
            if(tempCount < count){
                count = tempCount;
                idx = i;
            }
        }
        return Arrays.stream(Arrays.copyOfRange(arr, idx, idx + k)).boxed().collect(Collectors.toList());
    }
}

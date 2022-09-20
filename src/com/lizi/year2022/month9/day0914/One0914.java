package com.lizi.year2022.month9.day0914;

import java.util.Arrays;

/**
 * @author lizi
 * @date 2022/9/14 09:52
 * @description TODO
 **/
public class One0914 {
    public static void main(String[] args) {
        trimMean(new int[]{4,8,4,10,0,7,1,3,7,8,8,3,4,1,6,2,1,1,8,0,9,8,0,3,9,10,3,10,1,10,7,3,2,1,4,9,10,7,6,4,0,8,5,1,2,1,6,2,5,0,7,10,9,10,3,7,10,5,8,5,7,6,7,6,10,9,5,10,5,5,7,2,10,7,7,8,2,0,1,1});
    }
    public static double trimMean(int[] arr) {
        int len = arr.length;
        Arrays.sort(arr);
        int count = Double.valueOf(len * 0.05).intValue();
        int sum1 = Arrays.stream(Arrays.copyOfRange(arr, 0, count)).sum();
        int sum2 = Arrays.stream(Arrays.copyOfRange(arr, len - count, len)).sum();
        double sum = Arrays.stream(arr).sum() - sum1 - sum2;
        return sum / (len - count * 2);
    }
}

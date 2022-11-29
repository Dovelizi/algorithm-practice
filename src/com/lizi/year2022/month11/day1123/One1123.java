package com.lizi.year2022.month11.day1123;

import java.util.Arrays;
import java.util.stream.IntStream;
import java.util.stream.Stream;

/**
 * @author lizi
 * @date 2022/11/23 08:55
 * @description TODO
 **/
public class One1123 {
    public static void main(String[] args) {
        IntStream.of(123).toArray();
    }
    public int countBalls(int lowLimit, int highLimit) {
        int[] arr = new int[46];
        for (int i = lowLimit; i <= highLimit; i++) {
            final Integer sum = Stream.of(String.valueOf(i).split("")).map(Integer::parseInt).reduce(0, Integer::sum);
            arr[sum]++ ;
        }
       return Arrays.stream(arr).max().getAsInt();
    }
}

package com.lizi.year2022.month5.day0522;

import java.util.Arrays;

/**
 * @author lizi
 * @description TODO
 * @date 2022/5/22 10:26
 **/
public class ThreeTopic0522 {
    public static void main(String[] args) {

        minimumLines(new int[][]{{72,98},{62,27},{32,7},{71,4},{25,19},{91,30},{52,73},{10,9},{99,71},{47,22},{19,30},{80,63},{18,15},{48,17},{77,16},
                {46,27},{66,87},{55,84},{65,38},{30,9},{50,42},{100,60},{75,73},{98,53},{22,80},{41,61},{37,47},{95,8},{51,81},{78,79},{57,95}});
    }
    public static int minimumLines(int[][] stockPrices) {
        int ans = 0;
        int len = stockPrices.length;
        int idx = 0;
        Arrays.sort(stockPrices, (o, p) -> o[0] - p[0]);
        while (idx < len - 1){
            int[] arr = getLine(stockPrices[idx], stockPrices[idx + 1]);
            for (int j = idx + 1; j < len; j++) {
                if((arr[0] * stockPrices[j][0] + arr[1] * stockPrices[j][1] + arr[2]) != 0){
                    ans++;
                    idx = j - 1;
                    break;
                }else if(j == len - 1) {
                    idx = j;
                    ans++ ;
                }
            }
        }
        return ans;
    }

    public static int[] getLine(int[] a, int[] b){
        int[] arr = new int[3];
        arr[0] = b[1] - a[1];
        arr[1] = a[0] - b[0];
        arr[2] = b[0] * a[1] - a[0] * b[1];
        return arr;
    }
}

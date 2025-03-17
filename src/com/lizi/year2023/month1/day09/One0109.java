package com.lizi.year2023.month1.day09;

import java.util.Arrays;

/**
 * @author lizi
 * @date 2023/1/9 09:00
 * @description 1806. 还原排列的最少操作步数
 **/
public class One0109 {
    public static void main(String[] args) {
        reinitializePermutation(8);
    }
    public static int reinitializePermutation(int n) {
        int ans = 0;
        int[] prem = new int[n];
        int[] arr = new int[n];
        for (int i = 0; i < n; i++) {
            arr[i] = i;
            prem[i] = i;
        }
        while (!Arrays.equals(prem, arr) || ans == 0){
            int[] temp = new int[n];
            for (int i = 0; i < n; i++) {
                if(i % 2 == 0){
                    temp[i] = arr[i / 2];
                }else {
                    temp[i] = arr[n / 2 + (i - 1) / 2];
                }
            }
            arr = temp;
            ans++ ;
        }
        return ans;
    }

}

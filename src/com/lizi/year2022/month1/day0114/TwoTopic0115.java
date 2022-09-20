package com.lizi.year2022.month1.day0114;

import java.util.Arrays;

/**
 * @author lizi
 * @description 313. 超级丑数
 * @date 2022/1/14 16:50
 **/
public class TwoTopic0115 {
    public static void main(String[] args) {
        nthSuperUglyNumber(12, new int[]{2,7,13,19});
    }
    public static int nthSuperUglyNumber(int n, int[] primes) {
        int len = primes.length;
        int[] primesIdx = new int[len];
        int[] uglyNumber = new int[n+1];
        Arrays.sort(primes);
        uglyNumber[0] = 1;
        for (int i = 1; i <= n; i++) {
            int minNum = Integer.MAX_VALUE;
            for (int j = 0; j < primesIdx.length; j++) {
                int tempNum = uglyNumber[primesIdx[j]] * primes[j];
                if(minNum >= tempNum){
                   minNum = tempNum;
                }
            }
            for (int k = 0; k < primes.length; k++) {
                if(uglyNumber[primesIdx[k]] * primes[k] == minNum){
                    primesIdx[k]++;
                }
            }
            uglyNumber[i] = minNum;
        }
        return uglyNumber[n - 1];
    }
}

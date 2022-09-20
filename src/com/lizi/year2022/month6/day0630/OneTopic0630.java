package com.lizi.year2022.month6.day0630;

import java.util.Arrays;

/**
 * @author lizi
 * @description TODO
 * @date 2022/6/30 08:59
 **/
public class OneTopic0630 {
    public int numPrimeArrangements(int n) {
        long ans = 1L;

        int sum = 0;
        if (n > 2){
            sum =  checkPrime(n);
        }else {
            return 1;
        }

        for (int i = 2;i <= sum; i++){
            ans = (ans * i) % (1000000000 + 7);
        }
        for (int i = 2;i <= n - sum; i++){
            ans = (ans * i) % (1000000000 + 7);
        }
        return (int) ans;
    }
    public int checkPrime(int num){
       int[] prime = new int[num + 1];
       int idx = 0;
       boolean[] isPrime = new boolean[prime.length];
        for (int i = 2; i < num; i++) {
            if(!isPrime[i]){
                prime[idx++] = i;
            }
            for (int j = 0; j < idx && i * prime[i] < num; j++) {
                // 标记
                isPrime[i * prime[i]] = true;
                if(i % prime[j] == 0){
                    break;
                }
            }
        }
        int count = 0;
        Arrays.sort(prime);
        for(int n : prime){
            if(n != 0){
                break;
            }
            count++ ;
        }
        return prime.length - count;
    }
}

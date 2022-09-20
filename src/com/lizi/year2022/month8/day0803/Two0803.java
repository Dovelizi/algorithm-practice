package com.lizi.year2022.month8.day0803;

/**
 * @author lizi
 * @description TODO
 * @date 2022/8/3 14:17
 **/
public class Two0803 {
    public static void main(String[] args) {
        getprimeoula(100);
    }

    public static void getprimeoula(int n) {
        // 记录第几个prime
        int[] prime = new int[n];
        int index = 0;
        boolean[] isPrime = new boolean[n + 1];
        for (int i = 2; i < n + 1; i++) {
            if (!isPrime[i]) {
                prime[index++] = i;
            }
            //已知素数范围内枚举
            for (int j = 0; j < index && i * prime[j] <= n; j++) {
                // 标记乘积
                isPrime[i * prime[j]] = true;
                if (i % prime[j] == 0) {
                    break;
                }
            }
        }
    }
}

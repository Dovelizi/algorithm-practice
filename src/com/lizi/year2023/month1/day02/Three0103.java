package com.lizi.year2023.month1.day02;

import java.util.ArrayList;
import java.util.List;

/**
 * @author lizi
 * @date 2023/1/3 09:11
 * @description 2523. 范围内最接近的两个质数
 **/
public class Three0103 {
    public static void main(String[] args) {
        closestPrimes(1, 10);
    }
    public static int[] closestPrimes(int left, int right) {
        int[] ans = {-1, -1};
        int temp = Integer.MAX_VALUE;
        boolean[] prime = getPrime(right);
        List<Integer> list = new ArrayList<>();
        for (int i = Math.max(2, left); i <= right; i++){
            if(!prime[i]){
                list.add(i);
            }
        }
        for (int i = 1; i < list.size(); i++) {
            int len = list.get(i) - list.get(i - 1);
            if(len < temp){
                temp = len;
                ans = new int[]{list.get(i - 1), list.get(i)};
            }
        }
        return ans;
    }
    public static boolean[] getPrime(int right){
        int[] prime = new int[right + 1];
        int index = 0;
        boolean[] isPrime = new boolean[right + 1];
        for (int i = 2; i < right + 1; i++) {
            if (!isPrime[i]) {
                prime[index++] = i;
            }
            // 已知素数范围内枚举
            for (int j = 0; j < index && i * prime[j] <= right; j++) {
                // 标记乘积
                isPrime[i * prime[j]] = true;
                if (i % prime[j] == 0) {
                    break;
                }
            }
        }
        return isPrime;
    }
}

package com.lizi.year2022.month9.day0918;

/**
 * @author lizi
 * @date 2022/9/18 10:22
 * @description TODO
 **/
public class Four0918 {
    public int smallestEvenMultiple(int n) {
       return 2 * n / gcd(2, n);
    }
   public int gcd(int a, int b) {
        if (a % b == 0) {
            return b;
        }
        return gcd(b, a % b);
    }
}

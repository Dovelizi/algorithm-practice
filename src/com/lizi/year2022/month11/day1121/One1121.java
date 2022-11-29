package com.lizi.year2022.month11.day1121;

/**
 * @author lizi
 * @date 2022/11/22 08:54
 * @description 878. 第 N 个神奇数字
 **/
public class One1121 {
    public static void main(String[] args) {
        // gcd(25, 5);
        // lcm(40000, 40000);
        nthMagicalNumber(1000000000, 40000, 40000);
    }
    public static int nthMagicalNumber(int n, int a, int b) {
        int MOD = 1000000007;
        if(a % b == 0 || b % a == 0) {
            return qMagicalNumber(Math.min(a, b), n, MOD);
        }
        long minLcm = lcm(a, b);
        long l = 1, r = (long) n * Math.min(a, b);
        while (l <= r){
            long mid = (l + r) >> 1;
            long temp = mid / a + mid / b - mid / minLcm;
            if(temp >= n){
                r = mid - 1;
            } else{
                l = mid + 1;
            }
        }
        return (int) (l + 1) % MOD;
    }

    public static long gcd(int a, int b){
        int temp = 0;
        while (b > 0){
            temp = a % b;
            a = b;
            b = temp;
        }
        return a;
    }

    public static long lcm(int a, int b){
        return a * b / gcd(a, b);
    }

    public static int qMagicalNumber(int min, int n, int mod){
        return (int) ((long)min * n) % mod;
    }
}

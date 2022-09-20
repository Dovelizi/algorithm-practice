package com.lizi.year2021.day1205;

/**
 * @author lizi
 * @description TODO
 * @date 2021/12/6 00:04
 **/
public class ThreeTopic {
    public int superPow(int a, int[] b) {
        long result = 1;
        int mod = 1337;
        if(a <= 1){
            return 1;
        }
        for(int num : b){
            result = myPow(a,num,mod) * myPow(result,10,mod) % mod;
        }
        return (int) result;
    }

    public long myPow(long x, long n,int mod) {
        long res = 1;
        while(n != 0){
            if((n & 1) == 1){
                res *= x % mod;
            }
            x *= x % mod;
            n >>= 1;
        }
        return res;
    }
}

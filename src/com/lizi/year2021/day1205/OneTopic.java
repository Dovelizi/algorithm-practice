package com.lizi.year2021.day1205;

/**
 * @author lizi
 * @description TODO
 * @date 2021/12/5 19:24
 **/
public class OneTopic {
    public static void main(String[] args) {
        myPow(2.00000 ,-2147483648);
    }
    public static double myPow(double x, int n) {
        double res = 1.00000;
        int absNum = Math.abs(n);
        while(n != 0){
            if((n & 1) == 1){
                res *=  x;
            }
            x *= x;
            n /= 2;
        }
        return n > 0 ? res : 1 / res;
    }
}

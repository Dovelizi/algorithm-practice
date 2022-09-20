package com.lizi.year2021.day1219;

/**
 * @author lizi
 * @description TODO
 * @date 2021/12/19 17:08
 **/
public class FourTopic {
    public static void main(String[] args) {

        int i = hammingWeight(3);
    }
    public static int hammingWeight(long n) {
        int res = 0;
        while(n != 0){
            if((n & 1 ) == 1){
                res++ ;
            }
            n >>= 1;
        }
        return res;
    }
}

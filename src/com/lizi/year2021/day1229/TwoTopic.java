package com.lizi.year2021.day1229;

/**
 * @author lizi
 * @description TODO
 * @date 2021/12/29 19:34
 **/
public class TwoTopic {
    public static void main(String[] args) {
        cuttingRope(108);
    }
    public static int cuttingRope(int n) {
        long res = 1;
        int mod = 1000000007;
        while(n > 4){
            res = (res * 3) % mod;
            n -= 3;
        }
        if(n == 4){
            if(res != 1){
                return (int)(res * 4) % mod;
            }
            return n;
        }
        if(n == 3){

            return 2;
        }
        if(n == 2){
            if(res == 1){
                return 1;
            }else{
                return (int)(res% mod) * 2 ;
            }
        }
        return (int)res;
    }
}

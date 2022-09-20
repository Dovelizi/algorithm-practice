package com.lizi.year2022.month3.day0328;

/**
 * @author lizi
 * @description TODO
 * @date 2022/3/28 11:26
 **/
public class OneTopic0328 {
    public static void main(String[] args) {
        hasAlternatingBits(2);
    }
    public static boolean hasAlternatingBits(int n) {
        if(n == 1){
            return true;
        }
        int times = 0;
        int temp = n;
        while(temp > 0){
            times++ ;
            temp /= 2;
        }
        int count = 1;
        boolean flagA = (n & 1) == 0;
        boolean flagB = (n & 1) == 1;
        for (int i = 2; i <= times; i++) {
            boolean con = (n >> (i - 1) & 1) == 0;
            if(con && flagB){
                flagA = true;
                flagB = false;
                count++ ;
            }
            if(!con && flagA){
                flagA = false;
                flagB = true;
                count++ ;
            }
            if(count != i){
                return false;
            }
        }
        return true;
    }
}

// 1 1 0
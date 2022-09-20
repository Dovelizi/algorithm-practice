package com.lizi.year2022.month3.day0325;

/**
 * @author lizi
 * @description TODO
 * @date 2022/3/25 19:51
 **/
public class OneTopic0325 {
    public static void main(String[] args) {
        trailingZeroes(1000);
    }
    public static long trailingZeroes(int n) {
        int ans = 0;
        for(int i = 5; i <= n; i += 5){
            ans++ ;
            if(i % 25 == 0){
                ans++;
            }
            if(i % 125 == 0){
                ans++;
            }
            System.out.println(i + "------> "+ ans);
        }
        return ans;
    }
}


// 11 12 13 14 15 16 17 18 19 20 21 22 23 24 25 26 27 28 29 30

// 5 10 15 20 25 30 35 40 45 50  55 60 65 70 75 80 85 90 95 100 105 110 115 120 125 130 135 140 145 150 155 160
// 1  2  3  4  6  7  8 9  10  12 13 14 15 16 18 19 20 21 22 24   25  26  27
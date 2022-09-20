package com.lizi.year2021.day1222;

/**
 * @author lizi
 * @description TODO
 * @date 2021/12/22 09:17
 **/
public class OneTopic {
    public static void main(String[] args) {
        cuttingRope(8);
    }
    public static int cuttingRope(int n) {
        int[] dp = new int[n + 1];
        dp[1] = 1;
        for(int i = 2; i <= n; i++){
            for(int j = 1; j < i; j++){
                dp[i] = Math.max(dp[i],Math.max(j * (i - j), j * dp[i - j]));
            }
        }
        return dp[n];
    }
}

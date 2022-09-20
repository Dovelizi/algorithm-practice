package com.lizi.year2022.month1.day0117;

import java.util.Arrays;

/**
 * @author lizi
 * @description TODO
 * @date 2022/1/17 09:17
 **/
public class OneTopic0117 {
   static int MOD = (int)1e9+7;

    public static void main(String[] args) {
        countVowelPermutation(2);
    }
    public static int countVowelPermutation(int n) {
        long[][] dp = new long[n][5];
        long resNum = 0;
        Arrays.fill(dp[0],1);
        for (int i = 1; i < n; i++) {
            dp[i][0] = dp[i-1][1];
            dp[i][1] = dp[i-1][0] + dp[i-1][2];
            dp[i][2] = dp[i-1][0] + dp[i-1][1] + dp[i-1][3] + dp[i-1][4];
            dp[i][3] = dp[i-1][2] + dp[i-1][4];
            dp[i][4] = dp[i-1][0];
            for (int j = 0; j < 5; j++) {
                dp[i][j] %= MOD;
            }
        }
        for (int i = 0; i < 5; i++) {
            resNum = (resNum % MOD )+ dp[n-1][i];
        }
        return (int)resNum % MOD;
    }

}

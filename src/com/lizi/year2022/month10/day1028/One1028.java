package com.lizi.year2022.month10.day1028;

import java.util.ArrayDeque;
import java.util.Deque;

/**
 * @author lizi
 * @date 2022/10/28 08:48
 * @description 907. 子数组的最小值之和
 **/
public class One1028 {
    public static void main(String[] args) {
        sumSubarrayMins(new int[]{3, 1, 2, 4});
    }
    public static int sumSubarrayMins(int[] arr) {
        int n = arr.length;
        long ans = 0;
        final int MOD = 1000000007;
        Deque<Integer> monoStack = new ArrayDeque<Integer>();
        int[] dp = new int[n];
        for (int i = 0; i < n; i++) {
            while (!monoStack.isEmpty() && arr[monoStack.peek()] > arr[i]) {
                monoStack.pop();
            }
            int k = monoStack.isEmpty() ? (i + 1) : (i - monoStack.peek());
            dp[i] = k * arr[i] + (monoStack.isEmpty() ? 0 : dp[i - k]);
            ans = (ans + dp[i]) % MOD;
            monoStack.push(i);
        }
        return (int) ans;
    }



}

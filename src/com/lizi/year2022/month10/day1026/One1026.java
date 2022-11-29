package com.lizi.year2022.month10.day1026;

import java.util.Deque;
import java.util.LinkedList;

/**
 * @author lizi
 * @date 2022/10/26 08:57
 * @description 862. 和至少为 K 的最短子数组
 **/
public class One1026 {
    public int shortestSubarray(int[] nums, int k) {
        int len = nums.length;
        int ans = Integer.MAX_VALUE;
        long[] sumArr = new long[len + 1];
        Deque<Integer> deque = new LinkedList<>();
        for (int i = 0; i < len; i++) {
            sumArr[i + 1] = sumArr[i] + nums[i];
        }

        for (int i = 0; i <= len; i++) {
            long curSum = sumArr[i];
            while (!deque.isEmpty() && curSum - sumArr[deque.peekFirst()] >= k){
                ans = Math.min(ans, i - deque.pollFirst());
            }
            while (!deque.isEmpty() && sumArr[deque.peekLast()] >= curSum){
                deque.pollLast();
            }
            deque.offerLast(i);
        }
        return ans == Integer.MAX_VALUE ? -1 : ans;
    }
}

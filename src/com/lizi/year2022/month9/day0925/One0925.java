package com.lizi.year2022.month9.day0925;

import javafx.util.Pair;

import java.util.PriorityQueue;

/**
 * @author lizi
 * @date 2022/9/25 10:29
 * @description TODO
 **/
public class One0925 {
    public static void main(String[] args) {
        longestSubarray(new int[]{1,3,3,3,2});
    }
    public static int longestSubarray(int[] nums) {
        int len = nums.length;
        PriorityQueue<Pair<Integer, Integer>> pair = new PriorityQueue<>((o1, o2) -> o2.getKey() == o1.getKey() ? o2.getValue() - o1.getValue() : o2.getKey() - o1.getKey());
        for (int i = 0; i < len; i++) {
            int sum = nums[i];
            pair.offer(new Pair<>(sum, 1));
            for (int j = i + 1; j < len; j++) {
                int l = j - i + 1;
                sum = sum & nums[j];
                Pair<Integer, Integer> temp = pair.peek();
                if(sum >= temp.getKey()){
                    if(l > temp.getValue()){
                        pair.poll();
                        pair.offer(new Pair<>(sum, l));
                    }
                }
            }
        }
        return pair.peek().getValue();
    }
}

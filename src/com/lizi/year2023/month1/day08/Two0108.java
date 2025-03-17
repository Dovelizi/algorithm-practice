package com.lizi.year2023.month1.day08;

import java.util.PriorityQueue;

/**
 * @author lizi
 * @date 2023/1/8 10:28
 * @description 6285. 执行 K 次操作后的最大分数
 **/
public class Two0108 {
    public long maxKelements(int[] nums, int k) {
        long ans = 0L;
        PriorityQueue<Integer> queue = new PriorityQueue<>((o1, o2) -> o2 - o1);
        for (int n : nums){
            queue.offer(n);
        }
        while (k-- > 0 && !queue.isEmpty()){
            final Integer poll = queue.poll();
            ans += poll;
            int newNum = poll % 3 == 0 ? poll / 3 : poll / 3 + 1;
            queue.offer(newNum);
        }
        return ans;
    }
}

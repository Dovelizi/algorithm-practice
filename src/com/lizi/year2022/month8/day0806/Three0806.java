package com.lizi.year2022.month8.day0806;

import java.util.HashMap;

/**
 * @author lizi
 * @description TODO
 * @date 2022/8/6 22:26
 **/
public class Three0806 {
    public static void main(String[] args) {
        taskSchedulerII(new int[]{1,2,1,2,3,1}, 3);
    }
    public static long taskSchedulerII(int[] tasks, int space) {
        long count = 0L;
        HashMap<Integer, Long> map = new HashMap<>();
        for (int t : tasks){
            count = Math.max(count, map.getOrDefault(t, 0L)) + 1;
            map.put(t, count + space);
        }
        return count;
    }
}

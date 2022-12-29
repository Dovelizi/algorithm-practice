package com.lizi.year2022.month11.day1130;

import java.util.*;

/**
 * @author lizi
 * @date 2022/11/30 08:48
 * @description 895. 最大频率栈
 **/
public class One1130 {
    private Map<Integer, Integer> map = new HashMap<>();
    private int idx = 0;

    private PriorityQueue<int[]> priorityQueue = new PriorityQueue<>((o1, o2) -> o1[1] == o2[1] ? o2[2] - o1[2] : o2[1] - o1[1]);
    public One1130() {

    }

    public void push(int val) {
        map.put(val, map.getOrDefault(val, 0) + 1);
        priorityQueue.offer(new int[]{val, map.get(val), idx++});
    }

    public int pop() {
        int[] poll = priorityQueue.poll();
        map.put(poll[0], poll[1] - 1);
        return poll[0];
    }

    public static void main(String[] args) {
        One1130 o = new One1130();
        o.push(5);
        o.push(7);
        o.push(5);
        o.push(7);
        o.push(4);
        o.push(5);
        o.pop();
        o.pop();
        o.pop();
        o.pop();
        System.out.println("xxx");
    }
}

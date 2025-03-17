package com.lizi.year2023.month1.day09;

import java.util.*;

/**
 * @author lizi
 * @date 2023/1/9 17:24
 * @description 2526. 找到数据流中的连续整数
 **/
public class Three0109 {
    public static void main(String[] args) {
        System.out.println("");
        Three0109 t = new Three0109(4, 3);
        t.consec(4);
        t.consec(4);
        t.consec(4);
        t.consec(3);
    }
    private int size;
    private int value;
    private Set<Integer> set = new HashSet<>();
    private Map<Integer, Integer> map = new HashMap<>(16);
    Queue<Integer> queue = new ArrayDeque<>();
    public Three0109(int value, int k) {
        this.value = value;
        this.size = k;
    }

    public boolean consec(int num) {
        add(num);
        if(queue.size() < size){
            return false;
        }
        return set.size() == 1 && queue.peek() == value;
    }
    public void add(int num){
        if(queue.size() == size){
            Integer poll = queue.poll();
            if(map.get(poll) == 1){
                set.remove(poll);
            }
        }
        queue.offer(num);
        set.add(num);
        map.put(num, map.getOrDefault(num, 0) + 1);
    }
}

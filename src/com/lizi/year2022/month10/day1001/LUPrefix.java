package com.lizi.year2022.month10.day1001;

import java.util.Comparator;
import java.util.PriorityQueue;

/**
 * @author lizi
 * @date 2022/10/2 00:01
 * @description 6197. 最长上传前缀
 **/
public class LUPrefix {
    public static void main(String[] args) {
        LUPrefix server = new LUPrefix(4);   // 初始化 4个视频的上传流
        server.upload(3);                    // 上传视频 3 。
        server.longest();                    // 由于视频 1 还没有被上传，最长上传前缀是 0 。
        server.upload(1);                    // 上传视频 1 。
        server.longest();                    // 前缀 [1] 是最长上传前缀，所以我们返回 1 。
        server.upload(2);                    // 上传视频 2 。
        server.longest();                    // 前缀 [1,2,3] 是最长上传前缀，所以我们返回 3 。
    }
    static PriorityQueue<Integer> priorityQueue = new PriorityQueue<>((o1, o2) -> o2 - o1);
    static PriorityQueue<Integer> deque = new PriorityQueue<>(Comparator.comparingInt(o -> o));
    public LUPrefix(int n) {

    }

    public void upload(int video) {
        addDeque();
        if(video == 1 || (!priorityQueue.isEmpty() && priorityQueue.peek() + 1 == video)){
            priorityQueue.offer(video);
        }else {
            deque.offer(video);
        }
        addDeque();
    }

    public int longest() {
        return priorityQueue.isEmpty() ? 0 : priorityQueue.peek();
    }
    public void addDeque(){
        while (!deque.isEmpty() && !priorityQueue.isEmpty() && deque.peek() - 1 == priorityQueue.peek()){
            priorityQueue.offer(deque.poll());
        }
    }
}

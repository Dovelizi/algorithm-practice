package com.lizi.year2022.month4.day04010;

import java.util.PriorityQueue;
import java.util.Queue;

/**
 * @author lizi
 * @description TODO
 * @date 2022/4/10 10:23
 **/
public class FourTopic0410 {
    public static void main(String[] args) {
        largestInteger(1234);
    }
    public static int largestInteger(int num) {
        String s = String.valueOf(num);
        Queue<Character> pq1 = new PriorityQueue<>((v1, v2) -> v2 - v1);
        Queue<Character> pq2 = new PriorityQueue<>((v1, v2) -> v2 - v1);
        StringBuilder ans = new StringBuilder();
        for(char ch : s.toCharArray()){
            int temp = Integer.parseInt(String.valueOf(ch));
            if(temp % 2 != 0){
                pq1.add(ch);
            }else{
                pq2.add(ch);
            }
        }
        for(char ch : s.toCharArray()){
            int temp = Integer.parseInt(String.valueOf(ch));
            if(temp % 2 != 0){
                ans.append(pq1.poll());
            }else{
                ans.append(pq2.poll());
            }
        }
        return Integer.parseInt(ans.toString());
    }
}

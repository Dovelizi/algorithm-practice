package com.lizi.year2022.month8.day0811;

import java.util.LinkedList;
import java.util.Queue;

/**
 * @author lizi
 * @description TODO
 * @date 2022/8/11 10:11
 **/
public class One0811 {
    public static void main(String[] args) {
        reformat("a12bcd");
    }
    public static String reformat(String s) {
        if(s.length() <= 1){
            return s;
        }
        Queue<Character> queue1 = new LinkedList<>();
        Queue<Character> queue2 = new LinkedList<>();
        Queue<Character> maxLenQueue = new LinkedList<>();
        Queue<Character> minLenQueue = new LinkedList<>();
        StringBuilder ans = new StringBuilder();
        for (char ch : s.toCharArray()){
            if(ch >= 'a' && ch <= 'z'){
                queue1.offer(ch);
            }else{
                queue2.offer(ch);
            }
        }
        if(queue1.isEmpty() || queue2.isEmpty() || (Math.abs(queue1.size() - queue2.size()) > 1)){
            return "";
        }
        if(queue1.size() != queue2.size()){
            maxLenQueue = queue1.size() > queue2.size() ? queue1 : queue2;
            minLenQueue = queue1.size() < queue2.size() ? queue1 : queue2;
        }else{
            maxLenQueue = queue1;
            minLenQueue = queue2;
        }
        while(ans.length() < s.length()){
            if(!maxLenQueue.isEmpty()){
                ans.append(maxLenQueue.poll());
            }
            if(!minLenQueue.isEmpty()){
                ans.append(minLenQueue.poll());
            }
        }
        return ans.toString();
    }
}

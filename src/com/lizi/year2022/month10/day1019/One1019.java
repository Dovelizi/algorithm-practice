package com.lizi.year2022.month10.day1019;

import java.util.LinkedList;
import java.util.Objects;
import java.util.Queue;
import java.util.Stack;

/**
 * @author lizi
 * @date 2022/10/19 08:42
 * @description 1700. 无法吃午餐的学生数量
 **/
public class One1019 {
    public static void main(String[] args) {
        countStudents(new int[]{1,1,1,0,0,1}, new int[]{1,0,0,0,1,1});
    }
    public static int countStudents(int[] students, int[] sandwiches) {
        Queue<Integer> queue = new LinkedList<>();
        Stack<Integer> stack = new Stack<>();
        int len = students.length;
        for (int i = 0; i < len; i++) {
            queue.add(students[i]);
            stack.add(sandwiches[len - i - 1]);
        }
        while (!stack.isEmpty() && queue.contains(stack.peek())){
            if( Objects.equals(stack.peek(), queue.peek()) ){
                stack.pop();
                queue.poll();
            }else {
                queue.offer(queue.poll());
            }
        }
        return stack.size();
    }
}

package com.lizi.year2022.month3.day0326;

import java.util.Stack;

/**
 * @author lizi
 * @description TODO
 * @date 2022/3/26 18:18
 **/
public class MyQueue {
    Stack<Integer> from = null;
    Stack<Integer> to = null;
    public MyQueue() {
        from = new Stack<>();
        to = new Stack<>();
    }
    public void push(int x) {
        while(!from.isEmpty()){
            to.add(from.pop());
        }
        from.add(x);
        while(!to.isEmpty()){
            from.add(to.pop());
        }
    }

    public int pop() {
        return from.pop();
    }

    public int peek() {
        return from.peek();
    }

    public boolean empty() {
        return from.empty();
    }

    public static void main(String[] args) {
          MyQueue obj = new MyQueue();
          obj.push(1);
          obj.push(2);
          obj.push(3);
          obj.push(4);
    }
}

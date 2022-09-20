package com.lizi.year2022.month8.day0831;

import java.util.*;
import java.util.stream.Collectors;

/**
 * @author lizi
 * @date 2022/8/31 10:33
 * @description TODO
 **/
public class One0831 {
    public static void main(String[] args) {
        validateStackSequences(new int[]{1, 2, 3, 4, 5}, new int[]{4, 5, 3, 2, 1});
    }
    public static boolean validateStackSequences(int[] pushed, int[] popped) {
        Stack<Integer> stack = new Stack<>();
        Queue<Integer> queue = Arrays.stream(pushed)
                .boxed()
                .collect(Collectors.toCollection(LinkedList::new));

        for (int i = 0; i < popped.length; i++) {
            int outElm = popped[i];
            if(!stack.isEmpty() && stack.peek() == outElm){
                stack.pop();
            }else {
                while(!queue.isEmpty() && queue.peek() != outElm){
                    stack.add(queue.poll());
                }
                if(queue.isEmpty()){
                    return false;
                }
                queue.poll();
            }
        }
        return true;
    }
}

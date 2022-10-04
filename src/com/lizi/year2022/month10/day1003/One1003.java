package com.lizi.year2022.month10.day1003;

import java.util.Stack;

/**
 * @author lizi
 * @date 2022/10/4 16:42
 * @description 921. 使括号有效的最少添加
 **/
public class One1003 {
    public int minAddToMakeValid(String s) {
        Stack<Character> left = new Stack<>();
        Stack<Character> right = new Stack<>();

        for (char ch : s.toCharArray()){
            if(ch == '('){
                left.add('(');
            }else {
                if(left.isEmpty()){
                    right.add(')');
                }else{
                    left.pop();
                }
            }
        }
        return left.size() + right.size();
    }
}

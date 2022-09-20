package com.lizi.year2022.month7.day0701;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/**
 * @author lizi
 * @description TODO
 * @date 2022/7/1 09:06
 **/
public class OneTopic0701 {
    public static void main(String[] args) {
        //diffWaysToCompute("5+6*2-1+4*8");

        boolean flag;
        List<Integer> list = Arrays.asList(5, 1, 6, 9, 2, 3, 4, 7, 8, 9);
        flag = list.stream().anyMatch(item -> test(item));
        System.out.println(flag);


    }

    public static boolean test(int num) {
        return num == 1;
    }
    public static List<Integer> diffWaysToCompute(String expression) {
        List<Integer> ans = new ArrayList<>();
        for (int i = 0; i < expression.length(); i++) {
            char ch = expression.charAt(i);
            if(ch == '+' || ch == '-' || ch == '*'){
                List<Integer> left = diffWaysToCompute(expression.substring(0, i));
                List<Integer> right = diffWaysToCompute(expression.substring(i + 1));
                for (int a : left){
                    for (int b : right){
                        if( ch == '+' ){
                            ans.add(a + b);
                        } else if ( ch == '-' ){
                            ans.add(a - b);
                        } else {
                            ans.add(a * b);
                        }
                    }
                }
            }
        }
        if(ans.isEmpty()){
            ans.add(Integer.valueOf(expression));
        }
        return ans;
    }
}

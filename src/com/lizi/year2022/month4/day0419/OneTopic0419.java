package com.lizi.year2022.month4.day0419;

import java.util.LinkedList;
import java.util.List;

/**
 * @author lizi
 * @description TODO
 * @date 2022/4/19 10:20
 **/
public class OneTopic0419 {
    public static void main(String[] args) {
        lexicalOrder(16);
    }
    static List<Integer> ans = new LinkedList<>();
    public static List<Integer> lexicalOrder(int n) {
        for (int i = 1; i < 10; i++) {
            dfs(i, n);
        }
        return ans;
    }
    public static void dfs(int value, int n){
        if(value > n){
            return ;
        }
        ans.add(value);
        for (int i = 0; i < 10; i++) {
            dfs(value * 10 + i, n);
        }
    }
}

package com.lizi.year2022.month4.day0419;

import java.util.ArrayList;
import java.util.List;

/**
 * @author lizi
 * @description TODO
 * @date 2022/4/19 10:54
 **/
public class OneTopic_20419 {
    public static void main(String[] args) {
        lexicalOrder(166);
    }
    public static List<Integer> lexicalOrder(int n) {
        List<Integer> ans = new ArrayList<Integer>();
        int number = 1;
        for (int i = 0; i < n; i++) {
            ans.add(number);
            if (number * 10 <= n) {
                number *= 10;
            } else {
                while (number % 10 == 9 || number + 1 > n) {
                    number /= 10;
                }
                number++;
            }
        }
        return ans;
    }
}

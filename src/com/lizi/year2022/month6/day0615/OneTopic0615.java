package com.lizi.year2022.month6.day0615;

/**
 * @author lizi
 * @description TODO
 * @date 2022/6/15 08:56
 **/
public class OneTopic0615 {
    public double calculateTax(int[][] brackets, int income) {
        double ans = 0;
        for (int i = 0; i < brackets.length; i++) {
            int cost = 0;
            if(i == 0){
                cost = Math.min(brackets[i][0], income);
                ans += cost * (brackets[i][1] * 0.01);
            } else {
                cost = Math.min(brackets[i][0] - brackets[i - 1][0], income);
                ans += cost * (brackets[i][1] * 0.01);
            }
            income -= cost;
        }
        return ans;
    }
}

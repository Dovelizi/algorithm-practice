package com.lizi.year2022.month10.day1009;

/**
 * @author lizi
 * @date 2022/10/9 08:36
 * @description 856. 括号的分数
 **/
public class One1009 {
    public static void main(String[] args) {
        scoreOfParentheses("(())(())");
    }
    public static int scoreOfParentheses(String s) {
        if (s.length() == 2) {
            return 1;
        }
        int bal = 0, n = s.length(), len = 0;
        for (int i = 0; i < n; i++) {
            bal += (s.charAt(i) == '(' ? 1 : -1);
            if (bal == 0) {
                len = i + 1;
                break;
            }
        }
        if (len == n) {
            return 2 * scoreOfParentheses(s.substring(1, n - 1));
        } else {
            return scoreOfParentheses(s.substring(0, len)) + scoreOfParentheses(s.substring(len));
        }
    }
}

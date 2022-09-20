package com.lizi.year2022.month5.day0528;

/**
 * @author lizi
 * @description TODO
 * @date 2022/5/28 17:46
 **/
public class OneTopic0528 {
    public static void main(String[] args) {
        removeOuterParentheses("(()())(())(()(()))");
    }
    public static String removeOuterParentheses(String s) {
        StringBuilder sb = new StringBuilder();
        int idx1 = 0;
        for (int i = 0; i < s.length() - 1; i++) {
           if(s.charAt(i) == ')' && s.charAt(i + 1) == ')'){
               sb.append(s, idx1 + 1, i+1);
               idx1 = i + 2;
           }

        }
        return sb.toString();
    }
}

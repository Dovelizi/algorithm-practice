package com.lizi.year2022.month4.day0407;

/**
 * @author lizi
 * @description TODO
 * @date 2022/4/7 14:48
 **/
public class OneTopic0407 {
    public static void main(String[] args) {
        rotateString("abcde","cdeab");
    }
    public static boolean rotateString(String s, String goal) {
       return s.length() == goal.length() && (s + goal).contains(goal);
    }
}

package com.lizi.year2021.day1201;

/**
 * @author lizi
 * @description TODO
 * @date 2021/12/1 10:27
 **/
public class OneTopic2 {
    public static void main(String[] args) {
        maxPower("leetcode");
    }
    public static int maxPower(String s) {
        int pre = 0;
        int next = 0;
        int maxLen = Integer.MIN_VALUE;
        while (next < s.length()) {
            if(s.charAt(pre) != s.charAt(next)){
                maxLen = Math.max(maxLen,next - pre);
                pre = next;
            }
            next++ ;
            if (next == s.length()) {
                maxLen = Math.max(maxLen,next - pre);
            }
        }
        return maxLen;
    }

}

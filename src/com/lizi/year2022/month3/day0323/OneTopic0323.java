package com.lizi.year2022.month3.day0323;

/**
 * @author lizi
 * @description TODO
 * @date 2022/3/23 11:48
 **/
public class OneTopic0323 {

    public static void main(String[] args) {
        lengthOfLongestSubstring("abcabcbb");
    }
    public static int lengthOfLongestSubstring(String s) {
        int[] arr = new int[128];
        int pre = 0, next = 0;
        int len = s.length();
        for (int i = 0; i < len; i++) {
            int idx = s.charAt(i);
            pre = Math.max(pre, arr[idx]);
            next = Math.max(next, i - pre + 1);
            arr[idx] = i + 1;
        }
        return next;
    }
}

package com.lizi.year2022.month3.day0327;

import java.util.HashMap;
import java.util.Map;

/**
 * @author lizi
 * @description TODO
 * @date 2022/3/27 11:14
 **/
public class ThreeTopic0327 {
    public static void main(String[] args) {
        kthPalindrome(new int[]{1,2,3,4,5,6}, 15);
    }
    public static long[] kthPalindrome(int[] queries, int intLength) {
        long start = 0, end = 0;
        StringBuilder s1 = new StringBuilder("1");
        StringBuilder s2 = new StringBuilder("9");
        int idx = 1;
        Map<Integer, Long> map = new HashMap<>();
        long[] ans = new long[queries.length];
        if(intLength == 1){
            start = 0;
            end = 9;
        }else{
            while (--intLength > 0){
                s1.append("0");
                s2.append("9");
            }
            start = Long.parseLong(s1.toString());
            end = Long.parseLong(s2.toString());
        }
        for(long i = start; i <= end; i++){
            if(isPalindrome(i)){
                map.put(idx++, i);
                if(idx > queries[queries.length - 1]){
                    break;
                }
            }
        }
        for (int i = 0; i < queries.length; i++) {
            ans[i] = map.get(queries[i]);
        }
        return ans;
    }
    public static boolean isPalindrome(long num) {
        String str = String.valueOf(num);
        char[] chars = str.toCharArray();
        int len = chars.length;
        for (int i = 0; i < len; i++) {
            if (chars[i] != chars[len - i - 1]) {
                return false;
            }
        }
        return true;
    }
}

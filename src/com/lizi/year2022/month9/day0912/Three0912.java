package com.lizi.year2022.month9.day0912;

import java.util.Arrays;

/**
 * @author lizi
 * @date 2022/9/12 21:56
 * @description TODO
 **/
public class Three0912 {
    public static void main(String[] args) {
        partitionString("ssssss");
    }
    public static int partitionString(String s) {
        int ans = 0;
        int len = s.length();
        for (int i = 0; i < len; ) {
            int[] hash = new int[26];
            for (int j = i; j < len; j++) {
                hash[s.charAt(j) - 'a']++ ;
                if(isDouble(hash)){
                    i = j;
                    ans++ ;
                    break;
                }
                if(j == len - 1){
                    ans++ ;
                    i = len;
                }
            }
        }
        return ans;
    }
    public static boolean isDouble(int[] arr){
        return Arrays.stream(arr)
                .anyMatch(item -> item >= 2);
    }
}

package com.lizi.year2022.month9.day0906;

import java.util.HashSet;
import java.util.Set;

/**
 * @author lizi
 * @date 2022/9/6 09:33
 * @description TODO
 **/
public class One0906 {
    public static void main(String[] args) {
        uniqueLetterString("ABCDEFA");
    }
    public static int uniqueLetterString(String s) {
        int ans = 0;
        int len = s.length();
        Set<Character> set = new HashSet<>();
        for (int j = 0; j < len; j++) {
            if(!set.add(s.charAt(j)) || j == len - 1){
                ans += getWays(set.size());
                set.clear();
            }
        }
        return ans;
    }
    public static int getWays(int count){
        int sum = 0;
        for (int i = 0; i < count; i++) {
            sum += (count - i) * (i + 1);
        }
        return sum;
    }
}

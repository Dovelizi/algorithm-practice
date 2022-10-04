package com.lizi.year2022.month10.day1002;

import java.util.Arrays;

/**
 * @author lizi
 * @date 2022/10/2 11:45
 * @description 6195. 对字母串可执行的最大删除数
 **/
public class Four1002 {
    public static void main(String[] args) {
        deleteString("aaabaab");
    }
    public static int deleteString(String s) {
        int ans = 0;
        StringBuilder stringBuilder = new StringBuilder(s);
        while (stringBuilder.length() > 0){
            int[] hash = new int[26];
            Arrays.fill(hash, -1);
            int len = stringBuilder.length();
            for (int i = 0; i < len; i++) {
                int idx = stringBuilder.charAt(i) - 'a';
                if(hash[idx] == -1){
                    hash[idx] = i;
                }else{
                    int count = i - hash[idx];
                    int start = 0, end = 0;
                    if(stringBuilder.substring(idx, i).equals(stringBuilder.substring(i, Math.min(len, i + count)))){
                        start = idx;
                        end = i;
                    }else{
                        start = idx;
                        end = len;
                    }
                    stringBuilder.delete(start, end);
                    ans++ ;
                    break;
                }
            }
        }
        return ans;
    }
}

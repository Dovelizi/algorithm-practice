package com.lizi.year2023.month1.day08;

import java.util.Arrays;

/**
 * @author lizi
 * @date 2023/1/8 10:28
 * @description 6284. 使字符串总不同字符的数目相等
 **/
public class Three0108 {
    public boolean isItPossible(String word1, String word2) {
        boolean ans = false;
        int[] hash1 = new int[26];
        int[] hash2 = new int[26];
        for (char c : word1.toCharArray()){
            hash1[c - 'a']++ ;
        }
        for (char c : word2.toCharArray()){
            hash2[c - 'a']++ ;
        }
        for (int i = 0; i < 26; i++){
            if(hash1[i] > 0){
                int idx = 0;
                while (idx < 26){
                    if(hash2[idx] > 0){
                        hash1[i]-- ;
                        hash1[idx]++ ;
                        hash2[idx]-- ;
                        hash2[i]++ ;
                        if(countDiff(hash1, hash2)){
                            return true;
                        }else {
                            hash1[i]++ ;
                            hash1[idx]-- ;
                            hash2[idx]++ ;
                            hash2[i]-- ;
                        }
                    }
                    idx++ ;
                }
            }
        }
        return ans;
    }
    public boolean countDiff(int[] hash1, int[] hash2){
        final long count1 = Arrays.stream(hash1).filter(i -> i > 0).count();
        final long count2 = Arrays.stream(hash2).filter(i -> i > 0).count();
        return count1 == count2;
    }
}

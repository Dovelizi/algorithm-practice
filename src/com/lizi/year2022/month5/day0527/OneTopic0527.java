package com.lizi.year2022.month5.day0527;

import java.util.ArrayList;
import java.util.List;
import java.util.Objects;

/**
 * @author lizi
 * @description TODO
 * @date 2022/5/27 10:23
 **/
public class OneTopic0527 {
    public static void main(String[] args) {
        findClosest(new String[]{"I","am","a","student","from","a","university","student","in","a","city"}, "a", "student");
    }
    public static int findClosest(String[] words, String word1, String word2) {
        List<Integer> list1 = new ArrayList<>();
        List<Integer> list2 = new ArrayList<>();
        int ans = Integer.MAX_VALUE;
        int len = words.length;
        for (int i = 0; i < len; i++) {
            if(Objects.equals(words[i], word1)){
                list1.add(i);
            }
            if(Objects.equals(words[i], word2)){
                list2.add(i);
            }
        }
        for (int i = 0; i < list1.size(); i++) {
            for (int j = 0; j < list2.size(); j++) {
                ans = Math.min(Math.abs(list1.get(i) - list2.get(j)), ans);
            }
        }
        return ans;
    }
}

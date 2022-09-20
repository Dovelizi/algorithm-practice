package com.lizi.year2022.month5.day0515;

import java.util.ArrayList;
import java.util.List;

/**
 * @author lizi
 * @description TODO
 * @date 2022/5/15 10:22
 **/
public class OneTopic0515 {
    public static void main(String[] args) {
        removeAnagrams(new String[]{"a","b","c","d","e"});
    }
    public static List<String> removeAnagrams(String[] words) {
        List<String> ans = new ArrayList<>();
        for (String str : words){
            ans.add(str);
        }
        for (int i = 1; i < ans.size();) {
            if(isSame(ans.get(i), ans.get(i-1))){
                ans.remove(i);
            }else {
                i++ ;
            }
        }
        return ans;
    }
    public static boolean isSame(String a, String b){
        int[] arr = new int[26];
        for (char c : a.toCharArray()){
            arr[c - 97]++ ;
        }
        for (char c : b.toCharArray()){
            arr[c - 97]-- ;
        }
        for(int n : arr){
           if(n != 0){
               return false;
           }
        }
        return true;
    }
}

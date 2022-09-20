package com.lizi.year2022.month5.day0517;

/**
 * @author lizi
 * @description TODO
 * @date 2022/5/17 19:59
 **/
public class OneTopic0517 {
    public static void main(String[] args) {
       // isAlienSorted(new String[]{"hello","leetcode"}, "hlabcdefgijkmnopqrstuvwxyz");
        Math.pow(2,16);
    }
    public static boolean isAlienSorted(String[] words, String order) {
        int len = order.length();
        int[] arr = new int[26];
        for (int i = 0; i < len; i++) {
            arr[order.charAt(i) - 97] = i;
        }
        for(int i = 1; i < words.length; i++){
            if(words[i].length() < words[i - 1].length()){
                return false;
            }
            int minLen = Math.min(words[i].length(), words[i - 1].length());
            String str2 = words[i].substring(0, minLen);
            String str1 = words[i - 1].substring(0, minLen);
            for (int j = 0; j < minLen; j++) {
                if(arr[str1.charAt(j) - 97] > arr[str2.charAt(j) - 97]){
                    return false;
                }
            }
        }
        return true;
    }
}

package com.lizi.year2022.month5.day0524;

/**
 * @author lizi
 * @description TODO
 * @date 2022/5/25 13:51
 **/
public class OneTopic0524 {
    public static void main(String[] args) {
       findSubstringInWraproundString("abcdefghijklmnopqrstuvwxyzabcdefghijklmnopqrstuvwxyzabcdefghijklmnopqrstuvwxyzabcdefghijklmnopqrstuvwxyz");
    }
    public static int findSubstringInWraproundString(String p) {
      int ans = 0;
      int len = p.length();
      int[] word = new int[26];
      int maxLen = 0;
        for (int i = 0; i < len; i++) {
            if(i > 0 && (p.charAt(i) - p.charAt(i - 1) == 1 || p.charAt(i - 1) - p.charAt(i) == 25)){
                maxLen++ ;
            }else{
                maxLen = 1;
            }
            int idx = p.charAt(i) - 97;
            word[idx] = Math.max(word[idx], maxLen);
        }
        for (int n : word){
            ans += n;
        }
      return ans;
    }
}

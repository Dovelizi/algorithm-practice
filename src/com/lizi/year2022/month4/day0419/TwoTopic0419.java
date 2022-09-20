package com.lizi.year2022.month4.day0419;

/**
 * @author lizi
 * @description TODO
 * @date 2022/4/19 11:12
 **/
public class TwoTopic0419 {
    public static void main(String[] args) {
        shortestToChar("loveleetcode", 'e');
    }
    public static int[] shortestToChar(String s, char c) {
        int[] ans = new int[s.length()];
        int pre = 0, next = 0;
        for (int i = 0; i < s.length(); i++) {
            pre = i;
            next = i;
            while(s.charAt(pre) != c && s.charAt(next) != c){
                if(pre > 0){
                    pre-- ;
                }
                if(next < s.length() - 1){
                    next++ ;
                }
            }
            if(s.charAt(pre) == c && s.charAt(next) != c){
                ans[i] = i - pre;
            }else if(s.charAt(pre) != c && s.charAt(next) == c){
                ans[i] = next - i;
            }else{
                ans[i] = Math.min(i - pre, next - i);
            }

        }
        return ans;
    }
}

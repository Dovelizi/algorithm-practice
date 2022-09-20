package com.lizi.year2022.month9.day0918;

/**
 * @author lizi
 * @date 2022/9/18 10:21
 * @description TODO
 **/
public class Two0918 {
    public int longestContinuousSubstring(String s) {
        int ans = 1;
        int len = s.length();
        if(len < 2){
            return ans;
        }
        int count = 1;
        for (int i = 0; i < len - 1; i++) {
            if(s.charAt(i + 1) - s.charAt(i) == 1){
                count++ ;
            }else{
                count = 1;
            }
            ans = Math.max(count, ans );
        }
        return ans;
    }
}

package com.lizi.year2022.month8.day0814;

/**
 * @author lizi
 * @description TODO
 * @date 2022/8/14 21:18
 **/
public class One0814 {
    public int maxScore(String s) {
        int zeroNumber = 0, oneNumber = 0;
        int ans = 0;
        for (char c : s.toCharArray()){
            if(c == '1'){
                oneNumber++ ;
            }
        }
        if(oneNumber == s.length() || oneNumber == 0){
            return s.length() - 1;
        }
        for (int i = 0; i < s.length(); i++) {
            if(s.charAt(i) == '1'){
                oneNumber-- ;
            }else {
                if(i != s.length() - 1){
                    zeroNumber++ ;
                }
            }
            ans = Math.max(oneNumber + zeroNumber, ans);
        }
        return ans;
    }
}

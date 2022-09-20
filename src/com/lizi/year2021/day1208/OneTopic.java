package com.lizi.year2021.day1208;

/**
 * @author lizi
 * @description TODO
 * @date 2021/12/8 09:53
 **/
public class OneTopic {
    public static void main(String[] args) {
        String str = "1212321232";
        translateNum(506);
    }
    public static int translateNum(int num) {
        String str = String.valueOf(num);
        int dp[] = new int[str.length()+1];
        dp[0] = 1;
        dp[1] = 1;
        for(int i = 2; i <= str.length(); i++){
            int cur = Integer.parseInt(str.substring(i - 2, i));
            if( cur < 26 && cur > 9){
                dp[i] = dp[i - 1] + dp[i - 2];
            }else{
                dp[i] = dp[i - 1];
            }
        }
        return dp[str.length()];
    }
}

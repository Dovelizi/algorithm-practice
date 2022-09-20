package com.lizi.year2022.month4.day0424;

/**
 * @author lizi
 * @description TODO
 * @date 2022/4/24 15:07
 **/
public class FourTopic0424 {
    public static void main(String[] args) {
        binaryGap(22);
    }
    public static int binaryGap(int n) {
        StringBuilder sb = new StringBuilder();
        int ans = 0;
        for (int i = 31; i >= 0; i--) {
            sb.append((((1<<i) & n) == 0) ? "0" : "1");
        }
        int pre = 0;
        for (int i = 0; i < sb.length(); i++) {
            if(sb.charAt(pre) == '1' && sb.charAt(i) == '1'){
                ans = Math.max(ans, i - pre);
                pre = i;
            }else {
                if(sb.charAt(pre) != '1'){
                    pre++ ;
                }
            }
        }
        return ans;
    }
}

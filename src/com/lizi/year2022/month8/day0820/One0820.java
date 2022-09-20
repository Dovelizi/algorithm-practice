package com.lizi.year2022.month8.day0820;

/**
 * @author lizi
 * @description TODO
 * @date 2022/8/20 10:02
 **/
public class One0820 {
    public static void main(String[] args) {
        minimumRecolors("WBBWWBBWBW", 7);
    }
    public static int minimumRecolors(String blocks, int k) {
        int ans = blocks.length();
        for (int i = 0; i < blocks.length(); i++) {
            int wNum = 0;
            for (int j = i; j <= blocks.length() - k; j++) {
                if(blocks.charAt(j) == 'W'){
                    wNum++ ;
                }
            }
            ans = Math.min(ans, wNum);
        }
        return ans;
    }
}

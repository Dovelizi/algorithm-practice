package com.lizi.year2022.month4.day0412;

import java.math.BigDecimal;

/**
 * @author lizi
 * @description TODO
 * @date 2022/4/12 23:30
 **/
public class OneTopic0412 {
    public static void main(String[] args) {
        BigDecimal b1 = new BigDecimal(10);
        BigDecimal b2 = new BigDecimal(3);
        b1.divide(b2, 15, BigDecimal.ROUND_HALF_UP);
       // numberOfLines(new int[]{4,10,10,10,10,10,10,10,10,10,10,10,10,10,10,10,10,10,10,10,10,10,10,10,10,10}, "bbbcccdddaaa");
    }
    public static int[] numberOfLines(int[] widths, String s) {
        int[] ans = new int[2];
        int sum = 0;
        int col = 0;
        for (char ch : s.toCharArray()){
            if(sum + widths[ch - 97] > 100){
                sum = 0;
                col++ ;
            }
            sum += widths[ch - 97];
        }
        ans[0] = col;
        ans[1] = sum;
        ans[0] = ans[1] == 0 ? ans[0] : ans[0] + 1;
        return ans;
    }
}

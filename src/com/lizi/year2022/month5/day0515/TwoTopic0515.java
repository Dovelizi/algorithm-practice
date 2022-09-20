package com.lizi.year2022.month5.day0515;

import java.util.Arrays;

/**
 * @author lizi
 * @description TODO
 * @date 2022/5/15 10:22
 **/
public class TwoTopic0515 {
    public static void main(String[] args) {
        maxConsecutive(2,9,new int[]{4,6});
    }
    public static int maxConsecutive(int bottom, int top, int[] special) {
        int ans = 0;
        int len = special.length;
        Arrays.sort(special);
        for (int i = 1; i < len; i++) {
            ans = Math.max(special[i] - special[i-1] - 1, ans);
        }
        if(special[0] - 1 >= bottom){
            ans = Math.max(special[0] - bottom, ans);
        }
        if(special[len - 1] + 1 <= top){
            ans = Math.max(top - special[len - 1], ans);
        }
        return ans;
    }
}

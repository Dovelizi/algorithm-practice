package com.lizi.year2022.month5.day0515;

/**
 * @author lizi
 * @description TODO
 * @date 2022/5/15 10:22
 **/
public class ThreeTopic0515 {
    public static void main(String[] args) {
        largestCombination(new int[]{16,17,71,62,12,24,14});
    }
    public static int largestCombination(int[] candidates) {
        int ans = 0;
        for (int i = 0; i < 32; i++) {
            int temp = 0;
            for(int num : candidates){
                if((num >> i & 1) == 1){
                    temp++ ;
                }
            }
            ans = Math.max(temp, ans);
        }
        return ans;
    }
}

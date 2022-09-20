package com.lizi.year2021.day1206;

/**
 * @author lizi
 * @description TODO
 * @date 2021/12/6 15:20
 **/
public class ThreeTopic2 {
    public static void main(String[] args) {
        maxProfit(new int[]{2,1,2,0,1});
    }
    public static int maxProfit(int[] prices) {
        int pre = 0;
        int len = prices.length;
        int result = 0;
        int maxNum = Integer.MIN_VALUE;
        for(int i = 0; i < len - 1; i++){
            if(prices[i] <= prices[i + 1]){
                pre = i;
                while(pre++ < len - 1){
                    maxNum = Math.max(maxNum,prices[pre]);
                }
                result = Math.max(result,maxNum - prices[i]);
                maxNum = Integer.MIN_VALUE;
            }

        }
        return result;
    }
}

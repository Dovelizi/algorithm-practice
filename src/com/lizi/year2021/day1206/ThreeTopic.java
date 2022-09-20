package com.lizi.year2021.day1206;

/**
 * @author lizi
 * @description TODO
 * @date 2021/12/6 13:22
 **/
public class ThreeTopic {
    public static void main(String[] args) {
        maxProfit(new int[]{3,3,5,0,0,3,1,4});
    }
    public static int maxProfit(int[] prices) {
        int buy = -1;
        int sell = -1;
        int makeMoney = 0;
        int len = prices.length;
        int idx = 0;
        if (len == 1) {
            return 0;
        }
        if (len == 2){
            return prices[0] <= prices[1] ? prices[1] - prices[0] : 0;
        }
        while(idx < len){
            if(buy == -1){
                buy = minimum(idx,prices);
            }
            if(buy != -1 && sell == -1){
                sell = maximum(idx,prices);
            }
            if(sell != -1 && buy != -1){
                makeMoney = Math.max(sell - buy,makeMoney);
                for (int i = idx; i < len; i++) {
                    if (sell == prices[i]){
                        idx = i;
                        break;
                    }
                }
                buy = -1;
                sell = -1;
            }
            idx++ ;
        }
        return makeMoney;
    }
    public static int minimum(int idx,int[] prices){
        if(idx == 0 && prices[idx] <= prices[idx + 1]){
            return prices[idx];
        }
        if(idx < prices.length - 1 && idx > 0 && prices[idx] <= prices[idx - 1] && prices[idx] <= prices[idx + 1]){
            return prices[idx];
        }
        return -1;
    }
    public static int  maximum(int idx,int[] prices){
        int maxNum = -1;
        if(idx == prices.length - 1 && prices[idx] > prices[idx - 1]){
            return prices[idx];
        }
        for (int i = idx; i < prices.length; i++) {
            if(i == prices.length - 1 || prices[i] > prices[i + 1]){
                maxNum = Math.max(maxNum,prices[i]);
            }
        }
        return maxNum;
    }
}

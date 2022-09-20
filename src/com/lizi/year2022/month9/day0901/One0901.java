package com.lizi.year2022.month9.day0901;

/**
 * @author lizi
 * @date 2022/9/1 09:56
 * @description TODO
 **/
public class One0901 {
    public static void main(String[] args) {
        finalPrices(new int[]{8,4,6,2,3});
    }
    public static int[] finalPrices(int[] prices) {
        int len = prices.length;
        int[] idxArr = new int[len];
        for (int i = 0; i < len; i++) {
            for (int j = i + 1; j < len; j++) {
                if(prices[j] <= prices[i]){
                    idxArr[i] = prices[j];
                    break;
                }
            }
            prices[i] -= idxArr[i];
        }
        return prices;
    }
}

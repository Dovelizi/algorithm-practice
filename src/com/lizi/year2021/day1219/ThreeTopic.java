package com.lizi.year2021.day1219;

import java.util.*;

/**
 * @author lizi
 * @description TODO
 * @date 2021/12/19 11:05
 **/
public class ThreeTopic {
    public static void main(String[] args) {
        getDescentPeriods(new int[]{8,6,7,7});
    }
    public static long getDescentPeriods(int[] prices) {
        int len = prices.length;
        long res = len;
        int pre = 0;
        long descNum = 0;
        Set<Integer> set = new HashSet<>();
        while(pre < len - 1){
            //set.add(prices[pre]);
            if(prices[pre] - prices[pre+1] == 1){
                set.add(prices[pre]);
                descNum += set.size();
            }else{
                set.clear();
            }
            pre++ ;
        }
        return res + descNum;
    }
    public static boolean isDesc(int[] prices,int pre, int next){
        while (pre < next){
            if(prices[pre] - prices[pre+1] != 1){
                return false;
            }
            pre++ ;
        }
        return true;
    }
}

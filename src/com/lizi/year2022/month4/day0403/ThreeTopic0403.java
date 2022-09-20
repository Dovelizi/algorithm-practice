package com.lizi.year2022.month4.day0403;

import java.util.Arrays;

/**
 * @author lizi
 * @description TODO
 * @date 2022/4/3 11:44
 **/
public class ThreeTopic0403 {
    public int maximumCandies(int[] candies, long k) {
        Arrays.sort(candies);
        long sum = 0L;
        int ans = 0;
        for(int n : candies){
            sum += n;
        }
        if(sum < k){
            ans = 0;
        }
        if(candies[0] * k < sum){
            ans = candies[0];
        }else{
            int g = candies[0];
            long temp = g  * k;
            while (temp > sum){
                g-- ;
                temp = g * k;
            }
            ans = g;
        }
        return ans;
    }
}

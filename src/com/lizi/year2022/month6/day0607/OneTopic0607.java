package com.lizi.year2022.month6.day0607;

import java.util.Arrays;

/**
 * @author lizi
 * @description TODO
 * @date 2022/6/7 08:53
 **/
public class OneTopic0607 {
    public static void main(String[] args) {
        minEatingSpeed(new int[]{3,6,7,11}, 8);
    }
    public static int minEatingSpeed(int[] piles, int h) {
        int ans = 0;
        int len = piles.length;
        Arrays.sort(piles);
        int minValue = 1;
        int maxValue = piles[len - 1];
        while(minValue < maxValue){
            int mid = (minValue + maxValue) >> 1;
            if(calcTime(mid, piles) > h){
                minValue = mid + 1;
            }else if(calcTime(mid, piles) < h){
                maxValue = mid - 1;
            }else{
                ans = mid;
                break;
            }
        }
        return ans;
    }
    public static int calcTime(int speed, int[] piles){
        int time = 0;
        for (int n : piles){
            time += n % speed == 0 ? n / speed : n / speed + 1;
        }
        return time;
    }
}

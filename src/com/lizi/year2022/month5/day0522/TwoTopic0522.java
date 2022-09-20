package com.lizi.year2022.month5.day0522;

import java.util.Arrays;

/**
 * @author lizi
 * @description TODO
 * @date 2022/5/22 10:26
 **/
public class TwoTopic0522 {
    public static void main(String[] args) {
        maximumBags(new int[]{2,3,4,5}, new int[]{1,2,4,4}, 2);
    }
    public static int maximumBags(int[] capacity, int[] rocks, int additionalRocks) {
        int ans = 0;
        int len = capacity.length;
        int[] arr = new int[len];
        for (int i = 0; i < len; i++) {
            arr[i] = capacity[i] - rocks[i];
        }
        Arrays.sort(arr);
        for(int n : arr){
            additionalRocks -= n;
            if(additionalRocks >= 0){
                ans++ ;
            }else{
                break;
            }
        }
        return ans;
    }
}

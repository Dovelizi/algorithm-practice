package com.lizi.year2021.day1220;

import java.util.Arrays;

/**
 * @author lizi
 * @description TODO
 * @date 2021/12/20 08:55
 **/
public class OneTopic {
    public static void main(String[] args) {
//        findRadius(new int[]{282475249,622650073,984943658,144108930,470211272,101027544,457850878,458777923}
//                ,new int[]{823564440,115438165,784484492,74243042,114807987,137522503,441282327,16531729,823378840,143542612});
        findRadius(new int[]{11,2,3,5,7,8,12,34,56,23,45,67,4}, new int[]{5,6,34});
        long n = 9;
        int n1 = 3;
        System.out.println("dd");
    }
    public static int findRadius(int[] houses, int[] heaters) {
        int maxRedius = heaters[0] - 1;
        int minRedius = Integer.MAX_VALUE;
        int housesLen = houses.length;
        int heatersLen = heaters.length;
        Arrays.sort(houses);
        Arrays.sort(heaters);
        if(heatersLen == 1){
            return Math.max(maxRedius, houses[housesLen - 1] - heaters[0]);
        }
        for(int n : houses){
            for(int i = 0; i < heatersLen; i++){
                if(heaters[i] >= n){
                    if(i == 0){
                        minRedius = heaters[i] - n;
                    }else{
                        minRedius = Math.min(heaters[i] - n, heaters[i-1] - n);
                    }
                    maxRedius = Math.max(minRedius,maxRedius);
                }
            }
        }
        return maxRedius;
    }
}

package com.lizi.year2022.month9.day0924;

/**
 * @author lizi
 * @date 2022/9/24 16:04
 * @description TODO
 **/
public class One0924 {
    public static void main(String[] args) {
        temperatureTrend(new int[]{-14,7,-19,9,13,40,19,15,-18}, new int[]{3,16,28,32,25,12,13,-6,4});
    }
    public static int temperatureTrend(int[] temperatureA, int[] temperatureB) {
        int len = temperatureA.length;
        int ans = 0;
        int[] arrA = new int[len];
        int[] arrB = new int[len];
        int[] arrC = new int[len - 1];
        for (int i = 0; i < len - 1; i++) {
            arrA[i + 1] = Integer.compare(temperatureA[i+1] ,temperatureA[i]);
            arrB[i + 1] = Integer.compare(temperatureB[i+1] ,temperatureB[i]);
        }
        for (int i = 1; i < len; i++) {
            if(arrA[i] == arrB[i]){
                arrC[i - 1] = 0;
            }else{
                arrC[i - 1] = 2;
            }
        }
        int count = 0;
        for (int i = 0; i < len - 1; i++) {
           if(arrC[i] == 0){
               count++ ;
           }else{
               ans = Math.max(ans, count);
               count = 0;
           }
           ans = Math.max(ans, count);
        }
        return ans;
    }
}

package com.lizi.year2022.month1.day0102;

import java.util.Arrays;

/**
 * @author lizi
 * @description TODO
 * @date 2022/1/2 10:59
 **/
public class ThreeTopic {
    public static void main(String[] args) {
        asteroidsDestroyed(5,new int[]{4,9,23,4});
    }
    public static boolean asteroidsDestroyed(int mass, int[] asteroids) {
        Arrays.sort(asteroids);
        long totalQua = mass;
        for(int n : asteroids){
            if(totalQua < n){
                return false;
            }else{
                totalQua += n;
            }
        }
        return true;
    }
}

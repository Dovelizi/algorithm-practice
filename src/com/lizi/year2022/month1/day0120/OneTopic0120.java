package com.lizi.year2022.month1.day0120;

/**
 * @author lizi
 * @description TODO
 * @date 2022/1/20 09:29
 **/
public class OneTopic0120 {
    public static void main(String[] args) {
        stoneGameIX(new int[]{20,3,20,17,2,12,15,17,4});
    }
    public static boolean stoneGameIX(int[] stones) {
            int[] flag = new int[3];
            for(int num : stones){
                flag[num % 3]++ ;
            }
            if((flag[0] & 1) == 0){
                return flag[1] != 0 && flag[2] != 0;
            }
            return flag[2] - 2 > flag[1] || flag[1] - 2 > flag[2];
    }
}

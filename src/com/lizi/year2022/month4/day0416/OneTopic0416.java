package com.lizi.year2022.month4.day0416;

import java.util.Arrays;

/**
 * @author lizi
 * @description TODO
 * @date 2022/4/16 15:33
 **/
public class OneTopic0416 {
    public static void main(String[] args) {
        giveGem(new int[]{100,0,50,100},new int[][]{{0,1},{0,2}});
    }
    public static int giveGem(int[] gem, int[][] operations) {
        int[] copyArr = Arrays.copyOf(gem, gem.length);
        Arrays.sort(copyArr);
        int max = copyArr[gem.length - 1];
        int min = copyArr[0];
        int len = operations.length;
        if(len == 0){
            return max - min;
        }
        for (int i = 0; i < len; i++) {
            int x = operations[i][0];
            int y = operations[i][1];
            gem[y] += gem[x] / 2;
            gem[x] -= gem[x] / 2;
        }
        Arrays.sort(gem);
        max = gem[gem.length - 1];
        min = gem[0];
        return max - min;
    }
}

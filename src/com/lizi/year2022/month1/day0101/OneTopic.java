package com.lizi.year2022.month1.day0101;

/**
 * @author lizi
 * @description TODO
 * @date 2022/1/1 21:21
 **/
public class OneTopic {
    public static void main(String[] args) {
        construct2DArray(new int[]{1,2},1,1);
    }
    public static int[][] construct2DArray(int[] original, int m, int n) {
        if(m * n != original.length){
            return new int[0][0];
        }
        int[][] resArr = new int[m][n];
        int col = 0;
        resArr[0][0] = original[0];
        for(int i = 1; i < original.length; i++){
            int temp = i % n;
            if(temp == 0){
                col++ ;
            }
            resArr[col][temp] = original[i];
        }
        return resArr;
    }
}

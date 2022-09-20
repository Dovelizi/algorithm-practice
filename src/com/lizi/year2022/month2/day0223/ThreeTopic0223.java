package com.lizi.year2022.month2.day0223;

/**
 * @author lizi
 * @description TODO
 * @date 2022/2/23 13:20
 **/
public class ThreeTopic0223 {
    public static void main(String[] args) {
        rotate(new int[][]{{1,2,3},{4,5,6},{7,8,9}});
    }
    public static void rotate(int[][] matrix) {
        int size = matrix.length;
        int flag = 0;
        for(int i = 0; i < size; i++){
            flag = size - 1;
            for(int j = 0; j < size; j++){
                int temp = matrix[i][j];
                matrix[i][j] = matrix[j + flag][i];
                matrix[j + flag][i] = temp;
                flag -= 2;
            }
        }
        System.out.println("ll");
    }
}

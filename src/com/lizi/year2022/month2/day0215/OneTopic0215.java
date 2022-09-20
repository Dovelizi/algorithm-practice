package com.lizi.year2022.month2.day0215;

import java.util.ArrayList;
import java.util.List;

/**
 * @author lizi
 * @description TODO
 * @date 2022/2/15 09:15
 **/
public class OneTopic0215 {
    public static void main(String[] args) {
        int[][] arr = {{1,10,4,2},{9,3,8,7},{15,16,17,12}};
        luckyNumbers(arr);
    }
    public static List<Integer> luckyNumbers (int[][] matrix) {
        List<Integer> resList = new ArrayList<>();
        int col = matrix[0].length;
        int row = matrix.length;
        int minNum = Integer.MAX_VALUE;
        int minNumIdx = 0;
        int[] minArr = new int[row];
        for(int i = 0; i < row; i++){
            for(int j = 0; j < col; j++){
                if(matrix[i][j] < minNum){
                    minNum = matrix[i][j];
                    minNumIdx = j;
                }
            }
            minArr[i] = minNumIdx;
            minNum = Integer.MAX_VALUE;
        }

        for(int i = 0; i < minArr.length; i++){
            boolean flag = true;
            for(int j = 0; j < row; j++){
                if(matrix[j][minArr[i]] >= matrix[i][minArr[i]] && j != i){
                    flag = false;
                    break;
                }
            }
            if(flag){
                resList.add(matrix[i][minArr[i]]);
            }
        }
        return resList;
    }
}

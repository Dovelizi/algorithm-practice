package com.lizi.year2022.month9.day0930;

import java.util.HashSet;
import java.util.Set;

/**
 * @author lizi
 * @date 2022/9/30 09:25
 * @description 面试题 01.08. 零矩阵
 **/
public class One0930 {
    public void setZeroes(int[][] matrix) {
        int lenRow = matrix.length;
        int lenCol = matrix[0].length;
        Set<Integer> setRow = new HashSet<>();
        Set<Integer> setCol = new HashSet<>();
        for (int i = 0; i < lenRow; i++) {
            for (int j = 0; j < lenCol; j++) {
                if(matrix[i][j] == 0){
                    setRow.add(i);
                    setCol.add(j);
                }
            }
        }
        for(Integer row : setRow){
            for (int i = 0; i < lenCol; i++) {
                matrix[row][i] = 0;
            }
        }
        for(Integer col : setCol){
            for (int i = 0; i < lenRow; i++) {
                matrix[i][col] = 0;
            }
        }
    }
}

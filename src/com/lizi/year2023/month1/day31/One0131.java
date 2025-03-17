package com.lizi.year2023.month1.day31;

import java.util.Arrays;

/**
 * @author lizi
 * @date 2023/1/31 08:56
 * @description 2319. 判断矩阵是否是一个 X 矩阵
 **/
public class One0131 {
    public boolean checkXMatrix(int[][] grid) {
        boolean ans = false;
        int len = grid.length;
        int sum = 0, totalSum = 0;
        for (int i = 0; i < len; i++) {
            if(grid[i][i] == 0 || grid[i][len - 1 - i] == 0){
                return ans;
            }else {
                sum += grid[i][len - 1 - i];
                if(2 * i != len - 1){
                    sum += grid[i][i];
                }
            }
        }
        for (int[] arr : grid){
            totalSum += Arrays.stream(arr).sum();
        }
        return totalSum - sum == 0;
    }
}

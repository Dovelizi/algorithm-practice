package com.lizi.year2022.month8.day0818;

/**
 * @author lizi
 * @description TODO
 * @date 2022/8/18 11:06
 **/
public class One0818 {
    public static int[][] largestLocal(int[][] grid) {
        int len = grid.length;
        int[][] ans = new int[len - 2][len - 2];
        for(int i = 0; i < ans.length; i++){
            for (int j = 0; j < ans[0].length; j++){
                ans[i][j] = calcMaxGrid(grid, i + 1, j + 1);
            }
        }
        return ans;
    }
    public static int calcMaxGrid(int[][] grid, int col, int row){
        int max = 0;
        for(int i = col - 1; i <= col + 1; i++){
            for (int j = row - 1; j <= row + 1; j++){
                max = Math.max(grid[i][j], max);
            }
        }
        return max;
    }
}

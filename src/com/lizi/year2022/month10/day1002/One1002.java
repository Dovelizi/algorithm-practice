package com.lizi.year2022.month10.day1002;

/**
 * @author lizi
 * @date 2022/10/2 10:29
 * @description 6193. 沙漏的最大总和
 **/
public class One1002 {
    public static void main(String[] args) {
        maxSum(new int[][]{{6,2,1,3},{4,2,1,5},{9,2,8,7},{4,1,2,9}});
    }
    public static int maxSum(int[][] grid) {
        int ans = 0;
        int col = grid.length;
        int row = grid[0].length;
        for (int i = 1; i < col - 1; i++) {
            for (int j = 1; j < row - 1; j++) {
                int sum = grid[i - 1][j - 1] + grid[i - 1][j] + grid[i - 1][j + 1]+
                        grid[i][j]+
                        grid[i + 1][j - 1] + grid[i + 1][j] + grid[i + 1][j + 1];
                ans = Math.max(ans, sum);
            }
        }
        return ans;
    }
}

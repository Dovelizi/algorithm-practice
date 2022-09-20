package com.lizi.year2022.month3.day0312;

/**
 * @author lizi
 * @description TODO
 * @date 2022/3/12 10:39
 **/
public class OneTopic0312 {
    public static void main(String[] args) {
        minPathSum(new int[][]{{1,3,1},{1,5,1},{4,2,1}});
    }
    static int minPath = Integer.MAX_VALUE;
    public static int minPathSum(int[][] grid) {
        dfsFindPath(grid, 0, 0, new boolean[grid.length][grid[0].length],0);
        return minPath;
    }
    public static void dfsFindPath(int[][] grid, int col, int row, boolean[][] vis, int minSum){
        if(col == grid.length - 1 && row == grid[0].length - 1){
            minPath = Math.min(minSum, minPath);
        }

        if(col >= grid.length || row >= grid[0].length || vis[col][row]){
                return;
            }
            vis[col][row] = true;
            minSum += grid[col][row];
            dfsFindPath(grid, col + 1, row, vis, minSum);
            dfsFindPath(grid, col, row + 1, vis, minSum);
            minSum -= grid[col][row];
            vis[col][col] = false;
        }

}

package com.lizi.year2022.month6.day0626;

/**
 * @author lizi
 * @description TODO
 * @date 2022/6/26 10:33
 **/
public class OneTopic0626 {
    public static void main(String[] args) {
        checkXMatrix(new int[][]{{2, 0, 0, 1},{0,3,1,0},{0,5,2,0},{4,0,0,2}});
    }
    public static boolean checkXMatrix(int[][] grid) {
        int len = grid.length;
        for (int i = 0; i < len; i++) {
            for (int j = 0; j < grid[i].length; j++) {
                if(i == j || (i + j) == len - 1){
                    if(grid[i][j] == 0){
                        return false;
                    }
                }else{
                    if(grid[i][j] != 0){
                        return false;
                    }
                }
            }
        }
        return true;
    }
}

package com.lizi.year2022.month4.day0426;

/**
 * @author lizi
 * @description TODO
 * @date 2022/4/26 11:10
 **/
public class OneTopic0426 {
    public static void main(String[] args) {
        projectionArea(new int[][]{{1,2},{3,4}});
    }
    public static int projectionArea(int[][] grid) {
        int upToDown = 0;
        int[] leftToright = new int[grid[0].length];
        int[] before = new int[grid.length];
        for(int i = 0; i < grid.length; i++){
            upToDown += grid[i].length;
            for(int j = 0; j < grid[i].length; j++){
                if(grid[i][j] == 0){
                    upToDown-- ;
                }
                leftToright[j] = Math.max(leftToright[j], grid[i][j]);
                before[i] = Math.max(before[i], grid[i][j]);
            }
        }
        for(int n : leftToright){
            upToDown += n;
        }
        for(int n : before){
            upToDown += n;
        }
        return upToDown;
    }
}

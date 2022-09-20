package com.lizi.year2022.month3.day0313;

/**
 * @author lizi
 * @description TODO
 * @date 2022/3/13 10:25
 **/
public class TwoTopic0313 {
    public static void main(String[] args) {
        int[][] artifacts = {{4,5,5,5},{5,1,7,1},{1,8,3,8},{1,1,1,2},{0,5,3,5},{6,2,7,2},{7,5,7,6},{6,4,6,6},{2,7,5,7},{0,2,0,2},{7,7,8,8},{3,1,4,2},{2,3,3,3},{5,3,7,3},{8,4,8,4},{2,6,5,6},{8,1,8,2},{4,8,4,8},{1,0,4,0},{6,8,6,8},{1,3,1,4},{0,7,0,8},{0,3,0,4},{0,6,0,6}};
        int[][] dig = {{0,3},{0,4},{8,5},{8,6},{8,7},{0,8},{8,8},{0,6},{1,1},{1,8},{2,0},{2,2},{2,3},{2,4},{2,5},{2,8},{3,2},{3,3},{3,4},{3,5},{3,6},{3,7},{4,0},{4,3},{4,4},{4,6},{4,7},{5,1},{5,2},{5,6},{5,8},{6,0},{6,2},{6,4},{6,5},{6,6},{7,0},{7,1},{7,4},{7,5},{7,7}};
        digArtifacts(9,artifacts, dig);
    }
    public static int digArtifacts(int n, int[][] artifacts, int[][] dig) {
        int resNum = 0;
        boolean[][] vis = new boolean[n][n];
        for(int[] a : dig){
           vis[a[0]][a[1]] = true;
        }

        for(int[] path : artifacts){
            boolean flag = false;
            for(int i = path[0]; i <= path[2]; i++){
                for(int j = path[1]; j <= path[3];j++){
                    if(!vis[i][j]){
                        flag = true;
                        break;
                    }
                }
            }
            if(!flag){
                resNum++ ;
            }
        }
        return resNum;
    }

}

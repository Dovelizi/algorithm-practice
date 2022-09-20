package com.lizi.year2021.day1223;

/**
 * @author lizi
 * @description TODO
 * @date 2021/12/23 09:16
 **/
public class OneTopic {
    public static void main(String[] args) {
//        spiralOrder(new int[][]{
//                {1,2,3,4,5,6},
//                {7,8,9,10,11,12},
//                {13,14,15,16,17,18},
//                {19,20,21,22,23,24}
//        });
        spiralOrder(new int[][]{{1,2},{4,5},{7,8}});
    }
    public static int[] spiralOrder(int[][] matrix) {
        int col = matrix.length;
        if(col < 1){
            return new int[0];
        }
        int row = matrix[0].length;
        int size = col * row;
        int[] resArr = new int[size];
        int idxCol = 0;
        int idxRow = 0;
        while(size > 0){
            // 向右
            while((idxRow < (row - 1) && matrix[idxCol][idxRow + 1] != -1) || size == 1){
                resArr[resArr.length - size] = matrix[idxCol][idxRow];
                matrix[idxCol][idxRow] = -1;
                idxRow++ ;
                size-- ;
                if(size == 0){
                    return resArr;
                }
            }
            // 向下
            while ((idxCol < (col - 1) && matrix[idxCol + 1][idxRow] != -1) || size == 1){
                resArr[resArr.length - size] = matrix[idxCol][idxRow];
                matrix[idxCol][idxRow] = -1;
                idxCol++ ;
                size-- ;
                if(size == 0){
                    return resArr;
                }
            }
            // 向左
            while((idxRow > 0 && matrix[idxCol][idxRow - 1] != -1) || size == 1){
                resArr[resArr.length - size] = matrix[idxCol][idxRow];
                matrix[idxCol][idxRow] = -1;
                idxRow-- ;
                size-- ;
                if(size == 0){
                    return resArr;
                }
            }
            // 向上
            while (idxCol > 0 && (matrix[idxCol - 1][idxRow] != -1) || size == 1){
                resArr[resArr.length - size] = matrix[idxCol][idxRow];
                matrix[idxCol][idxRow] = -1;
                size-- ;
                idxCol-- ;
                if(size == 0){
                    return resArr;
                }
            }
        }
        return resArr;
    }
}

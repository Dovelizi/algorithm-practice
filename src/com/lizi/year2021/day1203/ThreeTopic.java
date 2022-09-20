package com.lizi.year2021.day1203;

/**
 * @author lizi
 * @description TODO
 * @date 2021/12/4 00:09
 **/
public class ThreeTopic {
    public static void main(String[] args) {
        int[][] arr = new int[][]{
                {2,5},{2,8}, {7,9}, {7,11},{9,11}
        };
        findNumberIn2DArray(arr,7);
    }
    public static boolean findNumberIn2DArray(int[][] matrix, int target) {
        int rowNum = 0;
        if(matrix.length != 0 && matrix[0].length != 0){
            for(int i = 0; i <= matrix[0].length; i++){
                if(matrix[0][i] == target){
                    return true;
                }
                if(matrix[0][i] > target){
                    rowNum = i - 1;
                    break;
                }
                if (i == matrix[0].length - 1){
                    rowNum = i;
                    break;
                }
            }

            for(int i = 0; i < matrix.length; i++){
                if(rowNum >= 0 && matrix[i][rowNum] == target){
                    return true;
                }
                if(rowNum >= 0 && matrix[i][rowNum] > target){
                    while(rowNum >= 0){
                        if(matrix[i][rowNum] == target){
                            return true;
                        }
                        if(matrix[i][rowNum] < target){
                            break;
                        }
                        rowNum--;
                    }
                }
            }
        }
        return false;
    }
}

package com.lizi.year2022.month7.day0712;

import java.util.*;

/**
 * @author lizi
 * @description TODO
 * @date 2022/7/12 09:44
 **/
public class OneTopic0712 {
    public static void main(String[] args) {
        oddCells(2,3, new int[][]{{0,1},{1,1}});
    }
    public static int oddCells(int m, int n, int[][] indices) {
        int[][] arr = new int[m][n];
        int ans = 0;
        for (int[] a : arr){
            Arrays.fill(a,0);
        }
        List<Integer> listCol = new ArrayList<>();
        List<Integer> listRow = new ArrayList<>();
        for (int[] a : indices){
            listCol.add(a[0]);
            listRow.add(a[1]);
        }

        for(int num : listCol){
            for (int i = 0; i < n; i++) {
                arr[num][i]++ ;
            }
        }

        for (int num : listRow){
            for (int i = 0; i < m; i++){
                arr[i][num]++;
            }
        }

        for (int i = 0; i < m; i++) {
            for (int j = 0; j < n; j++) {
                if((arr[i][j] & 1) == 1){
                    ans++ ;
                }
            }
        }
        return ans;
    }
}

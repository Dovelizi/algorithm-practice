package com.lizi.year2022.month9.day0904;

import javafx.util.Pair;

import java.util.*;
import java.util.stream.Collectors;

/**
 * @author lizi
 * @date 2022/9/3 22:30
 * @description TODO
 **/
public class One0904 {
    public static void main(String[] args) {
        maximumRows(new int[][]{{1,0,1,1,1,1},{0,0,0,1,1,0},{1,1,0,0,0,0},{0,0,1,1,0,1}}, 2);
    }
    public static int maximumRows(int[][] mat, int cols) {
        int ans = 0;
        int row = mat.length;
        int col = mat[0].length;
        List<Pair<Integer, Integer>> list = new ArrayList<>();
        int[] maxCountRow = new int[col];
        for (int i = 0; i < col; i++) {
            for (int j = 0; j < row; j++) {
                maxCountRow[i] += mat[j][i] == 1 ? 1 : 0;
            }
        }
        for (int i = 0; i < maxCountRow.length; i++) {
            list.add(new Pair<>(i, maxCountRow[i]));
        }
       list = list.stream().sorted((o1, o2) -> o2.getValue() - o1.getValue()).collect(Collectors.toList());

       while (cols-- > 0){
           for (int i = 0; i < row; i++) {
               mat[i][list.get(cols).getKey()] = -1;
           }
       }

        for (int i = 0; i < row; i++) {
            boolean flag = true;
            for (int j = 0; j < col; j++) {
                if(mat[i][j] == 1){
                    flag = false;
                }
            }
            ans += flag ? 1 : 0;
        }
        return ans;
    }
}

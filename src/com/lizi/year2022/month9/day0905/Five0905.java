package com.lizi.year2022.month9.day0905;

import javafx.util.Pair;

import java.util.HashSet;
import java.util.Set;

/**
 * @author lizi
 * @date 2022/9/5 10:14
 * @description TODO
 **/
public class Five0905 {
    public static void main(String[] args) {
        numSpecial(new int[][]{{1,0,0},{0,0,1},{1,0,0}});
    }
    public static int numSpecial(int[][] mat) {
        int ans = 0;
        int[] row = new int[101];
        int[] col = new int[101];
        Set<Pair<Integer, Integer>> set = new HashSet<>();
        for (int i = 0; i < mat.length; i++) {
            for (int j = 0; j < mat[0].length; j++) {
                if(mat[i][j] == 1){
                   row[i]++ ;
                   col[j]++ ;
                   set.add(new Pair<>(i, j));
                }
            }
        }
        for(Pair<Integer, Integer> pair : set){
            if(row[pair.getKey()] < 2 && col[pair.getValue()] < 2){
                ans++ ;
            }
        }
        return ans;
    }
}

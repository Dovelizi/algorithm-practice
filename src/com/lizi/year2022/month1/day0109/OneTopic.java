package com.lizi.year2022.month1.day0109;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

/**
 * @author lizi
 * @description TODO
 * @date 2022/1/9 10:32
 **/
public class OneTopic {
    public boolean checkValid(int[][] matrix) {
        int n = matrix.length;
        List<Integer> list = new ArrayList<>();
        for (int i = 1; i <= n; i++) {
            list.add(i);
        }
        for (int i = 0; i < n; i++) {
            Set<Integer> setCol = new HashSet<>();
            Set<Integer> setRow = new HashSet<>();
            int temp = n;
            while(--temp >= 0){
                if(list.contains(matrix[temp][i])){
                    setCol.add(matrix[temp][i]);
                }
                if(list.contains(matrix[i][temp])){
                    setRow.add(matrix[i][temp]);
                }
            }
            if(setCol.size() != n || setRow.size() != n){
                return false;
            }
        }
        return true;
    }
}

package com.lizi.year2022.month7.day0726;

import java.util.ArrayList;
import java.util.List;

/**
 * @author lizi
 * @description TODO
 * @date 2022/7/26 09:12
 **/
public class OneTopic0726 {
    public static void main(String[] args) {
        matrixReshape(new int[][]{{1,2}}, 1,1);
    }
    public static int[][] matrixReshape(int[][] mat, int r, int c) {
        int[][] ans = new int[r][c];
        int lenCol = mat.length;
        int lenRow = mat[0].length;
        if(lenCol * lenRow != r * c){
            return mat;
        }
        List<Integer> list = new ArrayList<>();
        int idx = 0;
        for(int i = 0; i < lenCol; i++){
            for(int j = 0; j < lenRow; j++){
                list.add(mat[i][j]);
            }
        }
        for(int i = 0; i < ans.length; i++){
            for(int j = 0; j < ans[0].length; j++){
                ans[i][j] = list.get(idx++);
            }
        }
        return ans;
    }
}

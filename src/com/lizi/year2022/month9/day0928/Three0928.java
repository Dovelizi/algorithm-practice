package com.lizi.year2022.month9.day0928;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/**
 * @author lizi
 * @date 2022/9/28 13:22
 * @description N 皇后
 **/
public class Three0928 {
    public static void main(String[] args) {
        solveNQueens(4);
    }
    static List<List<String>> ans = new ArrayList<>();
    static char[][] chars = null;
    public static List<List<String>> solveNQueens(int n) {
        chars = new char[n][n];
        for (char[] ch : chars){
            Arrays.fill(ch, '.');
        }
        traverse(chars, 0);
        return ans;
    }
    public static void traverse(char[][] chars, int row){
        if(row == chars.length){
            List<String> temp = new ArrayList<>();
            for(char[] ch : chars){
                StringBuilder stringBuilder = new StringBuilder();
                for (char c : ch){
                    stringBuilder.append(c);
                }
                temp.add(stringBuilder.toString());
            }
            ans.add(temp);
            return ;
        }
        for (int col = 0; col < chars[0].length; col++) {
            if(!isValid(chars, row, col)){
                continue ;
            }
            chars[row][col] = 'Q';
            traverse(chars, row + 1);
            chars[row][col] = '.';
        }
    }
    public static boolean isValid(char[][] chars, int row, int col){
        int n = chars[0].length;
        // 检查同列是否有其他皇后🫅
        for(int i = 0; i < row; i++){
            if(chars[i][col] == 'Q'){
                return false;
            }
        }
        // 检查左上角
        for (int i = row, j = col; i >= 0 && j >= 0; j--, i--) {
            if(chars[i][j] == 'Q'){
                return false;
            }
        }
        // 检查右上角
        for (int i = row, j = col; i >= 0 && j < n; j++, i--) {
            if(chars[i][j] == 'Q'){
                return false;
            }
        }
        return true;
    }
}

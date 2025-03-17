package com.lizi.test;

import java.util.HashMap;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.ExecutionException;

/**
 * @author lizi
 * @since 2023-05-31
 **/
public class DequeDemo {

    private static final Map<String, Integer> taskTime = new ConcurrentHashMap<>(16);

    public static void main(String[] args) throws ExecutionException, InterruptedException {

       equalPairs(new int[][]{{11,1},{1,11}});
    }
    public static int equalPairs(int[][] grid) {
        int ans = 0;
        Map<String, Integer> colMap = new HashMap<>();
        Map<String, Integer> rowMap = new HashMap<>();
        int n = grid.length;
        for(int i = 0; i < n; i++){
            StringBuilder colStr = new StringBuilder();
            StringBuilder rowStr = new StringBuilder();
            for(int j = 0; j < n; j++){
                colStr.append("-").append(grid[i][j]);
                rowStr.append("-").append(grid[j][i]);
            }
            System.out.println(colStr + "   " + rowStr);
            colMap.put(colStr.toString(), colMap.getOrDefault(colStr.toString(), 0) + 1);
            rowMap.put(rowStr.toString(), rowMap.getOrDefault(rowStr.toString(), 0) + 1);
        }

        for(String str : colMap.keySet()){
            ans += getMultiplyResult(colMap.get(str), rowMap.get(str));
        }
        System.out.println(colMap);
        System.out.println(rowMap);
        return ans;
    }
    public static int getMultiplyResult(Integer a, Integer b){
        if(a == null || b == null){
            return 0;
        }
        return a * b;
    }
}

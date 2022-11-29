package com.lizi.year2022.month11.day1109;

import java.util.*;

/**
 * @author lizi
 * @date 2022/11/9 09:09
 * @description 764. 最大加号标志
 **/
public class One1109 {
    public static void main(String[] args) {
        orderOfLargestPlusSign(2, new int[][]{{0,0},{1,1}});
        String[] st = new String[]{};
    }
    public static int orderOfLargestPlusSign(int n, int[][] mines) {
        int ans = Integer.MIN_VALUE;
        Map<Integer, List<Integer>> mapCol = new HashMap<>(16);
        Map<Integer, List<Integer>> mapRow = new HashMap<>(16);
        int[][] mark = new int[n][n];
        for (int[] mine : mines){
            List<Integer> listCol = mapCol.getOrDefault(mine[0], new ArrayList<>());
            List<Integer> listRow = mapRow.getOrDefault(mine[1], new ArrayList<>());
            listCol.add(mine[1]);
            listRow.add(mine[0]);
            mapCol.put(mine[0], listCol);
            mapRow.put(mine[1], listRow);
            mark[mine[0]][mine[1]] = -1;
        }
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                int minCol = n;
                int minRow = n;
                if(mark[i][j] == -1){
                    continue;
                }
                List<Integer> listCol = mapCol.getOrDefault(i, new ArrayList<>());
                List<Integer> listRow = mapRow.getOrDefault(j, new ArrayList<>());
                listCol.addAll(Arrays.asList(-1, n));
                listRow.addAll(Arrays.asList(-1, n));
                for(int d : listRow){
                    minCol = Math.min(minCol, Math.abs(d - i));
                }
                for(int d : listCol){
                    minRow = Math.min(minRow, Math.abs(d - j));
                }
                ans = Math.max(ans, Math.min(minRow, minCol));
            }
        }

        return ans == Integer.MIN_VALUE ? 0 : ans;
    }
}

package com.lizi.year2022.month9.day0904;

import javafx.util.Pair;

import java.util.*;

/**
 * @author lizi
 * @date 2022/9/4 00:00
 * @description TODO
 **/
public class Four0904 {
    public static void main(String[] args) {
        maximumRows(new int[][]{{0,0,0},{1,1,1},{1,1,1},{0,1,0},{0,1,1},{1,0,0},{0,1,0}}, 2);
    }

    public static int maximumRows(int[][] mat, int cols) {
        int ans = 0;
        int row = mat.length;
        int col = mat[0].length;
        Map<String,Integer> map = new HashMap<>();
        for (int i = 0; i < row; i++) {
            StringBuilder stringBuilder = new StringBuilder();
            for (int j = 0; j < col; j++) {
                if(mat[i][j] == 1){
                    stringBuilder.append(j);
                }
            }
            String key = stringBuilder.toString();
            map.put(key, map.getOrDefault(key, 0) + 1);
        }
        List<Pair<String, Integer>> list = new ArrayList<>();
        for (Map.Entry<String, Integer> entry : map.entrySet()){
            list.add(new Pair<>(entry.getKey(), entry.getValue()));
        }
        list.sort((o1, o2) -> {
            if(o2.getValue() > o1.getValue()){
                return 1;
            } else if (o2.getValue() == o1.getValue()) {
                return o2.getKey().length() > o1.getKey().length() ? -1 : 0;
            }else {
                return -1;
            }
        });
        int[] arr = new int[col];
        for (int i = 0; i < list.size(); i++) {
            Pair<String, Integer> pair = list.get(i);
            String str = pair.getKey();
            int value = pair.getValue();
            int sum = Arrays.stream(arr).sum();
            if(cols >= sum){
                for(char ch : str.toCharArray()){
                    arr[ch - '0'] = 1;
                }
                ans += cols >= Arrays.stream(arr).sum() ? value : 0;
            }
        }
        return ans;
    }

}

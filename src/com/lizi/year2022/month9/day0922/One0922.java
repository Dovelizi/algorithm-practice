package com.lizi.year2022.month9.day0922;

import java.util.*;

/**
 * @author lizi
 * @date 2022/9/22 11:02
 * @description TODO
 **/
public class One0922 {
    public static void main(String[] args) {
        canFormArray(new int[]{91,4,54,64,78}, new int[][]{{78},{4,64,54},{91}});
    }
    public static boolean canFormArray(int[] arr, int[][] pieces) {
        int len  = arr.length;
        List<Integer> list = new ArrayList<>();
        StringBuilder stringBuilder = new StringBuilder();
        StringBuilder ansStr = new StringBuilder();
        for (int i = 0; i < len; i++) {
            for (int j = 0; j < pieces.length; j++) {
                if(pieces[j][0] == arr[i]){
                    list.add(j);
                    break ;
                }
            }
        }
        for (int i : list){
            for (int item : pieces[i]) {
                stringBuilder.append(item);
            }
        }
        Arrays.stream(arr).forEach(item -> ansStr.append(item));
        return Objects.equals(ansStr.toString(), stringBuilder.toString());
    }
}

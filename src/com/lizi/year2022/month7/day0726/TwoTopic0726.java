package com.lizi.year2022.month7.day0726;

import java.util.ArrayList;
import java.util.List;

/**
 * @author lizi
 * @description TODO
 * @date 2022/7/26 09:36
 **/
public class TwoTopic0726 {
    public static void main(String[] args) {
        generate(5);
    }
    public static List<List<Integer>> generate(int numRows) {
        List<List<Integer>> ans = new ArrayList<>();
        int[][] arr = new int[numRows + 1][numRows + 1];
        for (int i = 1; i <= numRows; i++) {
            int temp = i;
            List<Integer> list = new ArrayList<>();
            while (temp > 0){
                arr[i][temp] = (temp == 1 || temp == i) ? 1 : arr[i - 1][temp - 1] + arr[i - 1][temp];
                list.add(arr[i][temp]);
                temp--;
            }
            ans.add(list);
        }
        return ans;
    }
}

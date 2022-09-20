package com.lizi.year2022.month9.day0912;


import java.util.ArrayList;
import java.util.Collections;
import java.util.HashSet;
import java.util.Set;

/**
 * @author lizi
 * @date 2022/9/12 22:21
 * @description TODO
 **/
public class Four0912 {
    public static void main(String[] args) {
        minGroups(new int[][]{{5,10},{6,8},{1,5},{2,3},{1,10}});
    }
    public static int minGroups(int[][] intervals) {
        ArrayList<int[]> list = new ArrayList<>();
        for (int[] interval : intervals) {
            Set<int[]> set = new HashSet<>();
            set.add(new int[]{interval[0], 1});
            set.add(new int[]{interval[1], -1});
            list.addAll(set);
        }
        Collections.sort(list, (o, p) -> o[0] == p[0] ? p[1] - o[1] : o[0] - p[0]);
        int max = 0, count = 0;
        for (int[] arr : list) {
            max = Math.max(max, count += arr[1]);
        }
        return max;
    }
}

package com.lizi.year2022.month12.day1214;

import java.util.*;
import java.util.stream.Collectors;

/**
 * @author lizi
 * @date 2022/12/14 10:01
 * @description TODO
 **/
public class One1214 {
    public static void main(String[] args) {
        deleteGreatestValue(new int[][]{{10}});
    }
    public static int deleteGreatestValue(int[][] grid) {
        int ans = 0;
        int len = grid[0].length;
        List<PriorityQueue<Integer>> list = new ArrayList<>();
        for (int[] arr : grid){
            PriorityQueue<Integer> queue = new PriorityQueue<>((o1, o2) -> o2 - o1);
            queue.addAll(Arrays.stream(arr).boxed().collect(Collectors.toList()));
            list.add(queue);
        }
        for (int i = 0; i < len; i++) {
            int tempMax = 0;
            for (PriorityQueue<Integer> queue : list){
                tempMax = Math.max(tempMax, queue.poll());
            }
            ans += tempMax;
        }
        return ans;
    }
}

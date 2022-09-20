package com.lizi.year2022.month4.day0424;

import java.util.Arrays;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

/**
 * @author lizi
 * @description TODO
 * @date 2022/4/24 10:22
 **/
public class TwoTopic0424 {
    public static void main(String[] args) {
        countLatticePoints(new int[][]{{2,2,2},{2,2,2},{2,2,2}});
    }
    public static int countLatticePoints(int[][] circles) {
        Set<List<Integer>> set = new HashSet<>();
        for(int[] arr : circles){
            int xStart = arr[0] - arr[2];
            int xEnd = arr[0] + arr[2];
            int yStart = arr[1] - arr[2];
            int yEnd = arr[1] + arr[2];
            for(int i = xStart; i <= xEnd; i++){
                for(int j = yStart; j <= yEnd; j++){
                    double sqrt = Math.sqrt(Math.pow(i - arr[0], 2) + Math.pow(j - arr[1], 2));
                    if(sqrt <= arr[2]){
                        set.add(Arrays.asList(i,j));
                    }
                }
            }
        }
        return set.size();
    }
}

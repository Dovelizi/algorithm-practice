package com.lizi.year2022.month4.day0424;

import java.util.Arrays;
import java.util.Comparator;

/**
 * @author lizi
 * @description TODO
 * @date 2022/4/24 10:23
 **/
public class ThreeTopic0424 {
    public static void main(String[] args) {
        countRectangles(new int[][]{{1,2},{2,3},{2,5}}, new int[][]{{2, 1},{1, 4}});
    }
    public static int[] countRectangles(int[][] rectangles, int[][] points) {
        Arrays.sort(rectangles, new Comparator<int[]>() {
            @Override
            public int compare(int[] o1, int[] o2) {
                if (o1[0]==o2[0]) return o1[1]-o2[1];
                return o1[0]-o2[0];
            }
        });
        int[] arr = new int[points.length];
        for(int i = 0; i < points.length; i++){
             for(int j = 0; j < rectangles.length; j++){
                if(rectangles[j][0] >= points[i][0] && rectangles[j][1] >= points[i][1]){
                    arr[i] = rectangles.length - j;
                    break;
                }
            }
        }
        return arr;
    }
    public static boolean isInside(int x4, int y4, int x, int y) {
        if (x < 0) {
            return false;
        }
        if (x > x4) {
            return false;
        }
        if (y < 0) {
            return false;
        }
        if (y > y4) {
            return false;
        }
        return true;
    }

}

package com.lizi.year2022.month5.day0520;

import java.util.Comparator;

import static java.util.Arrays.sort;

/**
 * @author lizi
 * @description TODO
 * @date 2022/5/20 15:44
 **/
public class OneTopic0520 {
    public static void main(String[] args) {
        findRightInterval(new int[][]{{1,4}});
    }
    public static int[] findRightInterval(int[][] intervals) {
        int len = intervals.length;
        int[] ans = new int[len];
        int[][] copyArr = new int[len][2];
        for(int i = 0; i < len; i++){
            copyArr[i] = new int[]{intervals[i][0], i};
        }
        sort(copyArr, Comparator.comparingInt(a -> a[0]));
        for (int i = 0; i < len; i++) {
            int left = 0, right = len - 1;
            while (left < right){
                int mid = (right + left) >> 1;
                if(copyArr[mid][0] >= intervals[i][1]){
                    right = mid;
                }else{
                    left = mid + 1;
                }
            }
            ans[i] = copyArr[right][0] >= intervals[i][1] ? copyArr[right][1] : -1;
        }
        return ans;
    }
}

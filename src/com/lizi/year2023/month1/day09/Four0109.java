package com.lizi.year2023.month1.day09;

/**
 * @author lizi
 * @date 2023/1/9 20:14
 * @description 1094. 拼车
 **/
public class Four0109 {
    public static void main(String[] args) {
        carPooling(new int[][]{{3, 2, 7},{3, 7, 9}, {8, 3, 9}}, 11);
    }
    public static boolean carPooling(int[][] trips, int capacity) {
        boolean ans = true;
        int len = 1001;
        int[] diff = new int[len];
        int[] passengers = new int[len];
        for (int[] trip : trips){
            int start = trip[1];
            int end = trip[2];
            int people = trip[0];
            diff[start] += people;
            if(end < len - 1){
                diff[end] -= people;
            }
        }
        passengers[0] = diff[0];
        if(passengers[0] > capacity){
            return false;
        }
        for (int i = 1; i < len; i++){
            passengers[i] = passengers[i - 1] + diff[i];
            if (passengers[i] > capacity){
                return false;
            }
        }
        return ans;
    }
}

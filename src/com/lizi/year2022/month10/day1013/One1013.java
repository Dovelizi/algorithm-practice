package com.lizi.year2022.month10.day1013;

/**
 * @author lizi
 * @date 2022/10/13 08:57
 * @description 769. 最多能完成排序的块
 **/
public class One1013 {
    public static void main(String[] args) {
        maxChunksToSorted(new int[]{1,0,2,3,4});
    }
    public static int maxChunksToSorted(int[] arr) {
        int len = arr.length;
        int count = 0, max = 0;
        for (int i = 0; i < len; i++) {
            if(arr[i] <= i && max <= i){
                count++ ;
                max = 0;
            }else {
                max = Math.max(arr[i], max);
            }
        }
        return Math.max(1, count);
    }
}

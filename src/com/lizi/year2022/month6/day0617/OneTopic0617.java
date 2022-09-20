package com.lizi.year2022.month6.day0617;

import java.util.Arrays;

/**
 * @author lizi
 * @description TODO
 * @date 2022/6/17 08:48
 **/
public class OneTopic0617 {
    public static void main(String[] args) {
        duplicateZeros(new int[]{1,0,0,0,2,3,0,4,5,0});
    }
    public static void duplicateZeros(int[] arr) {
        int len = arr.length;
        int[] copyOfArr = Arrays.copyOf(arr, len);
        int idx = 0;
        for (int i = 0; i < len - 1; i++) {
            if(idx >= len){
                break;
            }
            if(copyOfArr[i] == 0){
                for (int j = 0; j < 2; j++) {
                    if(idx + j >= len){
                        break;
                    }
                    arr[idx + j] = 0;
                }
                idx += 2;
            }else {
                arr[idx]  = copyOfArr[i];
                idx++ ;
            }
        }
    }
}

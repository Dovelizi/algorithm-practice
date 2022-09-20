package com.lizi.year2022.month8.day0824;

import java.util.Arrays;

/**
 * @author lizi
 * @description TODO
 * @date 2022/8/24 11:24
 **/
public class One0824 {
    public boolean canBeEqual(int[] target, int[] arr) {
        int len1 = target.length;
        int len2 = arr.length;
        if(len1 != len2){
            return false;
        }
        Arrays.sort(target);
        Arrays.sort(arr);
        for (int i = 0; i < len1; i++) {
            if(target[i] != arr[i]){
                return false;
            }
        }
        return true;
    }
}

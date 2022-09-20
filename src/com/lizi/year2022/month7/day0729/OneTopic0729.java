package com.lizi.year2022.month7.day0729;

import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

/**
 * @author lizi
 * @description TODO
 * @date 2022/7/29 15:42
 **/
public class OneTopic0729 {
    public static void main(String[] args) {
        arrayRankTransform(new int[]{100, 100, 100});
    }
    public static int[] arrayRankTransform(int[] arr) {
        Map<Integer, Integer> map = new HashMap<>();
        int[] copyArr = Arrays.stream(arr).sorted().distinct().toArray();
        for(int i = 0; i < copyArr.length; i++){
            map.put(copyArr[i], i + 1);
        }
        for(int i = 0; i < arr.length; i++){
            arr[i] = map.get(arr[i]);
        }
        return arr;
    }
}

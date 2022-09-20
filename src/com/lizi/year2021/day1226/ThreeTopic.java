package com.lizi.year2021.day1226;

import java.util.*;

/**
 * @author lizi
 * @description TODO
 * @date 2021/12/26 11:23
 **/
public class ThreeTopic {
    public static void main(String[] args) {
        getDistances(new int[]{2,1,3,1,2,3,3});
    }
    public static long[] getDistances(int[] arr) {
        Map<Integer,Map<Integer,Long>> map = new LinkedHashMap<>();
        long[] resArr = new long[arr.length];
        for(int i = 0; i < arr.length; i++){
            Map<Integer,Long> lenMap = map.get(arr[i]) == null ? new HashMap<>() : map.get(arr[i]);
            if(lenMap.get(arr[i]) == null){
                lenMap.put(i,Long.valueOf(i));
            }else{
                long temp = 0;
                for(Map.Entry<Integer, Long> bMap : lenMap.entrySet()){
                    int key = bMap.getKey();
                    temp += Math.abs(i - key);
                    lenMap.put(key,lenMap.get(key) + Math.abs(key - i));
                }
                lenMap.put(i,temp);
            }
            map.put(arr[i],lenMap);
        }
        for(int i = 0; i < arr.length; i++){
            resArr[i] = map.get(arr[i]).get(i);
        }
        return resArr;
    }
}

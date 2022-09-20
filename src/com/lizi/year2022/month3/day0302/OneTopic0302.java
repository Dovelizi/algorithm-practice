package com.lizi.year2022.month3.day0302;

import java.util.*;

/**
 * @author lizi
 * @description TODO
 * @date 2022/3/2 08:59
 **/
public class OneTopic0302 {
    public static void main(String[] args) {
        merge(new int[][]{{1,4},{0,0}});
    }
    public static int[][] merge(int[][] intervals) {
        int len = intervals.length;
        Set<Integer> set = new HashSet<>();
        int pre = 0, next = 0;
        List<int[]> resList = new ArrayList<>();
        if(intersection(intervals)){
            return intervals;
        }
        for (int i = 0; i < len; i++) {
            for(int j = intervals[i][0]; j <= intervals[i][1]; j++){
                set.add(j);
            }
        }
        Integer[] arr = set.toArray(new Integer[0]);
        Arrays.sort(arr);
        while(next <= arr.length) {
            if(next == arr.length){
                resList.add(new int[]{arr[pre],arr[next-1]});
                break;
            }
            if(arr[next] - arr[pre] == next - pre){
                next++ ;
            }else{
                resList.add(new int[]{arr[pre],arr[next-1]});
                pre = next;
            }
        }
        int[][] resArr = new int[resList.size()][2];
        for(int i = 0; i < resList.size(); i++){
            resArr[i] = resList.get(i);
        }
        return resArr;
    }
    public static boolean intersection(int[][] intervals){
        List<Integer> list = new ArrayList<>();
        int len = intervals.length;
        for(int i  = 0; i < len; i++){
            List<Integer> l = new ArrayList<>();
           for(int j = intervals[i][0]; j <= intervals[i][1]; j++){
               l.add(j);
               if(list.contains(j)){
                   return false;
               }
           }
           list.addAll(l);
        }
        return true;
    }
}

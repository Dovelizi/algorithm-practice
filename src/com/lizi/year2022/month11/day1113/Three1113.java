package com.lizi.year2022.month11.day1113;

import java.util.*;

/**
 * @author lizi
 * @date 2022/11/13 10:29
 * @description TODO
 **/
public class Three1113 {
    public static void main(String[] args) {
        minSwap(Arrays.asList(2,4,3,6,5,7));
    }
    public static int minSwap(List<Integer> list){
        List<Integer> sortList = new ArrayList<>(list);
        Collections.sort(sortList);
        Map<Integer, Integer> map = new HashMap<>(16);
        for (int i = 0; i < sortList.size(); i++) {
            map.put(sortList.get(i), i);
        }
        int loops = 0;
        boolean[] flag = new boolean[list.size()];
        for (int i = 0; i < sortList.size(); i++) {
            if(!flag[i]){
                int j = i;
                while (!flag[j]){
                    flag[j] = true;
                    j = map.get(list.get(j));
                }
                loops++ ;
            }
        }
        return sortList.size() - loops;
    }
}

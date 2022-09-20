package com.lizi.year2021.day1230;

import java.util.*;

/**
 * @author lizi
 * @description TODO
 * @date 2021/12/30 10:13
 **/
public class OneTopic {
    public static void main(String[] args) {
        isNStraightHand(new int[]{1,2,3,6,2,3,4,7,8},3);
    }

    public static boolean isNStraightHand(int[] hand, int groupSize) {
        int len = hand.length;
        Map<Integer, Integer> map = new HashMap<>();
        List<Integer> list = new LinkedList<>();
        int idx = 0;
        if((len % groupSize) != 0){
            return false;
        }
        Arrays.sort(hand);
        for (int i = 0; i < len; i++) {
            int time = map.get(hand[i]) == null ? 0 : map.get(hand[i]);
            map.put(hand[i],time + 1);
            if(!list.contains(hand[i])){
                list.add(hand[i]);
            }
        }
        while(idx < list.size()){
            int times = groupSize;
            int num = list.get(idx);
            map.put(num,map.get(num) - 1);
            while(--times > 0){
                num++ ;
                if(map.get(num) != null && map.get(num) > 0){
                    map.put(num, map.get(num) - 1);
                }else{
                    return false;
                }
            }
            while(idx < list.size() && map.get(list.get(idx)) == 0){
                idx++ ;
            }
        }
        return true;
    }
}

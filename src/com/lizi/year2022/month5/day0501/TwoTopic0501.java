package com.lizi.year2022.month5.day0501;

import java.util.HashMap;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;

/**
 * @author lizi
 * @description TODO
 * @date 2022/5/1 10:29
 **/
public class TwoTopic0501 {
    public static void main(String[] args) {
        minimumCardPickup(new int[]{3,4,2,3,4,7});
    }
    public static int minimumCardPickup(int[] cards) {
      Map<Integer,Integer> map = new HashMap<>();
      List<Integer> list = new LinkedList<>();
      int minPath = Integer.MAX_VALUE;
     for(int i = 0; i < cards.length; i++){
         if(list.contains(cards[i])){
             minPath = Math.min(minPath,i - map.get(cards[i]) + 1);
         }
         list.add(cards[i]);
         map.put(cards[i],i);
     }
     return minPath;
    }
}

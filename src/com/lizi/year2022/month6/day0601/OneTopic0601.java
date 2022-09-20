package com.lizi.year2022.month6.day0601;

import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

/**
 * @author lizi
 * @description TODO
 * @date 2022/6/1 10:18
 **/
public class OneTopic0601 {
    public boolean makesquare(int[] matchsticks) {
        int sum = Arrays.stream(matchsticks).sum();
        if(sum % 4 != 0){
            return false;
        }
        Arrays.sort(matchsticks);
        int length = sum / 4;
        int len = matchsticks.length;
        Map<Integer, Integer> map = new HashMap<>();
        for (int num : matchsticks){
            map.put(num, map.getOrDefault(num, 0) + 1);
        }
        for (int i = len - 1; i >= 0; i--) {
            if(matchsticks[i] > length){
                return false;
            }else{

            }
        }
        return true;
    }
}

package com.lizi.year2022.month7.day0713;

import java.util.*;
import java.util.stream.Collectors;

/**
 * @author lizi
 * @description TODO
 * @date 2022/7/13 08:55
 **/
public class OneTopic0713 {
    private final static Map<Integer, Integer> map = new HashMap<>(64);
    public static void main(String[] args) {
        map.put(1,1);
        map.put(2,5);
        map.remove(1);
        map.clear();


       // asteroidCollision(new int[]{-2,2,-1,-2});
    }
    public static int[] asteroidCollision(int[] asteroids) {
        List<Integer> list = Arrays.stream(asteroids).boxed().collect(Collectors.toList());
        Integer flagNum = null;
        int idx = 0;
        for (int i = list.size() - 1; i >= 0; i--) {
            if(list.get(i) < 0){
                flagNum = list.get(i);
                idx = i;
                continue;
            }
            if(Objects.nonNull(flagNum) && list.get(i) > 0){
                if(list.get(i) > Math.abs(flagNum)){
                    list.set(idx,null);
                    flagNum = null;
                }else if(list.get(i) < Math.abs(flagNum)){
                    list.set(i,null);
                }else{
                    list.set(i+1,null);
                    list.set(i,null);
                    flagNum = null;
                }
            }
        }
        return  list.stream().filter(Objects::nonNull).mapToInt(i->i).toArray();
    }
}

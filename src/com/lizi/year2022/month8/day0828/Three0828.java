package com.lizi.year2022.month8.day0828;

import java.util.HashMap;
import java.util.Map;

/**
 * @author lizi
 * @description TODO
 * @date 2022/8/28 10:26
 **/
public class Three0828 {
    public static void main(String[] args) {
        garbageCollection(new String[]{"G","P","GP","GG"}, new int[]{2, 4, 3});
    }
    public static int garbageCollection(String[] garbage, int[] travel) {
        int timeM = 0, timeG = 0, timeP = 0;
        int idxM = 0, idxG = 0, idxP = 0;
        int len = garbage.length;
        Map<Integer, Integer> map = new HashMap<>();
        for (int i = 0; i < travel.length; i++) {
            map.put(i, map.getOrDefault(i - 1, 0) + travel[i]);
        }
        for (int i = 0; i < len; i++) {
            String str = garbage[i];
            if(str.contains("M")){
                idxM = i;
            }
            if(str.contains("G")){
                idxG = i;
            }
            if(str.contains("P")){
                idxP = i;
            }
            for(char c : str.toCharArray()){
                if(c == 'M'){
                    timeM++ ;
                }
                if(c == 'G'){
                    timeG++ ;
                }
                if(c == 'P'){
                    timeP++ ;
                }
            }
        }
        idxM = idxM > 0 ? map.get(idxM - 1) : 0;
        idxG = idxG > 0 ? map.get(idxG - 1) : 0;
        idxP = idxP > 0 ? map.get(idxP - 1) : 0;
        return timeM + idxM + timeG + idxG + timeP + idxP;
    }
}

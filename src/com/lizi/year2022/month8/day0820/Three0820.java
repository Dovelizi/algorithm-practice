package com.lizi.year2022.month8.day0820;

import java.util.HashMap;
import java.util.Map;

/**
 * @author lizi
 * @description TODO
 * @date 2022/8/20 22:00
 **/
public class Three0820 {

    public static void main(String[] args) {
        shiftingLetters("dztz",new int[][]{{0,0,0},{1,1,1}});
    }
    public static String shiftingLetters(String s, int[][] shifts) {
        int len = s.length();
        Map<Integer, Integer> map = new HashMap<>();
        for (int[] arr : shifts) {
            for (int i = arr[0]; i <= arr[1]; i++) {
                int temp = arr[2] == 0 ? -1 : 1;
                map.put(i, map.getOrDefault(i, 0) + temp);
            }
        }
        for(Map.Entry<Integer, Integer> entry : map.entrySet()){
            int idx = entry.getKey();
            int offer = entry.getValue();
            s = s.substring(0, idx) + translate(s.charAt(idx), offer) + s.substring(idx + 1, len);
        }
        return s;
    }
    public static char translate(char c, int offer) {
        if(offer > 0){
            offer = offer % 26;
            return c + offer > 122 ? (char) (96 + (offer - (122 - c))) : (char) (c + offer);
        }else {
            offer = Math.abs(offer) % 26;
            return c - offer < 97 ? (char) (123 - (offer - (c - 97)))  : (char) (c - offer);
        }
    }
}

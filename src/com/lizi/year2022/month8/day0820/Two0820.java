package com.lizi.year2022.month8.day0820;

/**
 * @author lizi
 * @description TODO
 * @date 2022/8/20 21:59
 **/
public class Two0820 {
    public static void main(String[] args) {
        secondsToRemoveOccurrences("010101010101");
    }
    public static int secondsToRemoveOccurrences(String s) {
        int ans = 0;
        while (s.contains("01")){
            s = s.replaceAll("01", "10");
            ans++ ;
        }
        return ans;
    }
}

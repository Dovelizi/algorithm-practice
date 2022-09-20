package com.lizi.year2022.month1.day0109;

/**
 * @author lizi
 * @description TODO
 * @date 2022/1/9 19:44
 **/
public class FourTopic {
    public static void main(String[] args) {
        slowestKey(new int[]{28,65,97},"gaf");
    }
    public static char slowestKey(int[] releaseTimes, String keysPressed) {
        int maxTime = releaseTimes[0];
        char maxTimeChar = keysPressed.charAt(0);
        for(int i = 1; i < releaseTimes.length; i++){
            int tempTime = releaseTimes[i] - releaseTimes[i-1];
            int charDiff = keysPressed.charAt(i) - maxTimeChar;
            if(tempTime > maxTime || (tempTime == maxTime && charDiff > 0)){
                maxTime = tempTime;
                maxTimeChar = keysPressed.charAt(i);
            }
        }
        return maxTimeChar;
    }
}

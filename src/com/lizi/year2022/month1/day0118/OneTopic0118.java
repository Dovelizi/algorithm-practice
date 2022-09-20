package com.lizi.year2022.month1.day0118;

import java.util.Arrays;
import java.util.List;

/**
 * @author lizi
 * @description TODO
 * @date 2022/1/18 09:09
 **/
public class OneTopic0118 {
    public int findMinDifference(List<String> timePoints) {
        int len = timePoints.size();
        int[] timeArr = new int[len];
        int minTime = Integer.MAX_VALUE;
        for (int i = 0; i < len; i++) {
           int timeInt = Integer.parseInt(timePoints.get(i).substring(0,2)) * 60 + Integer.parseInt(timePoints.get(i).substring(2,4));
           timeArr[i] = timeInt;
        }
        Arrays.sort(timeArr);
        for(int i = 1; i < len; i++){
            minTime = Math.min(minTime,timeArr[i] - timeArr[i - 1]);
        }
        minTime = Math.min(minTime, timeArr[0] + 1439 - timeArr[len-1]);
        return minTime;
    }
}

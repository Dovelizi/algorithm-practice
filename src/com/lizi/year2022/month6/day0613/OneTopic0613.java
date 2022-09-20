package com.lizi.year2022.month6.day0613;

import java.util.Arrays;

/**
 * @author lizi
 * @description TODO
 * @date 2022/6/13 08:52
 **/
public class OneTopic0613 {
    public int heightChecker(int[] heights) {
        int ans = 0;
        int[] copyArr = Arrays.copyOf(heights, heights.length);
        Arrays.sort(copyArr);
        for (int i = 0; i < heights.length; i++) {
            if(heights[i] != copyArr[i]){
                ans++ ;
            }
        }
        return ans;
    }
}

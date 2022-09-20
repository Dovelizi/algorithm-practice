package com.lizi.year2022.month6.day0608;

/**
 * @author lizi
 * @description TODO
 * @date 2022/6/8 09:17
 **/
public class OneTopic0608 {
    public boolean isBoomerang(int[][] points) {
        int a = points[1][1] - points[0][1];
        int b = points[0][0] - points[1][0];
        int c = points[1][0] * points[0][1] - points[0][0] * points[1][1];
        return a * points[2][0] + b * points[2][1] + c == 0;
    }
}

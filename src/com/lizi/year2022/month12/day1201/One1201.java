package com.lizi.year2022.month12.day1201;

/**
 * @author lizi
 * @date 2022/12/1 08:48
 * @description 1779. 找到最近的有相同 X 或 Y 坐标的点
 **/
public class One1201 {
    public int nearestValidPoint(int x, int y, int[][] points) {
        int ans = -1;
        int minLen = Integer.MAX_VALUE;
        for (int i = 0; i < points.length; i++){
            if(points[i][0] == x || points[i][1] == y){
                int temp = Math.abs(x - points[i][0]) + Math.abs(y - points[i][1]);
                if(temp < minLen){
                    minLen = temp;
                    ans = i;
                }
            }
        }
        return ans;
    }
}

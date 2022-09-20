package com.lizi.year2022.month6.day0625;

/**
 * @author lizi
 * @description TODO
 * @date 2022/6/25 23:49
 **/
public class ThreeTopic0625 {
    public int minCost(int[][] costs) {
        for(int i = 1;i<costs.length;i++){
            costs[i][0] += Math.min(costs[i-1][1],costs[i-1][2]);
            costs[i][1] += Math.min(costs[i-1][0],costs[i-1][2]);
            costs[i][2] += Math.min(costs[i-1][0],costs[i-1][1]);
        }
        return Math.min(costs[costs.length-1][0],Math.min(costs[costs.length-1][1],costs[costs.length-1][2]));
    }
}

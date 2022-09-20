package com.lizi.year2022.month1.day0116;

/**
 * @author lizi
 * @description TODO
 * @date 2022/1/16 11:29
 **/
public class ThreeTopic0116 {
    public static void main(String[] args) {
        mostPoints(new int[][]{{21,5}, {92,3},{74,2},{39,4},{58,2},{5,5},{49,4},{65,3}});
    }
    public static long mostPoints(int[][] questions) {
        long resScore = 0;
        int col = questions.length;
        for (int i = 0; i < col; i++) {
            long score = 0;
            int idx = i;
            while(idx < col){
                score += questions[idx][0];
                idx += questions[idx][1] + 1;
            }
            resScore = Math.max(resScore,score);
        }
        return resScore;
    }
}

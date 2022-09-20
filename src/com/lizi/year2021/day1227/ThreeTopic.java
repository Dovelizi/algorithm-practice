package com.lizi.year2021.day1227;

import java.util.ArrayList;
import java.util.List;

/**
 * @author lizi
 * @description TODO
 * @date 2021/12/27 20:20
 **/
public class ThreeTopic {
    public static void main(String[] args) {
        dicesProbability(11);
    }
    public static double[] dicesProbability(int n) {
        // 存储得分和其出现的次数
        int[] scoreArr = new int[n * 6 + 1];
        List<Double> res = new ArrayList<>();
        dfs(scoreArr, n, 0, 0);
        double total = Math.pow(6,n);
        for(int score : scoreArr){
            if(score != 0){
                res.add(score / total);
            }
        }
        return res.stream().mapToDouble(Double :: valueOf).toArray();
    }

    public static void dfs(int[] scoreArr,int n, int step, int sum){
            if(step == n){
                scoreArr[sum]++ ;
                return;
            }else{
                for(int k = 1; k <= 6; k++){
                    dfs(scoreArr, n, step + 1,sum + k);
                }
            }
    }
}

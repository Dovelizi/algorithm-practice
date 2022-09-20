package com.lizi.year2022.month2.day0222;

import java.util.ArrayList;
import java.util.List;

/**
 * @author lizi
 * @description TODO
 * @date 2022/2/22 19:32
 **/
public class OneTopic0222 {
   static List<List<Integer>> resList = new ArrayList<>();
    public static void main(String[] args) {
        combinationSum(new int[]{2,3,6,7}, 7);
    }
    public static List<List<Integer>> combinationSum(int[] candidates, int target) {
        dfs(candidates, target, new ArrayList<>(),0);
        return resList;
    }

    public static void dfs(int[] candidates, int target, List<Integer> sumNum, int step){
        if(calcNum(sumNum) == target){
            List<Integer> list = new ArrayList<>(sumNum);
            resList.add(list);
            return;
        }
        for(int i = step; i < candidates.length && calcNum(sumNum) <= target; i++){
            sumNum.add(candidates[i]);
            dfs(candidates, target, sumNum, i);
            sumNum.remove(sumNum.size() - 1);
        }
    }

    public static int calcNum(List<Integer> sumNum){
        int sum = 0;
        for(int n : sumNum){
            sum += n;
        }
        return sum;
    }
}

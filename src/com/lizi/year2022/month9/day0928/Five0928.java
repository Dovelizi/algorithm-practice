package com.lizi.year2022.month9.day0928;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/**
 * @author lizi
 * @date 2022/9/28 15:41
 * @description 40. 组合总和 II
 **/
public class Five0928 {
    public static void main(String[] args) {
        combinationSum2(new int[]{10,1,2,7,6,1,5}, 8);
    }
    static List<List<Integer>> ans = new ArrayList<>();
    static List<Integer> tempList = new ArrayList<>();
    public static List<List<Integer>> combinationSum2(int[] candidates, int target) {
        Arrays.sort(candidates);
        travers(candidates, target, 0);
        return ans;
    }
    public static void travers(int[] candidates, int target, int step){
        if (target == 0) {
            ans.add(new ArrayList<>(tempList));
        }
        for (int i = step; i < candidates.length; i++) {
            if(candidates[i] > target || i > step && candidates[i] == candidates[i - 1]){
                continue ;
            }
            tempList.add(candidates[i]);
            travers(candidates, target - candidates[i], i + 1);
            tempList.remove(tempList.size() - 1);
        }
    }
}

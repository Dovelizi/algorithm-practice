package com.lizi.year2022.month4.day0422;

import java.util.LinkedList;
import java.util.List;

/**
 * @author lizi
 * @description TODO
 * @date 2022/4/22 19:53
 **/
public class TwoTopic0422 {
   static List<List<Integer>> ans = new LinkedList<>();
   static int target = 0;

    public static void main(String[] args) {
        fourSum(new int[]{1,0,-1,0,-2,2}, 0);
    }
    public static List<List<Integer>> fourSum(int[] nums, int target) {
        TwoTopic0422.target = target;
        boolean[] vis = new boolean[nums.length];
        for (int i = 0; i < nums.length - 3; i++) {
            dfs(nums,vis,i,new LinkedList<>());
        }
        return ans;
    }
    public static void dfs(int[] nums, boolean[] vis, int idx, List<Integer> list){
        if(list.size() == 4){
           if (list.stream().mapToInt(Integer::intValue).sum() == target){
               ans.add(new LinkedList<>(list));
           }
        }
        if(idx >= nums.length || vis[idx] || list.size() >= 4){
            return;
        }
        vis[idx] = true;
        list.add(nums[idx]);
        for(int i = idx + 1; i < nums.length; i++){
            dfs(nums, vis, i, list);
        }
        list.remove(list.size() - 1);
        vis[idx] = false;
    }
}

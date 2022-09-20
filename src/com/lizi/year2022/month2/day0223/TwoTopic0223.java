package com.lizi.year2022.month2.day0223;

import java.util.ArrayList;
import java.util.List;

/**
 * @author lizi
 * @description TODO
 * @date 2022/2/23 11:45
 **/
public class TwoTopic0223 {
   static List<List<Integer>> resList = new ArrayList<>();

    public static void main(String[] args) {
        permute(new int[]{1,2,3});
    }
    public static List<List<Integer>> permute(int[] nums) {
        dfs(nums,new boolean[nums.length], 0, new ArrayList<>());
        return resList;
    }

    public static void dfs(int[] nums, boolean[] vis, int size, List<Integer> list){
        if(list.size() == nums.length){
            List<Integer> addList = new ArrayList<>(list);
            resList.add(addList);
            return ;
        }
        for(int i = 0; i < nums.length; i++){
            if(vis[i]){
                continue;
            }
            vis[i] = true;
            list.add(nums[i]);
            dfs(nums, vis, i, list);
            vis[i] = false;
            list.remove(list.size() - 1);
        }
    }
}

package com.lizi.year2022.month9.day0928;

import java.util.ArrayList;
import java.util.List;

/**
 * @author lizi
 * @date 2022/9/28 20:34
 * @description 39. 组合总和
 **/
public class Six0928 {
    List<List<Integer>> ans = new ArrayList<>();
    List<Integer> list = new ArrayList<>();
    public List<List<Integer>> permuteUnique(int[] nums) {
        boolean[] vis = new boolean[nums.length];
        traverse(nums, vis);
        return ans;
    }

    public void traverse(int[] nums, boolean[] vis){
        if(list.size() == nums.length){
            if(!ans.contains(new ArrayList<>(list))){
                ans.add(new ArrayList<>(list));
            }
        }
        for (int i = 0; i < nums.length; i++) {
            if(vis[i]){
                continue ;
            }
            list.add(nums[i]);
            vis[i] = true;
            traverse(nums, vis);
            vis[i] = false;
            list.remove(list.size() - 1);
        }
    }
}

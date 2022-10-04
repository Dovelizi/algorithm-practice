package com.lizi.year2022.month9.day0928;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

/**
 * @author lizi
 * @date 2022/9/28 21:12
 * @description 47. 全排列 II
 **/
public class Seven0928 {
    List<List<Integer>> ans = new ArrayList<>();
    List<Integer> list = new ArrayList<>();
    public List<List<Integer>> permuteUnique(int[] nums) {
        for(int n : nums){
            list.add(n);
        }
        traverse(nums, 0);
        return ans;
    }

    public void traverse(int[] nums, int step){
        if(step == nums.length){
            if(!ans.contains(new ArrayList<>(list))){
                ans.add(new ArrayList<>(list));
            }
        }
        for (int i = step; i < nums.length; i++) {
            Collections.swap(list, step, i);
            traverse(nums, step + 1);
            Collections.swap(list, step, i);
        }
    }
}

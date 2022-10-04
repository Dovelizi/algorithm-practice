package com.lizi.year2022.month9.day0929;

import java.util.*;

/**
 * @author lizi
 * @date 2022/9/29 13:35
 * @description TODO
 **/
public class Two0929 {
    List<List<Integer>> ans = new ArrayList<>();
    List<Integer> list = new ArrayList<>();
    public List<List<Integer>> subsetsWithDup(int[] nums) {
        dfs(nums, 0);
        return ans;
    }
    public void dfs(int[] nums, int step){
        List<Integer> temp = new ArrayList<>(list);
        temp.sort(Comparator.comparingInt(o -> o));
        if(!ans.contains(temp)){
            ans.add(temp);
        }
        for (int i = step; i < nums.length; i++) {
            list.add(nums[i]);
            dfs(nums, i + 1);
            list.remove(list.size() - 1);
        }
    }
}

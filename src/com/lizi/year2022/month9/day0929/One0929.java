package com.lizi.year2022.month9.day0929;

import java.util.ArrayList;
import java.util.List;

/**
 * @author lizi
 * @date 2022/9/29 13:24
 * @description 78. 子集
 **/
public class One0929 {
    List<List<Integer>> ans = new ArrayList<>();
    List<Integer> list = new ArrayList<>();
    public List<List<Integer>> subsets(int[] nums) {
        dfs(nums, 0);
        return ans;
    }
    public void dfs(int[] nums, int step){
        ans.add(new ArrayList<>(list));
        for(int i = step; i < nums.length; i++){
            list.add(nums[i]);
            dfs(nums, i + 1);
            list.remove(list.size() - 1);
        }
    }
}

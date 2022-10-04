package com.lizi.year2022.month9.day0928;

import java.util.ArrayList;
import java.util.List;

/**
 * @author lizi
 * @date 2022/9/28 22:02
 * @description 77. 组合
 **/
public class Event0928 {
    List<List<Integer>> ans = new ArrayList<>();
    List<Integer> list = new ArrayList<>();
    public List<List<Integer>> combine(int n, int k) {
        boolean[] vis = new boolean[n];
        dfs(1, n, k, vis);
        return ans;
    }

    public void dfs(int step, int n, int k, boolean[] vis){
        if(list.size() == k){
            ans.add(new ArrayList<>(list));
        }
        for(int i = step; i < n; i++){
            if(vis[i]){
                continue;
            }
            list.add(i);
            vis[i] = true;
            dfs(i + 1, n, k, vis);
            vis[i] = false;
            list.remove(list.size() - 1);
        }
    }
}

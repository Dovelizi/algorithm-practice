package com.lizi.year2022.month8.day0807;

import java.util.*;

/**
 * @author lizi
 * @description TODO
 * @date 2022/8/7 10:28
 **/
public class Two0807 {
    public static void main(String[] args) {
        reachableNodes(7,new int[][]{{0,1},{1,2},{3,1},{4,0},{0,5},{5,6}},new int[]{4,5});
    }
    public static int reachableNodes(int n, int[][] edges, int[] restricted) {
        List<Integer>[] list = new List[n];
        for (int i = 0; i < n; i++) {
            list[i] = new ArrayList<>();
        }
        // 使用邻接表建图
        for(int i = 0; i < n -1; i++){
            list[edges[i][0]].add(edges[i][1]);
            list[edges[i][1]].add(edges[i][0]);
        }
        boolean[] vis = new boolean[n];
        // 处理禁用的数组
        for(int num : restricted){
            vis[num] = true;
        }
        Deque<Integer> queue = new LinkedList<>();
        queue.addLast(0);
        vis[0] = true;
        int ans = 1;
        while(!queue.isEmpty()){
            int cur = queue.pollFirst();
            for(int next : list[cur]){
                if(!vis[next]){
                    queue.addLast(next);
                    vis[next] = true;
                    ans++ ;
                }
            }
        }
        return ans;
    }
}

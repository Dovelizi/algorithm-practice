package com.lizi.year2021.day1229;

/**
 * @author lizi
 * @description TODO
 * @date 2021/12/29 09:15
 **/
public class OneTopic {
    public static void main(String[] args) {
        int res = 0, step = 0;
        int[] nums = {1,1,1,3,5};
        dfs(res,nums,step,new int[4], new boolean[nums.length]);
        System.out.println(res);
    }
    public static int dfs(int res,int[] nums,int step,int[] value,boolean[] vis){
        if(step == 4){
            if(value[0] < value[1] && value[1] < value[2] && (nums[value[0]] + nums[value[1]] + nums[value[2]] == nums[value[3]])){
                res += 1 ;
                return res;
            }
        }

        for(int i = 0; i < nums.length;i++){
            if(vis[i]){
                continue;
            }
            vis[i] = true;
            if(step < 4){
                value[step] = i;
            }
            res = dfs(res, nums, step + 1, value,vis);
            vis[i] = false;
        }
        return res;
    }
}

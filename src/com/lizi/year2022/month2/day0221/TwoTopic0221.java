package com.lizi.year2022.month2.day0221;

/**
 * @author lizi
 * @description TODO
 * @date 2022/2/21 19:51
 **/
public class TwoTopic0221 {
    public static void main(String[] args) {
        rob(new int[]{2,7,9,3,1});
    }
    public static int rob(int[] nums) {
        int len = nums.length;
        int dp[] = new int[len];
        if(len < 3){
            return len == 1 ? nums[0] : Math.max(nums[0], nums[1]);
        }
        dp[0] = nums[0];
        dp[1] = Math.max(nums[0], nums[1]);
        for(int i = 2; i < len; i++){
            dp[i] = Math.max(dp[i - 1], dp[i - 2] + nums[i]);
        }
        return dp[len - 1];
    }
}

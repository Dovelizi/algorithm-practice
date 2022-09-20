package com.lizi.year2022.month3.day0323;

/**
 * @author lizi
 * @description TODO
 * @date 2022/3/23 12:32
 **/
public class TwoTopic0323 {
    public static void main(String[] args) {
        maxSubArray(new int[]{-2,1,-3,4,-1,2,1,-5,4});
    }
    public static int maxSubArray(int[] nums) {
        int res = nums[0];
        int sum = 0;
        for (int num : nums) {
            if (sum > 0){
                sum += num;
            }else{
                sum = num;
            }
            res = Math.max(res, sum);
        }
        return res;
    }
}

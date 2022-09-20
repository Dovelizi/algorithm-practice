package com.lizi.year2021.day1210;

/**
 * @author lizi
 * @description TODO
 * @date 2021/12/10 23:04
 **/
public class FourTopic {
    public static void main(String[] args) {
        threeSumClosest(new int[]{1,1,-1,-1,3},-1);
    }
    public static int threeSumClosest(int[] nums, int target) {
        int minNum = Integer.MAX_VALUE / 2;
        for(int i = 0; i < nums.length; i++){
            for(int j = i + 1; j < nums.length; j++){
                for(int k = j + 1; k < nums.length; k++){
                    int addNum = nums[i] + nums[j] + nums[k];
                    minNum = addNum - target < minNum - target ? addNum : minNum;
                }
            }
        }
        return minNum;
    }
}

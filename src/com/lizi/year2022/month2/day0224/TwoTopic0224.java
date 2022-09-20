package com.lizi.year2022.month2.day0224;

/**
 * @author lizi
 * @description TODO
 * @date 2022/2/24 13:03
 **/
public class TwoTopic0224 {
    public static void main(String[] args) {
        canJump(new int[]{1,1,1,1,0,0,0,0,0});
    }
    public static boolean canJump(int[] nums) {
        int len = nums.length;
        int path = nums[0];

        for(int i = 0; i < len; i++){
           if(nums[i] >= path){
               path = nums[i];
           }else{
               path-- ;
           }
        }
        return path > 0;
    }
}

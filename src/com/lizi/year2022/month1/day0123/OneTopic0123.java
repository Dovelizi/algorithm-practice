package com.lizi.year2022.month1.day0123;

import java.util.Arrays;

/**
 * @author lizi
 * @description TODO
 * @date 2022/1/23 10:29
 **/
public class OneTopic0123 {
    public static void main(String[] args) {
        countElements(new int[]{-9,-9,-9,8,7,7,10,10});
    }
    public static int countElements(int[] nums) {
        if(nums.length < 3){
            return 0;
        }
        Arrays.sort(nums);
        int pre = 0;
        int next = nums.length - 1;
        int minNum = nums[0];
        int maxNum = nums[next];
        for(int i = 1; i < nums.length; i++){
            if(nums[i] == minNum){
                pre++;
            }else{
                break;
            }
        }
        for(int i = nums.length - 2; i > 0; i--){
            if(nums[i] == maxNum){
                next-- ;
            }else{
                break;
            }
        }
        return Math.max(next - pre - 1, 0);
    }
}

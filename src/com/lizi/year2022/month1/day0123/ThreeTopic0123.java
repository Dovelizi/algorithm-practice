package com.lizi.year2022.month1.day0123;

import java.util.Arrays;
import java.util.LinkedList;
import java.util.List;

/**
 * @author lizi
 * @description TODO
 * @date 2022/1/23 10:29
 **/
public class ThreeTopic0123 {
    public static void main(String[] args) {
        findLonely(new int[]{1,2,4,3,6,4,7,9});
    }
    public static List<Integer> findLonely(int[] nums) {
        List<Integer> resList = new LinkedList<>();
        int len = nums.length;
        if(len == 1){
            resList.add(nums[0]);
            return resList;
        }
        Arrays.sort(nums);
        for(int i = 0; i < len - 2; i++){
            if(checkNum(nums[i], nums[i+1], nums[i+2])){
                resList.add(nums[i+1]);
            }
        }
        if(Math.abs(nums[0] - nums[1]) >= 2){
            resList.add(nums[0]);
        }
        if(Math.abs(nums[len - 1] - nums[len - 2]) >= 2){
            resList.add(nums[len - 1]);
        }
        return resList;
    }
    public static boolean checkNum(int a, int b, int c){
        return (Math.abs(b - a) >= 2) && (Math.abs(b - c) >= 2);
    }
}

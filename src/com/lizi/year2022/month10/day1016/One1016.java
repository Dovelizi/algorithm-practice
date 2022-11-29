package com.lizi.year2022.month10.day1016;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/**
 * @author lizi
 * @date 2022/10/16 10:26
 * @description TODO
 **/
public class One1016 {
    public static void main(String[] args) {

    }
    public int findMaxK(int[] nums) {
        int ans = -1;
        List<Integer> list = new ArrayList<>();
        Arrays.sort(nums);
        for (int n : nums){
            if(n > 0){
                break;
            }else {
                list.add(n);
            }
        }
        for (int i = nums.length - 1; i >= 0; i--) {
            if(nums[i] < 0){
                break;
            }
            if(list.contains(nums[i] * -1)){
                return nums[i];
            }
        }

        return ans;
    }
}

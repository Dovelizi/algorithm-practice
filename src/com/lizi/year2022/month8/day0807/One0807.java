package com.lizi.year2022.month8.day0807;

import java.util.LinkedList;
import java.util.List;

/**
 * @author lizi
 * @description TODO
 * @date 2022/8/7 10:28
 **/
public class One0807 {
    public int arithmeticTriplets(int[] nums, int diff) {
        List<Integer> list = new LinkedList<>();
        int len = nums.length;
        int ans = 0;
        for(int n : nums){
            list.add(n);
        }
        for(int i = 0 ; i < len; i++){
            int temp = nums[i] + diff;
            if(list.contains(temp) && list.contains(temp + diff)){
                ans++ ;
            }
        }
        return ans;
    }
}

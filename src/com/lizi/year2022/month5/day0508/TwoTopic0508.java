package com.lizi.year2022.month5.day0508;

import java.util.*;

/**
 * @author lizi
 * @description TODO
 * @date 2022/5/8 21:11
 **/
public class TwoTopic0508 {
    public List<Integer> findDuplicates(int[] nums) {
        Arrays.sort(nums);
        List<Integer> list = new ArrayList<>();
        int idx = 0;
        while(idx < nums.length - 1){
            if(nums[idx] == nums[idx + 1]){
                list.add(nums[idx]);
                idx += 2;
            }else{
                idx++ ;
            }
        }
        return list;
    }
}

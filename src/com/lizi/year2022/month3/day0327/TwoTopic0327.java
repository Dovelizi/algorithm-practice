package com.lizi.year2022.month3.day0327;

import java.util.ArrayList;
import java.util.List;

/**
 * @author lizi
 * @description TODO
 * @date 2022/3/27 10:22
 **/
public class TwoTopic0327 {
    public static void main(String[] args) {
        minDeletion(new int[]{1,1,1,1,1,1,1,1,1});
    }
    public static int minDeletion(int[] nums) {
        int ans =0;
        List<Integer> list = new ArrayList<>();
        for (int n : nums){
            list.add(n);
        }
        for(int i = 0; i < list.size() - 1;){
            if((i % 2 == 0) && list.get(i).equals(list.get(i+1))){
                list.remove(i);
                ans++ ;
            }else{
                i++;
            }
        }
        if(list.size() % 2 != 0){
            ans++ ;
        }
        return ans;
    }
}

// [9,7,5,4,5,4,3,2,3,1,3,4,5,6,7]
//
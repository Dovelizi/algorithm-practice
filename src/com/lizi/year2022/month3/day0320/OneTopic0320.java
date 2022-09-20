package com.lizi.year2022.month3.day0320;

import java.util.ArrayList;
import java.util.List;

/**
 * @author lizi
 * @description TODO
 * @date 2022/3/20 10:23
 **/
public class OneTopic0320 {
    public static void main(String[] args) {
        countHillValley(new int[]{2,4,1,1,6,5});
    }
    public static int countHillValley(int[] nums) {
       int ans = 0;
       List<Integer> list = new ArrayList<>();
       list.add(nums[0]);
       int flag = nums[0];
       for(int i = 1; i < nums.length; i++){
           if(nums[i] != flag){
               list.add(nums[i]);
               flag = nums[i];
           }
       }
       if(list.size() < 2){
           return ans;
       }

        int pre = 0, mid = 1,next = 2;
        while (next < list.size()){
            boolean con1 = list.get(mid) > list.get(pre) && list.get(mid) > list.get(next);
            boolean con2 = list.get(mid) < list.get(pre) && list.get(mid) < list.get(next);
            if(con1 || con2){
                ans++ ;
            }
            pre++ ;
            mid++ ;
            next++ ;
        }
        return ans;
    }
}

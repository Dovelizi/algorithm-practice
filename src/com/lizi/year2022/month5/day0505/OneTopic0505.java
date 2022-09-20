package com.lizi.year2022.month5.day0505;

import java.util.HashMap;
import java.util.Map;

/**
 * @author lizi
 * @description TODO
 * @date 2022/5/5 13:27
 **/
public class OneTopic0505 {
    public static void main(String[] args) {
        numSubarrayProductLessThanK(new int[]{10,5,2,6}, 100);
        Map<Integer, Integer> map = new HashMap<>(5);
    }
    public static int numSubarrayProductLessThanK(int[] nums, int k) {
        int len = nums.length;
        int ans = 0;
        for (int i = 0; i < len; i++) {
            int temp = i;
            long sum = 1L;
            while(temp < len){
                sum *= nums[temp];
                temp++ ;
                if(sum < k){
                    ans++ ;
                }else{
                    break;
                }
            }
        }
        return ans;
    }
}

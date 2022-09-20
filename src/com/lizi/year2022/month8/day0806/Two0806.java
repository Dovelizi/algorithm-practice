package com.lizi.year2022.month8.day0806;

import java.util.HashMap;
import java.util.Map;

/**
 * @author lizi
 * @description TODO
 * @date 2022/8/6 22:26
 **/
public class Two0806 {
    public static void main(String[] args) {
        countBadPairs(new int[]{56,30,2,73,28,81,75,75,18,63,54,10,69,85,33,89,12,78,57,60,54,65,74,63,53,77});
    }
    public static long countBadPairs(int[] nums) {
        long ans = 0L;
        long count = 0L;
        long len = nums.length;
        Map<Integer, Long> map = new HashMap<>();
        for (int i = 0; i < len; i++) {
           map.put(nums[i] - i, map.getOrDefault(nums[i] - i, 0L) + 1);
        }
        for (Map.Entry<Integer, Long> entry : map.entrySet()){
            if(entry.getValue() > 1){
                long temp = entry.getValue() - 1;
                count += ((temp + 1) * temp) / 2 ;
            }
        }
        if(count == len){
            return 0;
        }
        len-- ;
        ans = ((len + 1) * len) / 2 - count;
        return ans;
    }
}

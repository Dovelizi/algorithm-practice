package com.lizi.year2022.month9.day0904;

import java.util.HashMap;
import java.util.Map;

/**
 * @author lizi
 * @date 2022/9/3 22:30
 * @description TODO
 **/
public class Three0904 {
    public static void main(String[] args) {
        findSubarrays(new int[]{1,2,3,4,5,6});
    }
    public static boolean findSubarrays(int[] nums) {
        Map<Integer, Integer> map = new HashMap<>();
        int len = nums.length;
        for (int i = 0; i < len - 1; i++) {
            int count = nums[i] + nums[i+1];
            map.put(count, map.getOrDefault(count, 0) + 1);
        }
        for (Map.Entry<Integer, Integer> entry : map.entrySet()){
            if(entry.getValue() > 1){
                return true;
            }
        }
        return false;
    }
}

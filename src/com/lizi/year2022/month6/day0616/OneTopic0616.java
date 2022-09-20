package com.lizi.year2022.month6.day0616;

import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;
import java.util.Objects;

/**
 * @author lizi
 * @description TODO
 * @date 2022/6/16 08:57
 **/
public class OneTopic0616 {
    public static void main(String[] args) {
        findPairs(new int[]{3, 1, 4, 1, 5}, 0);
    }
    public static int findPairs(int[] nums, int k) {
        int ans = 0;
        Map<Integer, Integer> map = new HashMap<>();
        Arrays.sort(nums);
        for(int n : nums){
            map.put(n, map.getOrDefault(n, 0) + 1);
        }
        if(k == 0){
            for (Map.Entry<Integer, Integer> entry : map.entrySet()){
                if(entry.getValue() > 1){
                    ans += entry.getValue() / 2;
                }
            }
            return ans;
        }
        for (int n : nums){
            int temp = n + k;
            if (temp > nums[nums.length - 1]){
                break;
            }
            if(map.get(n) > 0 && Objects.nonNull(map.get(temp)) && map.get(temp) > 0){
                map.put(n, 0);
                ans++ ;
            }
        }
        return ans;
    }
}

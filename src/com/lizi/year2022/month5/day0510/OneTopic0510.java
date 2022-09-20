package com.lizi.year2022.month5.day0510;

import java.util.*;

/**
 * @author lizi
 * @description TODO
 * @date 2022/5/10 10:33
 **/
public class OneTopic0510 {
    public static void main(String[] args) {
        threeSum(new int[]{-4,-2,1,-5,-4,-4,4,-2,0,4,0,-2,3,1,-5,0});
    }
    public static List<List<Integer>> threeSum(int[] nums) {
        Map<Integer, Integer> map = new HashMap<>();
        List<List<Integer>> ans = new ArrayList<>();
        int len = nums.length;
        for(int n : nums){
            map.put(n, map.getOrDefault(n, 0) + 1);
        }
        for (int i = 0; i < len; i++) {
            for (int j = i + 1; j < len; j++) {
                if(i != j){
                    int temp = -1 * (nums[i] + nums[j]);
                    map.put(nums[i], map.get(nums[i]) - 1);
                    map.put(nums[j], map.get(nums[j]) - 1);
                    if(map.get(temp) != null && map.get(temp) > 0){
                        List<Integer> list = Arrays.asList(nums[i], nums[j], temp);
                        Collections.sort(list);
                        ans.add(list);
                    }
                    map.put(nums[i], map.get(nums[i]) + 1);
                    map.put(nums[j], map.get(nums[j]) + 1);
                }
            }
        }
        return ans;
    }
}

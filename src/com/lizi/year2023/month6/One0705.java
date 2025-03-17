package com.lizi.year2023.month6;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/**
 * @author lizi
 * @since 2023-07-05
 **/
public class One0705 {
    public static void main(String[] args) {
        fourSum(new int[]{1,0,-1,0,-2,2}, 0);
    }
    public static List<List<Integer>> fourSum(int[] nums, int target) {
        List<List<Integer>> ans = new ArrayList<>();
        Arrays.sort(nums);
        int len = nums.length;
        int idx = len - 1;
        for(int i = 0; i < len - 3; i++){
            boolean flag = false;
            int num = nums[i];
            int left = i + 1, right = idx;
            int mid = (left + right) / 2;
            int sum = num + nums[left] + nums[mid] + nums[right];
            if(sum > target){
                while(left < mid && nums[mid - 1] == nums[mid]){
                    mid-- ;
                }
                if(num + nums[left] + nums[mid] + nums[right] == target){
                    ans.add(Arrays.asList(num, nums[left], nums[mid], nums[right]));
                }
            }else if(sum < target){
                while(mid < right && nums[mid + 1] == nums[mid]){
                    mid++ ;
                }
                if(num + nums[left] + nums[mid] + nums[right] == target){
                    ans.add(Arrays.asList(num, nums[left], nums[mid], nums[right]));
                }
            }else{
                ans.add(Arrays.asList(num, nums[left], nums[mid], nums[right]));
            }
        }
        return ans;
    }
}

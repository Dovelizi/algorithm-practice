package com.lizi.year2022.month1.day0119;

/**
 * @author lizi
 * @description TODO
 * @date 2022/1/19 09:03
 **/
public class OneTopic0119 {
    public static void main(String[] args) {
        containsNearbyDuplicate(new int[]{1,2,3,1},3);
    }
    public static boolean containsNearbyDuplicate(int[] nums, int k) {
        int len = nums.length;
        for(int i = 0; i < len; i++){
            int idx = i + 1;
            int width = Math.min(i + k + 1, len);
            while(idx < width){
                if(nums[idx] == nums[i]){
                    return true;
                }
                idx++;
            }
        }
        return false;
    }
}

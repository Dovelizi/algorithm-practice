package com.lizi.year2022.month3.day0324;

/**
 * @author lizi
 * @description TODO
 * @date 2022/3/24 18:55
 **/
public class OneTopic0324 {
    public static void main(String[] args) {
        findKthLargest(new int[]{3,2,1,5,6,4}, 2);
    }
    public static int findKthLargest(int[] nums, int k) {
        int len = nums.length;
        int maxNum = Integer.MIN_VALUE;
        int ans = 0;
        int idx = 0;
        for(int i = 0; i < k; i++){
            for(int j = 0; j < len; j++){
                if(nums[j] > maxNum){
                    maxNum = nums[j];
                    idx = j;
                }
            }
            nums[idx] = -9999;
            ans = maxNum;
            maxNum = Integer.MIN_VALUE;
        }
        return ans;
    }
}

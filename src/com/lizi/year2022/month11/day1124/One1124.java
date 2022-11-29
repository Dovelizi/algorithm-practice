package com.lizi.year2022.month11.day1124;

/**
 * @author lizi
 * @date 2022/11/24 08:51
 * @description 795. 区间子数组个数
 **/
public class One1124 {
    public static void main(String[] args) {
        numSubarrayBoundedMax(new int[]{2,9,2,5,6}, 2, 8);
    }
    public static int numSubarrayBoundedMax(int[] nums, int left, int right) {
       return count(nums, right) - count(nums, left - 1);
    }
    public static int count(int[] nums, int limit){
        int ans = 0, count = 0;
        for (int x : nums){
            if(x <= limit) {
                 count++ ;
            }else {
                count = 0;
            }
            ans += count;
        }
        return ans;
    }
}

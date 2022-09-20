package com.lizi.year2022.month9.day0912;

/**
 * @author lizi
 * @date 2022/9/12 18:38
 * @description TODO
 **/
public class One0912 {
    public static void main(String[] args) {
        // specialArray(new int[]{3,6,7,7,0});
        findIdx(50, new int[]{5,6,7,8,9});
    }
    public static int specialArray(int[] nums) {
        int ans = -1;
        int flag = nums.length;

        return ans;
    }
    public static int findIdx(int num, int[] nums){
        int left = 0, right = nums.length - 1;
        int ans = -1;
        while(left <= right){
            int mid = (left + right) >> 1;
            if(nums[mid] > num){
                right = mid - 1;
            }else if(nums[mid] < num){
                left = mid + 1;
            }else {
                return mid;
            }
        }
        return ans;
    }
}

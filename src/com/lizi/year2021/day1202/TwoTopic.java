package com.lizi.year2021.day1202;

/**
 * @author lizi
 * @description TODO
 * @date 2021/12/2 11:20
 **/
public class TwoTopic {
    public static void main(String[] args) {
        search(new int[]{5,7,7,8,8,10},8);
    }
    public static int search(int[] nums, int target) {
        int len = nums.length;
        int left = 0;
        int right = len - 1;
        int middle = (left + right) / 2;
        int count = 0;
        while(left <= right){
            if(target < nums[middle]){
                right = middle - 1;
            }
            if(target > nums[middle]){
                left = middle + 1;
            }
            if(target == nums[middle]){
                count++ ;
                int tempMiddle = middle;
                while(middle >= left && target == nums[--middle]){
                    count++ ;
                }
                middle = tempMiddle;
                while(middle <= right && target == nums[++middle]){
                    count++ ;
                }
                break;
            }
            middle = (left + right) / 2;
        }
        return count;
    }
}

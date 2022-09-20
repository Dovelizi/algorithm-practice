package com.lizi.year2022.month3.day0304;

/**
 * @author lizi
 * @description TODO
 * @date 2022/3/4 19:55
 **/
public class OneTopic0304 {
    public static void main(String[] args) {
        subArrayRanges(new int[]{-3,-2,-1,4,4});
    }
    public static long subArrayRanges(int[] nums) {
        long resNum = 0L;
        int min = 0, max = 0;
        int len = nums.length;
        for(int i = 0; i < len; i++){
            min = nums[i];
            max = nums[i];
            for(int j = i + 1; j < len; j++){
                max = Math.max(nums[j],max);
                min = Math.min(nums[j],min);
                resNum += max - min;
            }
        }
        return resNum;
    }
}

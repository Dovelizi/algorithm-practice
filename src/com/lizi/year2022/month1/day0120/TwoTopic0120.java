package com.lizi.year2022.month1.day0120;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/**
 * @author lizi
 * @description TODO
 * @date 2022/1/20 10:53
 **/
public class TwoTopic0120 {
    public static void main(String[] args) {
        rotate(new int[]{1,2,3,4,5,6,7},3);
        List<Integer> list = new ArrayList<>();
    }
    public static void rotate(int[] nums, int k) {
        int len = nums.length;
        int[] arrNext = Arrays.copyOfRange(nums, len - k, len);
        int[] arrPre = Arrays.copyOfRange(nums,0, k+1);
        for (int i = 0; i < len; i++) {
            if(i < k){
                nums[i] = arrNext[i];
            }else{
                nums[i] = arrPre[i - k];
            }
        }
    }
}

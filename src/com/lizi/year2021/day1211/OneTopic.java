package com.lizi.year2021.day1211;

import java.util.Arrays;

/**
 * @author lizi
 * @description TODO
 * @date 2021/12/11 17:54
 **/
public class OneTopic {
    public static void main(String[] args) {
        exchange(new int[]{1,2,3,4});
    }
    public static int[] exchange(int[] nums) {
        Arrays.sort(nums);
        int pre = 0;
        int next = nums.length - 1;
        while(pre < next){
            if((nums[pre] & 1) == 0){
                if((nums[next] & 1) == 1){
                    int temp = nums[pre];
                    nums[pre] = nums[next];
                    nums[next] = temp;
                    pre++ ;
                    next-- ;
                }else{
                    next-- ;
                }
            }else{
                pre++ ;
            }
        }
        return nums;
    }
}

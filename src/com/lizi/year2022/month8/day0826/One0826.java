package com.lizi.year2022.month8.day0826;

/**
 * @author lizi
 * @description TODO
 * @date 2022/8/26 09:23
 **/
public class One0826 {
    public static void main(String[] args) {
        maxProduct(new int[]{1,5,4,5});
    }
    public static int maxProduct(int[] nums) {
        int num1 = 0;
        int num2 = 0;
        for(int i = 0; i < nums.length; i++){
            if(nums[i] > num1) {
                num2 = num1;
                num1 = nums[i];
            }else if (nums[i] > num2){
                num2 = nums[i];
            }
        }
        return (num1 - 1) * (num2 - 1);
    }
}

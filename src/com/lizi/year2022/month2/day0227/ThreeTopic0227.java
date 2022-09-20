package com.lizi.year2022.month2.day0227;

/**
 * @author lizi
 * @description TODO
 * @date 2022/2/27 10:48
 **/
public class ThreeTopic0227 {
    public static void main(String[] args) {
        optimalDivision(new int[]{1000, 100, 10, 2});
    }
    public static String optimalDivision(int[] nums) {
        StringBuilder sb = new StringBuilder(String.valueOf(nums[0]));
        for(int i = 1; i < nums.length; i++){
            if(i == 1){
                sb.append("/("+nums[i]);
            }else if(i == nums.length - 1){
                sb.append("/"+nums[i]+")");
            }else{
                sb.append("/"+nums[i]);
            }
        }
        return sb.toString();
    }
}

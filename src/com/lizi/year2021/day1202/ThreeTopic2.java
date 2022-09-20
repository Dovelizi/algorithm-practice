package com.lizi.year2021.day1202;

/**
 * @author lizi
 * @description TODO
 * @date 2021/12/3 00:13
 **/
public class ThreeTopic2 {
    public static void main(String[] args) {
        missingNumber(new int[]{0});
    }
    public static int missingNumber(int[] nums) {
        int maxNum = nums.length;
        int XOR1 = 0;
        int XOR2 = 0;
        while(maxNum >= 0){
            XOR1 ^= maxNum;
            maxNum--;
        }
        for(int item : nums){
            XOR2 ^= item;
        }
        return XOR1 ^ XOR2;
    }
}

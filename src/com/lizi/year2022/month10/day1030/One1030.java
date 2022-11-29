package com.lizi.year2022.month10.day1030;

import java.util.Arrays;

/**
 * @author lizi
 * @date 2022/10/30 10:20
 * @description 6220. 可被三整除的偶数的平均值
 **/
public class One1030 {
    public static void main(String[] args) {
        averageValue(new int[]{4,4,9,10});
    }
    public static int averageValue(int[] nums) {
        int len = nums.length;
        int count = 0;
        for (int i = 0; i < len; i++) {
            if((nums[i] & 1) == 1 || nums[i] % 3 != 0){
                nums[i] = 0;
            }else {
                count++ ;
            }
        }
        return count == 0 ? 0 : Math.floorDiv(Arrays.stream(nums).sum(), count);
    }
}

package com.lizi.year2022.month1.day0109;

/**
 * @author lizi
 * @description TODO
 * @date 2022/1/9 10:50
 **/
public class TwoTopic {
    public static int minSwaps(int[] nums) { // 0 1 3 4 7 9
        int flagNum = 0;
        int resWid = Integer.MAX_VALUE;
        for (int i = 0; i < nums.length; i++) {
           if(nums[i] == 1){
               flagNum++ ;
           }
        }

        for (int i = 0; i < nums.length; i++) {
            int width = 0;
            int zeroNum = 0;
            while(width < flagNum){
                int idx = (i + width) % nums.length;
                if(nums[idx] == 0){
                    zeroNum++;
                }
                width++;
            }
            resWid = Math.min(zeroNum,resWid);
        }
      return resWid;
    }
}

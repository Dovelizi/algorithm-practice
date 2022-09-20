package com.lizi.year2022.month1.day0123;

/**
 * @author lizi
 * @description TODO
 * @date 2022/1/23 10:29
 **/
public class TwoTopic0123 {
    public static void main(String[] args) {
        rearrangeArray(new int[]{3,1,-2,-5,2,-4});
    }
    public static int[] rearrangeArray(int[] nums) {
        int len = nums.length;
        int[] zArr = new int[len / 2];
        int[] fArr = new int[len / 2];
        int zIdx = 0;
        int fIdx = 0;
        for(int n : nums){
            if(n > 0){
                zArr[zIdx++] = n;
            }else{
                fArr[fIdx++] = n;
            }
        }
        zIdx = 0;
        fIdx = 0;
        for(int i = 0; i < len ; i++){
            if(((i + 1) & 1) == 1){
                nums[i] = zArr[zIdx++];
            }else{
                nums[i] = fArr[fIdx++];
            }
        }
        return nums;
    }
}

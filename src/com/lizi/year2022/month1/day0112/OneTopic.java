package com.lizi.year2022.month1.day0112;

/**
 * @author lizi
 * @description TODO
 * @date 2022/1/12 09:57
 **/
public class OneTopic {
    public static void main(String[] args) {
        increasingTriplet(new int[]{20,100,10,12,5,13});
    }
    public static boolean increasingTriplet(int[] nums) {
        int len = nums.length;
        if(len < 3){
            return false;
        }
        int pre = 0, next = len - 1;
        while(pre != next - 1){
            if(nums[pre] < nums[next]){
                int temp = pre;
                while(temp++ < next){
                    if(nums[temp] > nums[pre] && nums[temp] < nums[next]){
                        return true;
                    }else{
                        pre++ ;
                        next-- ;
                    }
                }
            }
            if(next != len - 2 && pre != next - 2){
                pre++;
            }
            if(pre == next - 2 && next != 2){
                pre = 0;
                next--;
            }
        }
        return false;
    }
}

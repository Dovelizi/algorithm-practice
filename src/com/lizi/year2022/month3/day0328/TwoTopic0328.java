package com.lizi.year2022.month3.day0328;

/**
 * @author lizi
 * @description TODO
 * @date 2022/3/28 22:19
 **/
public class TwoTopic0328 {
    public static void main(String[] args) {
        mySqrt(8);
    }
    public static int mySqrt(int x) {
        int left = 0, right = x;
        int mid;
        while(left < right && (left + 1) < right){
            mid = (left + right) / 2;
            long mult = (long) mid * mid;
            if(mult > x){
                right = mid;
            }else if(mult < x){
                left = mid;
            }else{
                return mid;
            }
        }
        return left;
    }
}

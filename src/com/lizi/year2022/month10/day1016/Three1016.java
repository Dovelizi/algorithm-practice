package com.lizi.year2022.month10.day1016;

/**
 * @author lizi
 * @date 2022/10/16 10:27
 * @description TODO
 **/
public class Three1016 {
    public static void main(String[] args) {
        sumOfNumberAndReverse(0);
    }
    public static boolean sumOfNumberAndReverse(int num) {
        boolean ans = false;
        for (int i = num / 2; i <= num; i++) {
            StringBuilder builder = new StringBuilder(String.valueOf(i));
            int n = i + Integer.parseInt(builder.reverse().toString());
            if(n == num){
                return true;
            }
        }

        return ans;
    }
}

package com.lizi.year2021.day1231;

/**
 * @author lizi
 * @description TODO
 * @date 2021/12/31 08:52
 **/
public class OneTopic {
    public static void main(String[] args) {
        checkPerfectNumber(28);
    }
    public static boolean checkPerfectNumber(int num) {
        int resNum = 0;
            for(int i = 1; i <= Math.sqrt(num); i++){
                if(num % i == 0){
                    int n = num / i;
                    resNum += i + n;
                }
            }
        return (resNum - num) == num;
    }
}

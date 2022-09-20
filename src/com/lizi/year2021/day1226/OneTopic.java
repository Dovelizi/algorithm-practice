package com.lizi.year2021.day1226;

/**
 * @author lizi
 * @description TODO
 * @date 2021/12/26 10:32
 **/
public class OneTopic {
    public static void main(String[] args) {
        isSameAfterReversals(0);
    }
    public static boolean isSameAfterReversals(int num) {
        if(num == 0){
            return true;
        }
        return num % 10 != 0;
    }
}

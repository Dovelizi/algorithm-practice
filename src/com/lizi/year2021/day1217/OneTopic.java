package com.lizi.year2021.day1217;

/**
 * @author lizi
 * @description TODO
 * @date 2021/12/17 09:37
 **/
public class OneTopic {
    public static void main(String[] args) {
        sumNums(6);
    }
    public static int sumNums(int n) {
        int result = n;
        boolean res = n > 0 && (result += sumNums(n - 1)) > 0;
        return result;
    }
}

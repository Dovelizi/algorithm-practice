package com.lizi.year2022.month4.day0411;

import java.math.BigDecimal;

/**
 * @author lizi
 * @description TODO
 * @date 2022/4/11 20:39
 **/
public class OneTopic0411 {
    public static void main(String[] args) {
        countNumbersWithUniqueDigits(3);
        BigDecimal a = new BigDecimal("10");
        BigDecimal o = new BigDecimal("3");
        System.out.print(a.divide(o).setScale(2, BigDecimal.ROUND_DOWN).doubleValue());

    }
    public static int countNumbersWithUniqueDigits(int n) {
        return new int[]{1,10,91,739,5275,32491,168571,712891,2345851}[n];
    }
}

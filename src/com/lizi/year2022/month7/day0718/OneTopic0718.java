package com.lizi.year2022.month7.day0718;

import java.math.BigDecimal;

/**
 * @author lizi
 * @description TODO
 * @date 2022/7/18 09:27
 **/
public class OneTopic0718 {
    public static void main(String[] args) {
        rounding("-0.0000007");
    }
    public static String rounding(String score){
        int plusOrMinus = BigDecimal.valueOf(Double.parseDouble(score)).compareTo(BigDecimal.ZERO);
        BigDecimal retDecimal = new BigDecimal(score).setScale(2,BigDecimal.ROUND_HALF_UP);
        String symbol = plusOrMinus > 0 ? "+" : (retDecimal.compareTo(BigDecimal.ZERO)==0 && plusOrMinus < 0) ? "-" : "";
        return symbol + retDecimal.toString();
    }
}

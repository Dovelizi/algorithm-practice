package com.lizi.year2022.month11.day1113;

import java.math.BigDecimal;

/**
 * @author lizi
 * @date 2022/11/13 10:29
 * @description TODO
 **/
public class One1113 {
    public double[] convertTemperature(double celsius) {
        BigDecimal var1 = BigDecimal.valueOf(celsius);
        BigDecimal var2 = var1.add(BigDecimal.valueOf(273.15));
        BigDecimal var3 = var1.multiply(BigDecimal.valueOf(1.80)).add(BigDecimal.valueOf(32.00));

        return new double[]{var2.doubleValue(), var3.doubleValue()};
    }
}

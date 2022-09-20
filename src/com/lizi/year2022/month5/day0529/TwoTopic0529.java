package com.lizi.year2022.month5.day0529;

import java.text.DecimalFormat;

/**
 * @author lizi
 * @description TODO
 * @date 2022/5/29 10:25
 **/
public class TwoTopic0529 {
    public static void main(String[] args) {
        isMoney("$5t");
        discountPrices("1 2 $3 4 $5 $6 7 8$ $9 $10$", 100);
    }
    public static String discountPrices(String sentence, int discount) {
        StringBuilder sb = new StringBuilder();
        String[] arrStr = sentence.split(" ");
        for(String s : arrStr){
            String temp = s;
            if(isMoney(s)){
                double v = Double.parseDouble(s.substring(1));
                DecimalFormat df = new DecimalFormat("0.00");
                String tranNum = df.format(v * (100 - discount) / 100);
                temp = "$" + tranNum;
            }
            sb.append(temp + " ");
        }
        sb.deleteCharAt(sb.length() - 1);
        return sb.toString();
    }

    public static boolean isMoney(String str){
        if(str.charAt(0) != '$'){
            return false;
        }
        if(str.length() <= 1){
            return false;
        }
        try {
            Double.parseDouble(str.substring(1));
        }catch (Exception e){
            return false;
        }
        return true;
    }
}

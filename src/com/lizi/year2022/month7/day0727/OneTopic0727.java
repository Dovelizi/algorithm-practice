package com.lizi.year2022.month7.day0727;

import java.util.LinkedList;
import java.util.Queue;

/**
 * @author lizi
 * @description TODO
 * @date 2022/7/27 13:10
 **/
public class OneTopic0727 {
    public static void main(String[] args) {
       // fractionAddition("7/2+2/3-3/4");
        calcFraction("25/6", "3/4",'-');

    }
    public static String fractionAddition(String expression) {
        Queue<Character> queue = new LinkedList<>();
        for (int i = 1; i < expression.toCharArray().length; i++){
            char ch = expression.charAt(i);
            if(ch == '+' || ch == '-'){
                queue.add(ch);
            }
        }
        String[] numbers = expression.replaceAll("-", ",").replaceAll("\\+", ",").split(",");
        String first = expression.charAt(0) == '-' ? "-" + numbers[1] : numbers[0];
        int idx = expression.charAt(0) == '-' ? 2 : 1;
        for(int i = idx; i < numbers.length; i++){
            first = calcFraction(first, numbers[i], queue.poll());
        }
        return first.length() < 3 ? first + "/1" : first;
    }
    public static String calcFraction(String num1, String num2,char symbol){
        if(num1.equals("0")){
            return symbol == '+' ? num2 : "-" + num2;
        }
        int specialSymbol1 = 1;
        int specialSymbol2 = 1;
        if(num1.charAt(0) == '-'){
            specialSymbol1 = -1;
        }
        if(symbol == '-'){
            specialSymbol2 = -1;
        }
        String[] split1 = num1.replaceAll("-", "").replaceAll("\\+", "").split("/");
        int z1 = Integer.parseInt(split1[0]);
        int m1 = Integer.parseInt(split1[1]);
        String[] split2 = num2.replaceAll("-", "").replaceAll("\\+", "").split("/");
        int z2 = Integer.parseInt(split2[0]);
        int m2 = Integer.parseInt(split2[1]);
        int mCommonMultiple = m1 == m2 ? m1 : commonMultiple(m1, m2);
        int multiple1 = m1 == m2 ? 1 : mCommonMultiple / m1;
        int multiple2 = m1 == m2 ? 1 : mCommonMultiple / m2;
        int totalZ = (specialSymbol1 * z1 * multiple1) + (specialSymbol2 * z2 * multiple2);
        if(totalZ == 0){
            return "0";
        }
        int calcTotalZSymbol = totalZ > 0 ? 1 : -1;
        totalZ = Math.abs(totalZ);
        int lastMultiple = commonDivisor(totalZ, mCommonMultiple);
        return lastMultiple == 0 ? calcTotalZSymbol * totalZ + "/" + mCommonMultiple :
                calcTotalZSymbol * (totalZ / lastMultiple) + "/" + mCommonMultiple / lastMultiple;
    }
    public static int commonDivisor(int num1, int num2){
        int maxNum = Math.max(num1, num2);
        int minNum = Math.min(num1, num2);
        while(maxNum % minNum != 0){
            int processNum = maxNum % minNum;
            maxNum = minNum;
            minNum = processNum;
        }
        return minNum;
    }
    public static int commonMultiple(int num1, int num2){
        return commonDivisor(num1, num2) == 0 ? 0 : num1 * num2 / commonDivisor(num1, num2);
    }
}

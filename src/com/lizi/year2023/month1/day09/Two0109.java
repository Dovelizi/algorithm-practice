package com.lizi.year2023.month1.day09;

/**
 * @author lizi
 * @date 2023/1/9 16:44
 * @description 2525. 根据规则将箱子分类
 **/
public class Two0109 {
    public static void main(String[] args) {
        categorizeBox(2909, 3968, 3272, 727);
    }
    public static String categorizeBox(int length, int width, int height, int mass) {
        int num0 = 100;
        int num1 = (int)1e4;
        int num2 = (int)1e9;
        long volume = (long) length * width * height;
        boolean condition1 = (length >= num1 || width >= num1 || height >= num1 || volume >= num2);
        boolean condition2 = mass >= num0;
        if(condition1 && condition2){
            return "Both";
        } else if (condition1) {
            return "Bulky";
        } else if (condition2) {
            return "Heavy";
        }else {
            return "Neither";
        }
    }
}

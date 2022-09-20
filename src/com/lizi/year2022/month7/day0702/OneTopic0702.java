package com.lizi.year2022.month7.day0702;

import java.util.Objects;

/**
 * @author lizi
 * @description TODO
 * @date 2022/7/2 22:57
 **/
public class OneTopic0702 {
    public static void main(String[] args) {
        multiply("123", "456");
    }
    public static String multiply(String num1, String num2) {
        if(Objects.equals("0", num1) ||Objects.equals("0", num2)){
            return "0";
        }
        char[] arr1 = num1.toCharArray();
        char[] arr2 = num2.toCharArray();
        int[] tempArr = new int[arr1.length + arr2.length - 1];
        StringBuilder ans = new StringBuilder();
        int idx = tempArr.length;
        for (int i = arr1.length - 1; i >= 0; i--) {
            int temp = idx - 1;
            for (int j = arr2.length - 1; j >= 0; j--) {
                int n1 = arr1[i] - '0';
                int n2 = arr2[j] - '0';
                tempArr[temp--] += n1 * n2;
            }
            idx-- ;
        }
        int flag = 0;
        for (int i = tempArr.length - 1; i >= 0; i--) {
            ans.insert(0, (tempArr[i] + flag) % 10);
            flag = (tempArr[i] + flag) / 10;
        }
        if(flag > 0){
            ans.insert(0, flag);
        }
        return ans.toString();
    }
}

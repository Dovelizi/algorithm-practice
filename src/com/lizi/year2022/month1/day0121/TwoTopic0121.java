package com.lizi.year2022.month1.day0121;

/**
 * @author lizi
 * @description 加一
 * @date 2022/1/21 19:57
 **/
public class TwoTopic0121 {
    public int[] plusOne(int[] digits) {
        int len = digits.length;
        int flag = 1;
        for (int i = len - 1; i >= 0; i--) {
            int temp = digits[i] + flag;
            digits[i] = temp % 10;
            flag = temp / 10;
        }
        return digits;
    }
}

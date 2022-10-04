package com.lizi.year2022.month10.day1002;

/**
 * @author lizi
 * @date 2022/10/2 10:29
 * @description 6194. 最小 XOR
 **/
public class Two1002 {
    public static void main(String[] args) {
        minimizeXor(15,14);
    }
    public static int minimizeXor(int num1, int num2) {
        int bitNum2 = Integer.bitCount(num2);
        String str = Integer.toBinaryString(num1);
        if(Integer.bitCount(num1) == bitNum2){
            return num1;
        }
        StringBuilder stringBuilder = new StringBuilder();
        for (int i = 0; i < str.length(); i++) {
            if(str.charAt(i) == '1' && bitNum2 > 0){
                bitNum2-- ;
                stringBuilder.append("1");
            }else {
                stringBuilder.append('0');
            }
        }
        for (int i = stringBuilder.length() - 1; i >= 0; i--) {
            if(stringBuilder.charAt(i) == '0' && bitNum2 > 0){
                bitNum2-- ;
                stringBuilder.setCharAt(i, '1');
            }
        }
        while (bitNum2-- > 0){
            stringBuilder.append("1");
        }
        return Integer.parseInt(stringBuilder.toString(), 2);
    }
}

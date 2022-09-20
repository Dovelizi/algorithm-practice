package com.lizi.year2022.month1.day0116;

/**
 * @author lizi
 * @description TODO
 * @date 2022/1/16 10:34
 **/
public class OneTopic0116 {
    public static void main(String[] args) {
        divideString("abcdefghij",3,'x');
    }
    public static String[] divideString(String s, int k, char fill) {
        int num = s.length() % k;
        if(num != 0){
            num = k - num;
        }
        while(num > 0){
            s = s + fill;
            num--;
        }
        int numLen = s.length() / k;
        String[] resArr = new String[numLen];
        int idx = 0;
        for (int i = 0; i < s.length(); i += k) {
            resArr[idx] = s.substring(i,i+k);
            idx++;
        }
        return resArr;
    }
}

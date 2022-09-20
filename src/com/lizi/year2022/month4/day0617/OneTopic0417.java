package com.lizi.year2022.month4.day0617;

/**
 * @author lizi
 * @description TODO
 * @date 2022/4/17 10:28
 **/
public class OneTopic0417 {
    public static void main(String[] args) {
        digitSum("1234",2);
    }
    public static String digitSum(String s, int k) {
        while (s.length() > k){
            int temp = 0;
            StringBuilder ans = new StringBuilder();
            for (int i = 0; i < s.length(); i++) {
                temp += Integer.parseInt(String.valueOf(s.charAt(i)));
                if((i+1) % k == 0 || i == s.length() - 1){
                    ans.append(temp);
                    temp = 0;
                }
            }
            s = ans.toString();
        }
        return s;
    }
}

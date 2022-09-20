package com.lizi.year2022.month4.day4020;

/**
 * @author lizi
 * @description TODO
 * @date 2022/4/21 10:51
 **/
public class OneTopic0420 {
    public static void main(String[] args) {
        toGoatLatin("I speak Goat Latin");
    }
    public static String toGoatLatin(String sentence) {
        StringBuilder sb = new StringBuilder();
        String s = "ma";
        String[] str = sentence.split(" ");
        for (int i = 0; i < str.length; i++) {
            if (sb.length() != 0){
                sb.append(" ");
            }
            if(vowel(str[i].charAt(0))){
                sb.append(str[i]);
            }else {
                int len = str[i].length();
                sb.append(str[i], 1, len);
                sb.append(str[i].charAt(0));
            }
            sb.append(s);
            sb.append(getStr(i + 1));

        }
        return sb.toString();
    }

    public static String getStr(int n){
        StringBuilder sb  = new StringBuilder();
        while(n-- > 0){
            sb.append("a");
        }
        return sb.toString();
    }

  public static boolean vowel(char ch){
        return ch == 'a' || ch == 'e' || ch == 'i' || ch == 'o' || ch == 'u' 
                || ch == 'A' || ch == 'E' || ch == 'I' || ch == 'O' || ch == 'U';
  }
}

package com.lizi.year2022.month1.day0127;

/**
 * @author lizi
 * @description TODO
 * @date 2022/1/27 22:55
 **/
public class OneTopic0127 {
    public static void main(String[] args) {
        System.out.println("");

    }
    public int countValidWords(String sentence) {
        String[] stringArr = sentence.split(" ");
        int resCount = 0;
        return 0;
    }
    public boolean valid(String str){
        int con1 = 0;
        int con2 = 0;
        for (char ch : str.toCharArray()){
            if (ch >= 97 && ch <= 122){
                continue;
            }
            if (ch == '-'){
                con1++ ;
                continue;
            }
            if(ch >= '0' && ch <= '9'){
                return false;
            }
            con2++ ;
        }
        return true;
    }
}

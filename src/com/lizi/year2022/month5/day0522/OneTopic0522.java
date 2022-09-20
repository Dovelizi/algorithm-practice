package com.lizi.year2022.month5.day0522;

/**
 * @author lizi
 * @description TODO
 * @date 2022/5/22 10:25
 **/
public class OneTopic0522 {
    public static void main(String[] args) {
        percentageLetter("foobar", 'o');
    }
    public static int percentageLetter(String s, char letter) {
        int len = s.length();
        int count = 0;
        for(char ch : s.toCharArray()){
            if(ch == letter){
                count++;
            }
        }
        if(count == 0){
            return 0;
        }
       return (int)Math.floor(1.0 * count / len* 100) ;
    }
}

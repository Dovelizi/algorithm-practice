package com.lizi.year2022.month10.day1015;

/**
 * @author lizi
 * @date 2022/10/15 22:27
 * @description TODO
 **/
public class One1015 {
    public static void main(String[] args) {
        countTime("??:??");
    }
    public static int countTime(String time) {
        if(!time.contains("?")){
            return 0;
        }
        char ch1 = time.charAt(0);
        char ch2 = time.charAt(1);
        char ch3 = time.charAt(3);
        char ch4 = time.charAt(4);
        int left = 1, right = 1;
        if(time.substring(0,2).contains("?")){
            if(ch1 == '?'){
                if(ch2 == '?'){
                    left = 24;
                } else if (ch2 - '0' < 5) {
                    left = 3;
                }else {
                    left = 2;
                }
            }else {
                if(ch1 - '0' < 2){
                    left = 10;
                }else {
                    left = 4;
                }
            }
        }
        if (time.substring(3,5).contains("?")){
            if(ch3 == '?' && ch4 == '?'){
                right = 60;
            } else if (ch3 == '?'){
                right = 6;
            }else {
                right = 10;
            }
        }
        return left * right;
    }
}

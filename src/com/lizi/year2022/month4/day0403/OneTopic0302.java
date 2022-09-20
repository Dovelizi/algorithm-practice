package com.lizi.year2022.month4.day0403;

/**
 * @author lizi
 * @description TODO
 * @date 2022/4/3 10:33
 **/
public class OneTopic0302 {
    public static void main(String[] args) {
        convertTime("09:41", "10:34");
    }
    public static int convertTime(String current, String correct) {
        int h1 = Integer.parseInt(correct.substring(0, 2));
        int h2 = Integer.parseInt(current.substring(0, 2));

        int m1 = Integer.parseInt(correct.substring(3,5));
        int m2 = Integer.parseInt(current.substring(3,5));

        int dh = h1 - h2;
        int dm = m1 - m2;
        if(dm < 0){
            dh-- ;
            dm = 60 - m2 + m1;
        }

        int ans = 0;

        while(dm != 0){
            if(dm >= 15){
                ans += dm / 15;
                dm %= 15;
            }
            if(dm >= 5){
                ans += dm / 5;
                dm %= 5;
            }
            if(dm < 5){
                ans += dm;
                dm = 0;
            }

        }

        return ans + dh;
    }
}

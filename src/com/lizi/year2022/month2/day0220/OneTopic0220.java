package com.lizi.year2022.month2.day0220;

/**
 * @author lizi
 * @description TODO
 * @date 2022/2/20 10:29
 **/
public class OneTopic0220 {
    public static void main(String[] args) {
        countEven(30);
    }
    public static int countEven(int num) {
        int resCount = 0;
        for(int i = 1; i <= num; i++){
            int bg = i % 10;
            int bs = i % 100 / 10;
            int bq = i / 100;
            if(((bg + bs + bq) % 2) == 0){
                resCount++ ;
            }
        }
        if(num == 1000){
            resCount--;
        }
        return resCount;
    }
}

package com.lizi.year2021.day1208;

/**
 * @author lizi
 * @description TODO
 * @date 2021/12/8 14:38
 **/
public class OneTopic2 {
    public int translateNum(int num) {
        if(num == 0){
            return 1;
        }
            if(num < 10){
                return 1;
            }
            if(num > 9 && num < 26){
                return translateNum(num / 100) + translateNum(num / 10);
            }else{
                return translateNum(num / 10);
            }
    }
}

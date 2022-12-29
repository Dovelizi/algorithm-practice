package com.lizi.year2022.month12.day1222;

/**
 * @author lizi
 * @date 2022/12/22 17:00
 * @description TODO
 **/
public class One1222 {
    public int maximumScore(int a, int b, int c) {
        if(a+b < c)return a+b;
        if(a+c < b)return a+c;
        if(c+b < a)return b+c;
        return (a+b+c)/2;
    }
}

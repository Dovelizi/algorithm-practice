package com.lizi.year2021.day1206;

/**
 * @author lizi
 * @description TODO
 * @date 2021/12/6 09:42
 **/
public class TwoTopic {
    public static void main(String[] args) {
        numWays(3);
    }
    public static int numWays(int n) {
        if(n <= 2){
            return n;
        }
        return numWays(n - 1) + numWays(n - 2);
    }
}

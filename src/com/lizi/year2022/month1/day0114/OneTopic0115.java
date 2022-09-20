package com.lizi.year2022.month1.day0114;

/**
 * @author lizi
 * @description TODO
 * @date 2022/1/14 11:59
 **/
public class OneTopic0115 {
    public static void main(String[] args) {
        nthUglyNumber(11);
    }
    public static int nthUglyNumber(int n) {
        if(n == 0){
            return n;
        }
        int point1 = 0, point2 = 0, point3 = 0;
        int[] resArr = new int[n + 1];
        // 丑数从 1 开始
        resArr[0] = 1;
        for(int i = 1; i <= n; i++){
            int minNum = Math.min(resArr[point1] * 2, resArr[point2] * 3);
            minNum = Math.min(minNum, resArr[point3] * 5);
            resArr[i] = minNum;
            if(resArr[point1] * 2 == minNum){
                point1++ ;
            }
            if(resArr[point2] * 3 == minNum){
                point2++ ;
            }
            if(resArr[point3] * 5 == minNum){
                point3++ ;
            }
        }
        return resArr[n - 1];
    }
}

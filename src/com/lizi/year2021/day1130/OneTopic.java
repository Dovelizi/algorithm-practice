package com.lizi.year2021.day1130;

/**
 * @author lizi
 * @description TODO
 * @date 2021/11/30 08:53
 **/
public class OneTopic {
    public static void main(String[] args) {;
        System.out.println(findNthDigit(11));
    }

    public static int findNthDigit(int n) {
        // 1-2147483647 所有数的位数之和的具体数量不会超过 9 * 10 * 9次方 * 9
        int maxLen = 9;
        // 定义开始的计数值
        int beginIdx = 1;
        // 定义最终要返回的数
        int returnNum = 0;
        while(beginIdx <= maxLen){
            // 公式就是当前下标乘9 再 乘对应的次方
            long currMaxLen = (long) (beginIdx * 9 * Math.pow(10,beginIdx - 1));
            // 循环判断减去之前区间的个数
            if(n >= currMaxLen){
                n -= currMaxLen;
            }else{
                // 求出每个区间之前的一个区间的最大值
                int endNum = (int) (Math.pow(10,beginIdx-1) - 1);
                // 用位数除以当前的区间中每位数的位数
                int carryNum = n / beginIdx;
                // 看是否有余数
                int remainder = n % beginIdx;
                // 锁定对应的数
                int totalNum = 0;
                if(remainder == 0){
                    // 如果刚好除尽，则为该数的最后一位
                    totalNum = endNum + carryNum;
                    returnNum = totalNum % 10;
                    break;
                }else{
                    // 如果有余数，则需要对应按位数取值
                    totalNum = endNum + carryNum + 1;
                    returnNum = (int) (totalNum / Math.pow(10,beginIdx - remainder)) % 10;
                    break;
                }
            }
            beginIdx++;
        }
        return returnNum;

    }
}

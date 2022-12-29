package com.lizi.year2022.month12.day1202;

/**
 * @author lizi
 * @date 2022/12/2 09:19
 * @description TODO
 **/
public class Two1202 {
    public static void main(String[] args) {
        minOperations("10101010");
    }
    public static int[] minOperations(String boxes) {
        int n = boxes.length(), leftMoves = 0, rightMoves = 0, leftNum = 0, rightNum = 0;
        char[] arr = boxes.toCharArray();
        int[] ret = new int[n];
        for (int i = 1; i < n; i++) {
            // 累计左边的 1 的个数
            leftNum += arr[i - 1] - '0';
            // 每次 i + 1 然后将之前的所有 1 都往后移动一个单位
            // leftMoves 为 i 之前所有 1 移向 i 的距离之和
            leftMoves += leftNum;
            ret[i] += leftMoves;
            rightNum += arr[n - i] - '0';
            rightMoves += rightNum;
            ret[n - i - 1] += rightMoves;
        }
        return ret;
    }
}

package com.lizi.year2022.month5.day0518;

/**
 * @author lizi
 * @description TODO
 * @date 2022/5/18 10:53
 **/
public class OneTopic0518 {
    public static void main(String[] args) {
        findKthNumber(3, 3, 5);
    }
    public static int findKthNumber(int m, int n, int k) {
        int left = 1, right = m * n;
        while (left < right) {
            int x = left + (right - left) / 2;
            int count = x / n * n;
            for (int i = x / n + 1; i <= m; ++i) {
                count += x / i;
            }
            if (count >= k) {
                right = x;
            } else {
                left = x + 1;
            }
        }
        return left;
    }
}

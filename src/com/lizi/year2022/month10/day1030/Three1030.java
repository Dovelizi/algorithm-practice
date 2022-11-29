package com.lizi.year2022.month10.day1030;

/**
 * @author lizi
 * @date 2022/10/30 10:20
 * @description 6222. 美丽整数的最小增量
 **/
public class Three1030 {
    public static void main(String[] args) {
        makeIntegerBeautiful(987654, 20);
    }
    public static long makeIntegerBeautiful(long n, int target) {
        long result = 0;
        /*
        * note: 使用流操作字符串或者某个整数中所有的的字符
        * ("" + n).chars().map(o -> o - '0').sum()
        * */
        for (long i = 1; ("" + n).chars().map(o -> o - '0').sum() > target; i *= 10) {
            // 每次将最后一位非 0 的数变为 0 所需要累加的数据
            result += i * (10 - n / i % 10);
            n += i * (10 - n / i % 10);
        }
        return result;
    }
}


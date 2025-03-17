package com.lizi.year2023.month1.day09;

/**
 * @author lizi
 * @date 2023/1/9 18:45
 * @description TODO
 **/
public class Three0109_1 {
    private int count, value, k;
    public static void main(String[] args) {
        Three0109_1 t = new Three0109_1(4, 3);
        t.consec(4);
        t.consec(4);
        t.consec(4);
        t.consec(3);
        t.consec(3);
    }

    public Three0109_1(int value, int k) {
        this.value = value;
        this.k = k;
    }

    public boolean consec(int num) {
        System.out.println(count);
        return (count = num == value ? count + 1 : 0) >= k;
    }
}

package com.lizi.year2021.day1211;

/**
 * @author lizi
 * @description TODO
 * @date 2021/12/11 20:37
 **/
public class Demo {
    public static void main(String[] args) {
        int[] people = new int[]{0,1,2,2,1};
        int[] times = new int[]{20,28,29,54,56};
        ThreeTopic t = new ThreeTopic(people,times);
        t.q(57);
        t.q(56);

    }
}

package com.lizi.year2021.day1129;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/**
 * @author lizi
 * @description TODO
 * @date 2021/11/29 17:46
 **/
public class TwoTopic {
    public static void main(String[] args) {
        int minValue = Integer.MIN_VALUE;
        List<Integer> list = new ArrayList<>();
        list.add(1);
        list.add(2);
        list.add(3);
        System.out.println(Arrays.toString(list.toArray()));
        list.remove(0);
        System.out.println(Arrays.toString(list.toArray()));
        System.out.println(list.get(0));
    }
}

package com.lizi.year2022.month9.day0915;

import java.util.Arrays;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

/**
 * @author lizi
 * @date 2022/9/15 09:43
 * @description TODO
 **/
public class One0915 {
    public static void main(String[] args) {
        List<String> list = Arrays.asList("a", "b", "c");
        List<String> list1 = Arrays.asList("a", "b", "c");
        Set<List> set = new HashSet<>();
        set.add(list1);
        set.add(list);
        System.out.println(set);
    }

    public int flipLights(int n, int presses) {
        return 0;
    }
}

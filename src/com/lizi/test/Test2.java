package com.lizi.test;

import java.util.Arrays;
import java.util.Set;
import java.util.stream.Collectors;

/**
 * @author lizi
 * @date 2022/10/12 09:19
 * @description TODO
 **/
public class Test2 {
    public static void main(String[] args) {

        String[] a = new String[2];
        Set<String> set = Arrays.stream(a).collect(Collectors.toSet());
        System.out.println(set.contains("9"));

    }
    public static double div(){
        return 0.0 / 0;
    }
}

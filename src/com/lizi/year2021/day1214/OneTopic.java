package com.lizi.year2021.day1214;

import java.util.ArrayList;
import java.util.List;

/**
 * @author lizi
 * @description TODO
 * @date 2021/12/14 20:50
 **/
public class OneTopic {
    public static void main(String[] args) {
        compareTo(new int[]{3,30,34,5,9});

    }
    public static String compareTo(int[] nums){
        List<String> list = new ArrayList<>();
        for (int num : nums) {
            list.add(String.valueOf(num));
        }
        list.sort((o1, o2) -> (o1 + o2).compareTo(o2 + o1));
        return String.join("", list);
    }
}

package com.lizi.year2022.month5.day0507;

import java.util.LinkedList;
import java.util.List;

/**
 * @author lizi
 * @description TODO
 * @date 2022/5/7 17:22
 **/
public class OneTopic0507 {
    public static void main(String[] args) {
        minMutation("AACCGGTT", "AACCGGTA", new String[]{"AACCGGTA"});
    }
    public static int minMutation(String start, String end, String[] bank) {
        int ans = -1;
        List<Integer> list = new LinkedList<>();
        for (int i = 0; i < start.length(); i++) {
            if(start.charAt(i) != end.charAt(i)){
                list.add(i);
            }
        }

        return ans;
    }

}

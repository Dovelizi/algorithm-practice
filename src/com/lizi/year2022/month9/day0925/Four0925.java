package com.lizi.year2022.month9.day0925;

import javafx.util.Pair;

import java.util.Set;
import java.util.TreeSet;

/**
 * @author lizi
 * @date 2022/9/25 10:29
 * @description TODO
 **/
public class Four0925 {
    public String[] sortPeople(String[] names, int[] heights) {
        int len = names.length;
        String[] ans = new String[len];
        Set<Pair<Integer, String>> set = new TreeSet<>((o1, o2) -> o2.getKey() - o1.getKey());
        for (int i = 0; i < len; i++) {
            set.add(new Pair<>(heights[i], names[i]));
        }
        int idx = 0;
        for (Pair<Integer, String> pair : set){
            ans[idx++] = pair.getValue();
        }
        return ans;
    }
}

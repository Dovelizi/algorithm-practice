package com.lizi.year2022.month12.day1202;

import java.util.ArrayList;
import java.util.List;

/**
 * @author lizi
 * @date 2022/12/2 08:53
 * @description 1769. 移动所有球到每个盒子所需的最小操作数
 **/
public class One1202 {
    public int[] minOperations(String boxes) {
        int len = boxes.length();
        int[] ans = new int[len];
        List<Integer> idxList = new ArrayList<>();
        for (int i = 0; i < len; i++) {
            if (boxes.charAt(i) == '1'){
                idxList.add(i);
            }
        }
        for (int i = 0; i < len; i++) {
            final int idx = i;
            final Integer reduce = idxList.stream().map(item -> Math.abs(item - idx)).reduce(0, Integer::sum);
            ans[i] = reduce;
        }
        return ans;
    }
}

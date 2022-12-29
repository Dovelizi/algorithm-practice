package com.lizi.year2022.month12.day1226;

import java.util.ArrayList;
import java.util.List;
import java.util.Objects;

/**
 * @author lizi
 * @date 2022/12/26 17:11
 * @description 2515. 到目标字符串的最短距离
 **/
public class One1226 {
    public int closetTarget(String[] words, String target, int startIndex) {
        int ans = Integer.MAX_VALUE;
        List<Integer> idxList = new ArrayList<>();
        int len = words.length;
        for (int i = 0; i < len; i++) {
            if(Objects.equals(words[i], target)){
                idxList.add(i);
            }
        }
        for (int i : idxList){
            int next = Math.abs(i - startIndex);
            int pre = len - next;
            ans = Math.min(ans, Math.min(next, pre));
        }
        return ans == Integer.MAX_VALUE ? -1 : ans;
    }
}

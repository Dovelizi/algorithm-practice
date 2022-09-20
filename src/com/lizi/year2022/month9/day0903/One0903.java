package com.lizi.year2022.month9.day0903;

import java.util.*;
import java.util.stream.Collectors;

/**
 * @author lizi
 * @date 2022/9/3 17:10
 * @description TODO
 **/
public class One0903 {
    public static void main(String[] args) {
        findLongestChain(new int[][]{{5,9},{-1,8},{-6,-2},{8,9},{4,8},{3,6},{2,6},{5,9},{-1,6},{-8,-7}});
    }
    public static int findLongestChain(int[][] pairs) {
        int ans = 1;
        int count = 1;
        List<int[]> list = Arrays.asList(pairs);
        list = list.stream().sorted(Comparator.comparingInt(o -> o[1])).collect(Collectors.toList());
        int idx = 0;
        for (int[] arr : list){
          pairs[idx++] = arr;
        }
        int[] compare = pairs[0];
        for (int i = 1; i < list.size(); i++) {
            if(compare[1] < pairs[i][0]){
                count++ ;
                compare = pairs[i];
            }
            ans = Math.max(ans, count);
        }
        return ans;
    }
}

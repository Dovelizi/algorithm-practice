package com.lizi.year2023.month09;

import java.util.*;

/**
 * @author lizi
 * @since 2023-09-24
 **/
public class One0924 {
    public static void main(String[] args) {
       // maximumSumOfHeights(Arrays.asList(5,3,4,1,1));
        String str = "abcdsfabc";
        str.startsWith("abc");
        PriorityQueue<Integer> queue = new PriorityQueue<>();
        Map<Integer, Integer> map = new HashMap<>();

    }
    public static long maximumSumOfHeights(List<Integer> maxHeights) {
        int len = maxHeights.size();
        long ans = 0L;
        long[] preArr = new long[len];
        long[] sufArr = new long[len];
        preArr[0] = 0;
        for(int i = 1; i < len; i++){
            if(maxHeights.get(i) >= maxHeights.get(i - 1)){
                preArr[i] = preArr[i - 1] + maxHeights.get(i);
            }else{

                preArr[i] = getMaxPre(maxHeights, i);
            }
        }
        sufArr[len - 1] = 0;
        for(int i = len - 2; i >= 0; i--){
            if(maxHeights.get(i) >= maxHeights.get(i + 1)){
                sufArr[i] = sufArr[i + 1] + maxHeights.get(i);
            }else{
                sufArr[i] = getMaxSuf(maxHeights, i);
            }
        }
        System.out.println(Arrays.toString(preArr));
        System.out.println(Arrays.toString(sufArr));
        for(int i = 0; i < len; i++){
            ans = Math.max(ans, preArr[i] + sufArr[i] + maxHeights.get(i));
        }
        return ans;
    }

    public static long getMaxPre(List<Integer> maxHeights, int idx){
        int max = maxHeights.get(idx);
        long count = 0L;
        while(--idx >    0){
            int cur = maxHeights.get(idx);
            if(cur >= max){
                count += max;
            }else{
                count += cur;
                max = cur;
            }
            System.out.println(count);
        }
        return count;
    }

    public static long getMaxSuf(List<Integer> maxHeights, int idx){
        int max = maxHeights.get(idx);
        long count = 0L;
        while(++idx < maxHeights.size()){
            int cur = maxHeights.get(idx);
            if(cur >= max){
                count += max;
            }else{
                count += cur;
                max = cur;
            }
        }
        return count;
    }
}

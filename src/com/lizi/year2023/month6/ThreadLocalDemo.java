package com.lizi.year2023.month6;

import javafx.util.Pair;

import java.util.*;

/**
 * @author lizi
 * @since 2023-06-06
 **/
public class ThreadLocalDemo {
    private  static final int HASH_INCREMENT = 0x61c88647;

    public static void main(String[] args) {
//        strToInt("-000000000000000000000000000000000000000000000000001");
//        long l = 9L;
//        int[] arr = new int[4];
//        Arrays.stream(arr).filter(n -> n > 0).count();
//        Map<Integer, Integer> count = new HashMap<>();
//
//        List<Integer> list = Arrays.asList(11,4,3,33,4,4,8,8,9,10);
//        List<Integer> toSetList = new ArrayList<>(new LinkedHashSet<>(list));
//        StringUtils.join(toSetList, ",");
        Queue<Pair<Integer, Integer>> deque = new PriorityQueue<>(Comparator.comparingInt(Pair::getValue));
        Pair<Integer, Integer> pair = new Pair<>(1,3);


        Map<Integer, Pair<Integer, Integer>> map = new HashMap<>();
        Map<Integer, Integer> map1 = new HashMap<>();
        map1.merge(1, 1, (preValue, newValue) -> preValue + 1);
        map.merge(pair.getKey(), new Pair<>(0, 1), (prePair, newPair) -> new Pair<>(prePair.getKey(), prePair.getValue() + 1));
        int[][] q = {{3,3,0},{1,2,0},{0,3,1},{0,3,2},{0,4,1}};
        canMakePaliQueries("abcda", q);

    }

    public static List<Boolean> canMakePaliQueries(String s, int[][] queries) {
        List<Boolean> ans = new ArrayList<>();
        int[] words = new int[26];
        int len = s.length();
        int[] diff = new int[len];
        diff[0] = 1;
        words[s.charAt(0) - 'a']++ ;
        for(int i = 1; i < len; i++){
            int times = words[s.charAt(i) - 'a']++;
            int n = ((times + 1) % 2 == 1 || times == 0) ? 1 : 0;
            diff[i] = diff[i - 1] + n;
            System.out.println(diff[i]);
        }
        for(int[] arr : queries){
            int a1 = arr[0], a2 = arr[1], a3 = arr[2];
            if(diff[a2] - diff[a1] / 2 <= a3){
                ans.add(Boolean.TRUE);
            }else{
                ans.add(Boolean.FALSE);
            }
        }
        return ans;
    }
    public static int strToInt(String str) {
        int ans = 0;
        str = str.trim();
        String[] spiltArr = str.split(" ");
        if(spiltArr.length == 0){
            return ans;
        }
        String retString = spiltArr[0];
        int len0 = retString.length();
        int countZ = 0;
        boolean isNumber = false;
        boolean isOther = false;
        for(int i = 0; i < len0; i++){
            char ch = retString.charAt(i);
            if(ch >= '0' && ch <= '9'){
                isNumber = true;
            }else if((ch == '+' || ch == '-') && i == 0){
                isOther = true;
            }else{
                isNumber = false;
                break;
            }
        }
        if(isNumber){
            if(len0 > 12 || Long.parseLong(retString) < Integer.MIN_VALUE || Long.parseLong(retString) > Integer.MAX_VALUE){
                return retString.charAt(0) == '-' ? Integer.MIN_VALUE : Integer.MAX_VALUE;
            }else{
                return Integer.parseInt(retString);
            }
        }
        return ans;
    }


    public static int lengthOfLongestSubstring(String s) {
        int[] arr = new int[128];
        int pre = 0, next = 0;
        int len = s.length();
        for (int i = 0; i < len; i++) {
            int idx = s.charAt(i);
            pre = Math.max(pre, arr[idx]);
            next = Math.max(next, i - pre + 1);
            arr[idx] = i + 1;
        }
        return next;
    }
}

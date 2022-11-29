package com.lizi.year2022.month10.day1014;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * @author lizi
 * @date 2022/10/14 08:56
 * @description 940. 不同的子序列 II
 **/
public class One1014 {
    public static void main(String[] args) {
        distinctSubseqII("zchmliaqdgvwncfatcfivphddpzjkgyygueikthqzyeeiebczqbqhdytkoawkehkbizdmcnilcjjlpoeoqqoqpswtqdpvszfaksn");
        Map<Integer, List<Integer>> map = new HashMap<>();
        List<Integer> list1 = new ArrayList<>();
        list1.add(1);
        list1.add(2);
        list1.add(3);
        list1.add(4);
        map.put(1, list1);
        List<Integer> list2 = new ArrayList<>();
        list2.add(5);
        list2.add(6);
        list2.add(7);
        list2.add(8);
        map.put(2, list2);

        List<Integer> orDefault = map.getOrDefault(2, new ArrayList<>());
        orDefault.add(1999);
        map.putIfAbsent(2, orDefault);
        List<Integer> list4 = map.getOrDefault(4, new ArrayList<>());
        list4.add(18888);
        map.putIfAbsent(4, list4);


    }
    public static int distinctSubseqII(String s) {
        long ans = 0;
        int len = s.length();
        long[] hash = new long[26];
        int MOD = (int) 1e9 + 7;
        for (int i = 0; i < len; i++) {
            long sum = 0;
            int idx = s.charAt(i) - 'a';
            for (int j = 0; j < 26; j++) {
                sum = (sum + hash[j]) % MOD;
            }
            hash[idx] = sum + 1;
        }
        for (long n : hash){
            ans = (ans + n) % MOD;
        }
        return (int) ans;
    }
}

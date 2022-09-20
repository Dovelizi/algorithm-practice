package com.lizi.year2021.day1226;

import java.util.*;

/**
 * @author lizi
 * @description TODO
 * @date 2021/12/26 20:00
 **/
public class FiveTopic {

    public static void main(String[] args) {
        permutation("abc");
        Map<Integer, Integer> map = new HashMap<>();
    }

    public static String[] permutation(String s) {
        Set<String> list = new HashSet<>();
        comString(s,new StringBuilder(),new boolean[s.length()],0,list);
        return list.toArray(new String[0]);
    }
    public static void comString(String str,StringBuilder sb, boolean[] vis, int idx,Set<String> list){
        if(idx == str.length()){
            list.add(sb.toString());
            return;
        }
        for (int i = 0; i < str.length(); i++) {
            if(vis[i]){
                continue;
            }
            vis[i] = true;
            comString(str,sb.append(str.charAt(i)),vis,idx + 1,list);
            sb.deleteCharAt(sb.length() - 1);
            vis[i] = false;
        }
    }
}

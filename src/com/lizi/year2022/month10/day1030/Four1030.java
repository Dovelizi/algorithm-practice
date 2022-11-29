package com.lizi.year2022.month10.day1030;

import java.util.*;

/**
 * @author lizi
 * @date 2022/10/30 10:21
 * @description 784. 字母大小写全排列
 **/
public class Four1030 {
    public static void main(String[] args) {
        letterCasePermutation("2a1b");
    }
    public static List<String> letterCasePermutation(String s) {
        Deque<String> ans = new LinkedList<>();

        for (char ch : s.toCharArray()){
            if(ch - '0' > 9){
                List<Character> list = trans(ch);
                if(ans.isEmpty()){
                    ans.add(String.valueOf(list.get(0)));
                    ans.add(String.valueOf(list.get(1)));
                }else {
                    int size = ans.size();
                    for (int i = 0; i < size; i++) {
                        String temp = ans.poll();
                        ans.add(temp + list.get(0));
                        ans.add(temp + list.get(1));
                    }
                }
            }else {
                if(ans.isEmpty()){
                    ans.add(String.valueOf(ch));
                }else {
                    int size = ans.size();
                    for (int i = 0; i < size; i++) {
                        String temp = ans.poll();
                        ans.add(temp + ch);
                    }
                }
            }
        }
        return new ArrayList<>(ans);
    }

    private static List<Character> trans(char ch){
        if(ch  > 96){
            return Arrays.asList(ch, Character.toUpperCase(ch));
        }
        return Arrays.asList(ch, Character.toLowerCase(ch));
    }
}


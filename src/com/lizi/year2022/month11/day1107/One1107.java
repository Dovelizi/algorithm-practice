package com.lizi.year2022.month11.day1107;

import java.util.*;

/**
 * @author lizi
 * @date 2022/11/7 08:49
 * @description 816. 模糊坐标
 **/
public class One1107 {
    public static void main(String[] args) {
        //ambiguousCoordinates("(00010)");
        checkStr("1.0");
    }
    public static List<String> ambiguousCoordinates(String s) {
        List<String> ans = new ArrayList<>();
        s = s.substring(1, s.length() - 1);
        int len = s.length();
        for (int i = 0; i < len - 1; i++) {
               String s1 = s.substring(0, i + 1);
               String s2 = s.substring(i + 1, len);
               int idx1 = 1;
               int idx2 = 1;
               Set<String> set1 = new HashSet<>();
               Set<String> set2 = new HashSet<>();
                if(checkStr(s1)){
                    set1.add(s1);
                }
            while (idx1 < s1.length()){
                StringBuilder sb1 = new StringBuilder(s1).insert(idx1++, ".");
                if(checkStr(sb1.toString())){
                    set1.add(sb1.toString());
                }
            }
            if(checkStr(s2)){
                set2.add(s2);
            }
            while (idx2 < s2.length()){
                StringBuilder sb2 = new StringBuilder(s2).insert(idx2++, ".");
                if(checkStr(sb2.toString())){
                    set2.add(sb2.toString());
                }
            }
            for (String str : set1){
                for (String str2 : set2){
                    ans.add(builder(str, str2));
                }
            }
        }
        return ans;
    }

    private static String builder(String str1, String str2){
        return "(" + str1 +
                ", " +
                str2 +
                ")";
    }
    private static boolean checkStr(String str){
        if(!str.contains(".")){
            return Objects.equals(str, "0") || str.charAt(0) != '0';
        }
        final String[] split = str.split("\\.");
        boolean check1 = Objects.equals(split[0], "0") || split[0].charAt(0) != '0';
        boolean check2 = split[1].charAt(split[1].length() - 1) != '0';
        boolean check3 = Integer.parseInt(split[0]) + Integer.parseInt(split[1]) != 0;
        return  check1 && check2 && check3;
    }
}

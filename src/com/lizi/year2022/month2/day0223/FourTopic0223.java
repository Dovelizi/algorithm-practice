package com.lizi.year2022.month2.day0223;

import java.util.*;

/**
 * @author lizi
 * @description TODO
 * @date 2022/2/23 19:20
 **/
public class FourTopic0223 {
    public static void main(String[] args) {
      groupAnagrams(new String[]{"eat", "tea", "tan", "ate", "nat", "bat"});
    }
    static List<List<String>> resList = new ArrayList<>();
    public static List<List<String>> groupAnagrams(String[] strs) {
        int len = strs.length;
        Set<String> set = new HashSet<>();
        String[] copyArr = Arrays.copyOf(strs,len);
        for(int i = 0; i < len; i++){
            copyArr[i] = trans(copyArr[i]);
        }
        for(int i = 0; i < len; i++){
            set.add(copyArr[i]);
        }
        Iterator<String> iterator = set.iterator();
        while (iterator.hasNext()){
            List<String> list = new ArrayList<>();
            String str = iterator.next();
            for(int i = 0; i < len; i++){
                if(Objects.equals(str, copyArr[i])){
                    list.add(strs[i]);
                }
            }
            resList.add(list);
        }
        return resList;
    }
    public static String trans(String str){
        int[] word = new int[26];
        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < str.length(); i++) {
            word[str.charAt(i) - 97]++ ;
        }
        for(int i = 0; i < word.length; i++){
            while(word[i] > 0){
                sb.append((char)(97 + i));
                word[i]-- ;
            }
        }
       return sb.toString();
    }
}

package com.lizi.year2021.day1204;

import java.util.*;

/**
 * @author lizi
 * @description TODO
 * @date 2021/12/4 17:52
 **/
public class OneTopic2 {
    public static void main(String[] args) {
        canConstruct("adfsdfasdf",
                "bfsdfaskjdfsdkjlfahsdfsdfhasdkjfsdfjsadhfsidufhasdifjdhsfjkasdhfewiurhferifhasudifbvasdiuvbasdouifsdhfasduifhasduifhsdiufashdfausdfhasdfuiasdhfsuidfhffffd");
    }
    public static boolean canConstruct(String ransomNote, String magazine) {
        Map<Character,Integer> ransomNoteMap = new HashMap<Character,Integer>();
        Map<Character,Integer> magazineMap = new HashMap<Character,Integer>();

        for(int i = 0; i < ransomNote.length(); i++){
            char ch = ransomNote.charAt(i);
            int count = ransomNoteMap.get(ch) == null ? 0 : ransomNoteMap.get(ch);
            ransomNoteMap.put(ch,count + 1);
        }

        for(int i = 0; i < magazine.length(); i++){
            char ch = magazine.charAt(i);
            int count = magazineMap.get(ch) == null ? 0 : magazineMap.get(ch);
            magazineMap.put(ch,count + 1);
        }

        for(Map.Entry<Character,Integer> map : ransomNoteMap.entrySet()){
            if(map.getValue() > magazineMap.get(map.getKey())){
                return false;
            }
        }
        List<Integer> resultList = new ArrayList<>();
//        resultList.toArray()

        return true;
    }
}

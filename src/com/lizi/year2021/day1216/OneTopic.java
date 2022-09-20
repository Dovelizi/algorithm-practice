package com.lizi.year2021.day1216;

import java.util.*;

/**
 * @author lizi
 * @description TODO
 * @date 2021/12/15 13:14
 **/
public class OneTopic {
   static List<String> resList = new LinkedList<>();
   static List<String> mapList = Arrays.asList("","","abc","def","ghi","jkl","mno","pqrs","tuv","wxyz");
    public static void main(String[] args) {
        letterCombinations("23");

    }

    public static List<String> letterCombinations(String digits) {
        findAllCombination(digits,0,new StringBuilder());
        return resList;
    }
    public static void findAllCombination(String digits, int idx, StringBuilder sbString){
        if(digits.length() == sbString.length()){
            resList.add(sbString.toString());
            return;
        }
        String str = mapList.get(digits.charAt(idx) - '0');
        for(char s : str.toCharArray()){
            sbString.append(s);
            findAllCombination(digits,idx + 1,sbString);
            sbString.deleteCharAt(sbString.length() - 1);
        }
    }

}

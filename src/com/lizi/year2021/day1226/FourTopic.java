package com.lizi.year2021.day1226;

import java.util.ArrayList;
import java.util.List;
import java.util.Objects;

/**
 * @author lizi
 * @description TODO
 * @date 2021/12/26 19:38
 **/
public class FourTopic {
    public static void main(String[] args) {
        findOcurrences("alice is a good girl she is a good student","a","good");
    }
    public static String[] findOcurrences(String text, String first, String second) {
        String[] testArr = text.split(" ");
        int textLen = testArr.length;
        List<String> list = new ArrayList<>();
        for(int i = 1; i < textLen; i++){
            if(Objects.equals(second,testArr[i]) && Objects.equals(first,testArr[i - 1])){
                if(i + 1 < textLen){
                    list.add(testArr[i + 1]);
                }
            }
        }
        return list.toArray(new String[list.size()]);
    }
}

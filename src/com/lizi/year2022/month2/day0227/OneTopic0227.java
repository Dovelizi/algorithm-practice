package com.lizi.year2022.month2.day0227;

import java.util.Objects;

/**
 * @author lizi
 * @description TODO
 * @date 2022/2/27 10:31
 **/
public class OneTopic0227 {
    public int prefixCount(String[] words, String pref) {
        int len = pref.length();
        int resNum = 0;
        for(String str : words){
            if(str.length() > len && Objects.equals(str.substring(0, len),pref)){
                resNum++ ;
            }
        }
     return resNum;
    }
}

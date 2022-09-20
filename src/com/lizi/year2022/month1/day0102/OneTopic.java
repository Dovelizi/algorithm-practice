package com.lizi.year2022.month1.day0102;

import java.util.ArrayList;
import java.util.List;

/**
 * @author lizi
 * @description TODO
 * @date 2022/1/2 10:31
 **/
public class OneTopic {
    public static void main(String[] args) {
        checkString("aaaabbbb");
    }
    public static boolean checkString(String s) {
       boolean bFlag = false;
       for(char ch : s.toCharArray()){
           if(ch == 'b'){
               bFlag = true;
           }
           if(ch == 'a' && bFlag){
               return false;
           }
       }
         return true;
    }
}

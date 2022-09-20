package com.lizi.year2022.month5.day0512;

import java.util.Arrays;

/**
 * @author lizi
 * @description TODO
 * @date 2022/5/12 11:58
 **/
public class OneTopic0512 {
    public static void main(String[] args) {
        minDeletionSize(new String[]{"zyx","wvu","tsr"});
    }
    public static int minDeletionSize(String[] strs) {
        int ans = 0;
        int len = strs.length;
        int lenC = strs[0].length();
        String[] arr = new String[lenC];
        Arrays.fill(arr, "");
        for (int i = 0; i < len; i++) {
            String temp = strs[i];
            for (int j = 0; j < temp.length(); j++) {
                if(arr[j] == "" || arr[j].charAt(arr[j].length() - 1) <= temp.charAt(j)){
                    arr[j] += temp.charAt(j);
                }else{
                    arr[j] += '0';
                }
            }
        }
        for(String s : arr){
            if(s.contains("0")){
                ans++ ;
            }
        }
        return ans;
    }
}

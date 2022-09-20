package com.lizi.year2021.day1210;

import java.util.Arrays;

/**
 * @author lizi
 * @description TODO
 * @date 2021/12/10 09:15
 **/
public class OneTopic {
    public static void main(String[] args) {
        int[] num1 = new int[]{1,2,3,4,5};
    }
    public String shortestCompletingWord(String licensePlate, String[] words) {
        licensePlate = licensePlate.toLowerCase();
        int[] count = new int[26];
        String str = null;
        for(int i = 0; i < licensePlate.length(); i++){
            char ch = licensePlate.charAt(i);
            if(ch - 0 > 96 && ch - 0 < 122){
                count[ch - 'a']++;
            }
        }
        for(int i = 0; i < words.length; i++){
            int[] copyArr = Arrays.copyOf(count,count.length);
            for(int j = 0; j < words[i].length(); j++){
                copyArr[words[i].charAt(j) - 'a']--;
            }
            for(int k = 0; k < copyArr.length;k++){
                if(copyArr[k] > 0){
                    break;
                }
                if(k == copyArr.length - 1){
                    if(str == null){
                        str = words[i];
                    }else{
                        str = words[i].length() < str.length() ? words[i] : str;
                    }
                }
            }
        }
        return str;
    }
}

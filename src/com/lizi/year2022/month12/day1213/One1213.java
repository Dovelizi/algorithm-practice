package com.lizi.year2022.month12.day1213;

/**
 * @author lizi
 * @date 2022/12/13 20:28
 * @description TODO
 **/
public class One1213 {
    public boolean checkIfPangram(String sentence) {
        int[] hash = new int[26];
        for (char c : sentence.toCharArray()) {
            hash[c - 'a']++ ;
        }
        for (int i : hash) {
            if(i == 0){
                return false;
            }
        }
        return true;
    }
}

package com.lizi.year2022.month12.day1219;

/**
 * @author lizi
 * @date 2022/12/19 19:40
 * @description TODO
 **/
public class One1219 {
    public static void main(String[] args) {
        convert("ab");
    }
    public static int similarPairs(String[] words) {
        int ans = 0;
        int len = words.length;
        for (int i = 0; i < len; i++) {
            for (int j = i + 1; j < len; j++) {
                if(convert(words[i]) == convert(words[j])){
                    ans++ ;
                }
            }
        }
        return ans;
    }
    public static int convert(String str){
        int ret = 0;
        for (char c : str.toCharArray()){
            ret |= (1 << c - 'a');
        }
        return ret;
    }
}

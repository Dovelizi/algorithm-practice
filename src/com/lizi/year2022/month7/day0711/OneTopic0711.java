package com.lizi.year2022.month7.day0711;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/**
 * @author lizi
 * @description TODO
 * @date 2022/7/11 09:02
 **/
public class OneTopic0711 {
    static List<String> list = new ArrayList<>();
    public OneTopic0711() {

    }

    public static void buildDict(String[] dictionary) {
        list = Arrays.asList(dictionary);
    }

    public static boolean search(String searchWord) {
        for (String str : list){
            if(diffWord(str, searchWord)){
                return true;
            }
        }
        return false;
    }

    public static void main(String[] args) {
        /**
         ["MagicDictionary", "buildDict", "search", "search", "search", "search", "search", "search", "search", "search", "search", "search", "search", "search", "search", "search", "search"]
         [[], [["a","b","ab","abc","abcabacbababdbadbfaejfoiawfjaojfaojefaowjfoawjfoawj","abcdefghijawefe","aefawoifjowajfowafjeoawjfaow","cba","cas","aaewfawi","babcda","bcd","awefj"]], ["a"], ["b"], ["c"], ["d"], ["e"], ["f"], ["ab"], ["ba"], ["abc"], ["cba"], ["abb"], ["bb"], ["aa"], ["bbc"], ["abcd"]]
         **/
        buildDict(new String[]{"a","b","ab","abc","abcabacbababdbadbfaejfoiawfjaojfaojefaowjfoawjfoawj","abcdefghijawefe","aefawoifjowajfowafjeoawjfaow","cba","cas","aaewfawi","babcda","bcd","awefj"});
       // search("a");
        diffWord("a", "b");
    }
    public static boolean diffWord(String w1, String w2){
        if(w1.length() != w2.length()){
            return false;
        }
        int flag = 0;
        for (int i = 0; i < w1.length(); i++) {
            if(w1.charAt(i) != w2.charAt(i)){
                flag++ ;
            }
        }
        return flag == 1;
    }
}

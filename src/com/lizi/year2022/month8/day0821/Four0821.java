package com.lizi.year2022.month8.day0821;

/**
 * @author lizi
 * @description TODO
 * @date 2022/8/21 10:15
 **/
public class Four0821 {
    public int isPrefixOfWord(String sentence, String searchWord) {
        String[] split = sentence.split(" ");
        for(int i = 0; i < split.length; i++) {
            int temp = searchWord.length();
            if(split[i].length() >= temp && split[i].substring(0,temp).equals(searchWord)) {
                return i + 1;
            }
        }
        return -1;
    }
}

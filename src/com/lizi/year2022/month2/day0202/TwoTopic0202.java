package com.lizi.year2022.month2.day0202;

/**
 * @author lizi
 * @description TODO
 * @date 2022/2/2 17:25
 **/
public class TwoTopic0202 {
    public static void main(String[] args) {
        reversePrefix("xyxzxe",'z');
    }
    public static String reversePrefix(String word, char ch) {
        int idx = 0;
        for (int i = 0; i < word.length(); i++) {
            if(word.charAt(i) == ch){
                idx = i + 1;
                break;
            }
        }
        String revString = "";
        for(int i = idx - 1; i >= 0; i--){
            revString += word.charAt(i);
        }
        return revString + word.substring(idx);
    }
}

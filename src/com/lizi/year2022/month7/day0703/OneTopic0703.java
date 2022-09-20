package com.lizi.year2022.month7.day0703;

/**
 * @author lizi
 * @description TODO
 * @date 2022/7/3 10:27
 **/
public class OneTopic0703 {
    public static void main(String[] args) {
        decodeMessage("the quick brown fox jumps over the lazy dog", "vkbs bs t suepuv");
    }
    public static String decodeMessage(String key, String message) {
        char[] chars = new char[26];
        boolean[] flag = new boolean[26];
        int cur = 0;
        StringBuilder ans = new StringBuilder();
        key = key.replace(" ","");
        for(char ch : key.toCharArray()){
            int idx = ch - 97;
            if(!flag[idx]){
                chars[idx] = (char) ('a' + cur);
                flag[idx] = true;
                cur++;
            }
        }
        for(char ch : message.toCharArray()){
            if(ch == ' '){
                ans.append(" ");
            }else{
                ans.append(chars[ch - 97]);
            }
        }
        return ans.toString();
    }
}

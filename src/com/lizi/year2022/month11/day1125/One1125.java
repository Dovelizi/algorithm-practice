package com.lizi.year2022.month11.day1125;

/**
 * @author lizi
 * @date 2022/11/25 08:52
 * @description 809. 情感丰富的文字
 **/
public class One1125 {
    public static void main(String[] args) {
        expressiveWords("heeellooo", new String[]{"hello", "hi", "helo"});
    }
    public static int expressiveWords(String s, String[] words) {
        int ans = 0;
        int[] hash = new int[26];
        for (char c : s.toCharArray()) {
            hash[c - 'a']++ ;
        }
        for (String str : words){
            int[] hashTemp = new int[26];
            for (char c : str.toCharArray()) {
                hashTemp[c - 'a']++ ;
            }
            final boolean status = checkArray(hash, hashTemp);
            ans += status ? 1 : 0;
        }
        return ans;
    }
    public static boolean checkArray(int[] hash, int[] hashTemp){
        int len = hash.length;
        for (int i = 0; i < len; i++) {
            if((hash[i] != hashTemp[i] && (hash[i] < 3 || hashTemp[i] == 0)) || hashTemp[i] > hash[i]){
                return false;
            }
        }
        return true;
    }

}

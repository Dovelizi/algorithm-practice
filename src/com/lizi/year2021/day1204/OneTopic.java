package com.lizi.year2021.day1204;

/**
 * @author lizi
 * @description TODO
 * @date 2021/12/4 17:09
 **/
public class OneTopic {
    public static void main(String[] args) {
        canConstruct("ab","bbbbab");
    }
    public static boolean canConstruct(String ransomNote, String magazine) {
        int matchLen = ransomNote.length();
        int parttenLen = magazine.length();
        int pre = 0;
        int next = matchLen;
        for(int i = 0; i <= parttenLen - matchLen; i++){
            pre = i;
            if(ransomNote.charAt(0) == magazine.charAt(pre)){
                while(pre < (pre+matchLen)){
                    if(magazine.charAt(pre) != ransomNote.charAt(pre - i)){
                        break;
                    }
                    if(pre == (i + matchLen - 1)){
                        return true;
                    }
                    pre++ ;
                }
            }
        }
        return false;
    }
}

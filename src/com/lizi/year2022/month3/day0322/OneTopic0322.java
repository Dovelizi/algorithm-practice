package com.lizi.year2022.month3.day0322;

/**
 * @author lizi
 * @description TODO
 * @date 2022/3/22 17:51
 **/
public class OneTopic0322 {
    public static void main(String[] args) {
        winnerOfGame("AAAABBBB");
    }
    public static boolean winnerOfGame(String colors) {
        int len = colors.length();
        if(len < 3){
            return false;
        }
        int continuityA = 0;
        int continuityB = 0;
        int idx = 0;
        // AAAABBBBBABABAAAABBBBB
        for (int i = 0; i < len - 2; i++) {
            String str = colors.substring(i, i + 3);
            if(!str.contains("A")){
                continuityB++ ;
            }
            if(!str.contains("B")){
                continuityA++ ;
            }
        }
        return continuityA > continuityB;
    }
}

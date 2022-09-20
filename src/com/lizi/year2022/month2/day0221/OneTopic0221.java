package com.lizi.year2022.month2.day0221;

/**
 * @author lizi
 * @description TODO
 * @date 2022/2/21 09:23
 **/
public class OneTopic0221 {
    public static void main(String[] args) {
        transStr("...L.L.L.L");
        //pushDominoes(".L.R...LR..L........RLLLL....RLRLRLRL....LLLLL...RRRRRRR.R.R.R.L.L.R.R.....R");
    }
    public static String pushDominoes(String dominoes) {
        char[] charArray = dominoes.toCharArray();
        int len = charArray.length;
        int pre = 0, next = 0;
        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < len; i++){
            if(charArray[i] == 'L' || i == len - 1){
                sb.append(transStr(dominoes.substring(pre, next + 1)));
                pre = next + 1;
            }
            next++ ;
        }
        return sb.toString();
    }

    public static String transStr(String str){
        if(!str.contains(".")){
            return str;
        }
        int lL = -1, lR = -1;
        int fL = -1, fR = -1;
        int len = str.length();
        char[] ch = new char[str.length()];
        for(int i = 0; i < ch.length; i++){
            ch[i] = '.';
        }
        boolean flag = false;
        for (int i = 0; i < len; i++) {
            char c = str.charAt(i);
            if(c == 'R' && fR == -1){
                fR = i;
            }
            if(c == 'L' && fL == -1){
                fL = i;
            }
        }
        for (int i = len - 1; i >= 0; i--) {
            char c = str.charAt(i);
            if(c == 'R' && lR == -1){
                lR = i;
            }
            if(c == 'L' && lL == -1){
                lL = i;
            }
        }

        if(str.contains("L") && str.contains("R")){
            for(int i = fR; i <= lR; i++){
                ch[i] = 'R';
            }
            for(int i = fL; i <= lL; i++){
                ch[i] = 'L';
            }
            while(lR < fL){
                ch[lR] = 'R';
                ch[fL] = 'L';
                lR++ ;
                fL-- ;
                if(lR == fL){
                    ch[lR] = '.';
                }
            }
        }else if(str.contains("L") && !str.contains("R")){
            for(int i = 0; i <= lL; i++){
                ch[i] = 'L';
            }
        }else if(!str.contains("L") && str.contains("R")){
            for(int i = fR; i < str.length(); i++){
               ch[i] = 'R';
            }
        }
        return String.valueOf(ch);
    }
}

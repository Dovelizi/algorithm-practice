package com.lizi.year2022.month5.day0513;

/**
 * @author lizi
 * @description TODO
 * @date 2022/5/13 15:54
 **/
public class OneTopic0513 {
    public static void main(String[] args) {
        oneEditAway("a", "ab");
    }
    public static boolean oneEditAway(String first, String second) {
        if (first.equals(second)) {
            return true;
        }
        int len1 = first.length();
        int len2 = second.length();
        StringBuilder sb  = new StringBuilder();
        if(len1 == len2){
            int count = 0;
            for (int i = 0; i < len1; i++) {
                if(first.charAt(i) != second.charAt(i)){
                    count++ ;
                }
            }
            if(count <= 1){
                return true;
            }else{
                return false;
            }
        }else if(Math.abs(len1 - len2) == 1){
            int idx = 0;
            if(len1 > len2){
                for(int i = 0; i < len2; i++){
                    sb.append(first.charAt(i));
                    if(i == len2 - 1 || first.charAt(i) != second.charAt(i)){
                        idx = i;
                        break;
                    }
                }
                if(idx == 0){
                    sb.append(second, idx, len1);
                }else if(idx < len2 - 1){
                    sb.append(second, idx, len2);
                }else{
                    sb.append(first, idx, len2);
                }
                if(sb.toString().equals(first)){
                    return true;
                }
            }else{
                for(int i = 0; i < len1; i++){
                    sb.append(second.charAt(i));
                    if(i == len1 - 1 || first.charAt(i) != second.charAt(i)){
                        idx = i;
                        break;
                    }
                }
                if(idx == 0){
                    sb.append(first, idx, len1);
                }else if(idx < len1 - 1){
                    sb.append(first, idx, len1);
                }else{
                    sb.append(second, idx, len2);
                }
                if(sb.toString().equals(second)){
                    return true;
                }
            }
        }
        return false;
    }
}

package com.lizi.year2022.month1.day0105;

/**
 * @author lizi
 * @description TODO
 * @date 2022/1/5 09:18
 **/
public class OneTopic {
    public static void main(String[] args) {
        //modifyString("?gv");
        int i = 1;
        StringBuilder sb = new StringBuilder();

        sb.delete(0,sb.length());
    }
    public static String modifyString(String s) {
        if(s.contains("?")){
            return s;
        }
        int flag = 97;
        int len = s.length();
        StringBuilder sb = new StringBuilder();
        for(int i = 0; i < len; i++){
            if(s.charAt(i) == '?'){
                flag = 97;
                if(i == 0 && (i + 1) < len){
                    if(s.charAt(i+1) != (char)flag){
                        sb.append((char)flag);
                    }else{
                        flag++ ;
                    }
                }else if(i > 0 && (i+1) == len){
                    if(s.charAt(i-1) != (char)flag){
                        sb.append((char)flag);
                    }else{
                        flag++ ;
                    }
                }else{
                    if(s.charAt(i-1) != (char)flag && s.charAt(i-1) != (char)flag){
                        sb.append((char)flag);
                    }else{
                        flag++ ;
                    }
                }
            }else{
                sb.append(s.charAt(i));
            }

        }
        return sb.toString();
    }
}

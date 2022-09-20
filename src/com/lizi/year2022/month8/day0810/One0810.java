package com.lizi.year2022.month8.day0810;

import java.util.LinkedList;
import java.util.Queue;

/**
 * @author lizi
 * @description TODO
 * @date 2022/8/10 09:19
 **/
public class One0810 {
    public static void main(String[] args) {
        solveEquation("2x+3x-6x=x+2");
    }
    public static String solveEquation(String equation) {
        String ans = "Infinite solutions";
        String[] equations = equation.split("=");
        String left = equations[0].charAt(0) == '-' ? equations[0] : "+" + equations[0];
        String right = equations[1].charAt(0) == '-' ? equations[1] : "+" + equations[1];
        int flag = 0;
        int cum = 0;
        Queue<Character> queue = new LinkedList<>();
        // 等于左边
        for(int i = 0; i < left.length(); i++){
           if(left.charAt(i) == '+' || left.charAt(i) == '-'){
               queue.add(left.charAt(i));
           }
        }
        String[] leftSplit = left.replaceAll("\\+", ",").replaceAll("-", ",").split(",");
        for(String str : leftSplit){
            if("".equals(str)){
                continue;
            }
            int tempX = str.length() > 1 ? Integer.parseInt(str.substring(0,str.length() - 1)) : 1;
            if(queue.poll() == '+'){
                if(str.contains("x")){
                    flag += tempX;
                }else{
                    cum -= Integer.parseInt(str);
                }
            }else {
                if(str.contains("x")){
                    flag -= tempX;
                }else{
                    cum += Integer.parseInt(str);
                }
            }
        }
        // 等于右边
        for(int i = 0; i < right.length(); i++){
            if(right.charAt(i) == '+' || right.charAt(i) == '-'){
                queue.add(right.charAt(i));
            }
        }
        String[] rightSplit = right.replaceAll("\\+", ",").replaceAll("-", ",").split(",");
        for(String str : rightSplit){
            if("".equals(str)){
                continue;
            }
            int tempX = str.length() > 1 ? Integer.parseInt(str.substring(0,str.length() - 1)) : 1;
            if(queue.poll() == '+'){
                if(str.contains("x")){
                    flag -= tempX;
                }else{
                    cum += Integer.parseInt(str);
                }
            }else {
                if(str.contains("x")){
                    flag += tempX;
                }else{
                    cum -= Integer.parseInt(str);
                }
            }
        }
        if(flag == 0){
            if(cum == 0){
                return ans;
            }else{
                return "No solution";
            }
        }else if(cum % flag != 0){
            ans = "x=0";
        }else {
            ans = "x=" + cum / flag + "";
        }
        return ans;
    }
}

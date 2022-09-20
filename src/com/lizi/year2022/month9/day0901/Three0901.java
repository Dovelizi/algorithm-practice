package com.lizi.year2022.month9.day0901;

import java.util.LinkedList;
import java.util.Queue;
import java.util.Stack;

/**
 * @author lizi
 * @date 2022/9/1 11:24
 * @description TODO
 **/
public class Three0901 {
    public static void main(String[] args) {
        //calcStr("-9-8+4+8-1+3");
        calculate("(5-(1+(5)))");
    }
    public static int calculate(String s) {
        s = s.replaceAll(" ", "");
        StringBuilder stringBuilder = new StringBuilder(s);
        Stack<Integer> stackLeft = new Stack<>();
        for (int i = 0; i < stringBuilder.length(); i++) {
            if(stringBuilder.charAt(i) == '('){
                stackLeft.add(i);
            }
            if(stringBuilder.charAt(i) == ')'){
                int start = stackLeft.pop();
                String str = stringBuilder.substring(start + 1,i);
                int sum = calcStr(str);
                stringBuilder = stringBuilder.replace(start,i + 1, String.valueOf(sum));
                i = -1;
                stackLeft.clear();
            }

        }
        return calcStr(stringBuilder.toString());
    }
    public static int calcStr(String str){
        str = str.replaceAll("--" ,"+")
                .replace("-+", "-")
                .replaceAll("\\+-", "-")
                .replaceAll("\\++", "+");
        int sum = 0;
        Queue<Character> queue = new LinkedList<>();
        for(char c : str.toCharArray()){
            if(c == '+' || c == '-'){
                queue.add(c);
            }
        }
        String[] split = str.replaceAll("\\+", ",").replaceAll("-", ",").split(",");
        sum = split[0].equals("") ? 0 : Integer.parseInt(split[0]);
        for (int i = 1; i < split.length; i++) {
            Character symbol = queue.poll();
            if(symbol == '+'){
                sum += Integer.parseInt(split[i]);
            }else {
                sum -= Integer.parseInt(split[i]);
            }
        }
        return sum;
    }
}

package com.lizi.year2022.month3.day0326;

import java.util.ArrayList;
import java.util.List;
import java.util.Objects;
import java.util.Stack;

/**
 * @author lizi
 * @description TODO
 * @date 2022/3/26 17:36
 **/
public class OneTopic0326 {
    public static void main(String[] args) {
        calPoints(new String[]{"5","-2","4","C","D","9","+","+"});
        Stack<Integer> set = new Stack<>();

    }
    public static int calPoints(String[] ops) {
        List<Integer> res = new ArrayList<>();
        for(String op : ops){
            if(Objects.equals(op, "C")){
                res.remove(res.size() - 1);
            }else if(Objects.equals(op, "D")){
                res.add(res.get(res.size() - 1) * 2);
            }else if(Objects.equals(op, "+")){
                res.add(res.get(res.size() - 1) + res.get(res.size() - 2));
            }else{
                res.add(Integer.parseInt(op));
            }
        }
        return res.stream().mapToInt(Integer::intValue).sum();
    }
}

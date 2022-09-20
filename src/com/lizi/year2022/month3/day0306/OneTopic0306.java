package com.lizi.year2022.month3.day0306;

import java.util.ArrayList;
import java.util.List;

/**
 * @author lizi
 * @description TODO
 * @date 2022/3/6 10:23
 **/
public class OneTopic0306 {
    public static void main(String[] args) {
        System.out.println("dd");
        cellsInRange("A1:F1");
    }
    public static List<String> cellsInRange(String s) {
        List<String> resList = new ArrayList<>();
        String[] excel = s.split(":");
        int charA = excel[0].charAt(0);
        int a = Integer.parseInt(String.valueOf(excel[0].charAt(1)));
        int charB = excel[1].charAt(0);
        int b = Integer.parseInt(String.valueOf(excel[1].charAt(1)));
        for(int i = charA; i <= charB; i++){
            for(int j = a; j <= b; j++){
                String str = (char) i + String.valueOf(j);
                resList.add(str);
            }
        }
        return resList;
    }
}

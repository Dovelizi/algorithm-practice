package com.lizi.year2022.month12.day1204;

import java.util.Objects;

/**
 * @author lizi
 * @date 2022/12/4 10:28
 * @description TODO
 **/
public class One1204 {
    public boolean isCircularSentence(String sentence) {
        int len = sentence.length();
        boolean condition = Objects.equals(sentence.charAt(0), sentence.charAt(len - 1));
        boolean conditionTwo = true;
        final String[] split = sentence.split(" ");
        for (int i = 1; i < split.length; i++) {
            String pre = split[i - 1];
            String next = split[i];
            if(pre.charAt(pre.length() - 1) != next.charAt(0)){
                conditionTwo = false;
            }
        }
        return condition && conditionTwo;
    }
}

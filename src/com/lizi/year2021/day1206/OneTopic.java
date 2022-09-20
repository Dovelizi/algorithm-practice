package com.lizi.year2021.day1206;

/**
 * @author lizi
 * @description TODO
 * @date 2021/12/6 00:16
 **/
public class OneTopic {
    public String truncateSentence(String s, int k) {
        StringBuilder stringBuilder = new StringBuilder();
        String[] str = s.split(" ");
        for (int i = 0; i < k; i++) {
            stringBuilder.append(str[i]);
        }
        return stringBuilder.toString();
    }
}

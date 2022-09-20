package com.lizi.year2021.day1201;

/**
 * @author lizi
 * @description TODO
 * @date 2021/12/1 10:53
 **/
public class TwoTopic {
    public static void main(String[] args) {
        System.out.println("ddd");
        String str = "ddd";
       str.replace("d","%20");
    }
    public String replaceSpace(String s) {
        StringBuilder stringBuilder = new StringBuilder();
        for (int i = 0; i < s.length(); i++) {
            if (s.charAt(i) == ' ') {
                stringBuilder.append("%20");
            }else {
                stringBuilder.append(s.charAt(i));
            }
        }
        return stringBuilder.toString();
    }
}

package com.lizi.year2022.month8.day0803;

import java.util.Random;

/**
 * @author lizi
 * @description TODO
 * @date 2022/8/3 20:03
 **/
public class Three0803 {
    public static void main(String[] args) {
        System.out.println(randomString(-229985452) + " " + randomString(-147909649));
    }

    public static String randomString(int i) {
        Random ran = new Random(i);
        StringBuilder sb = new StringBuilder();
        while (true) {
            int k = ran.nextInt(27);
            if (k == 0){
                break;
            }

            sb.append((char) ('`' + k));
        }
        return sb.toString();
    }
}

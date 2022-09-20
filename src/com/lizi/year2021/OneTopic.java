package com.lizi.year2021;

import javax.xml.datatype.Duration;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.time.temporal.ChronoUnit;
import java.time.temporal.Temporal;
import java.util.Date;

/**
 * @description 每日 leetcode 第一题
 * @author lizi
 * @date 2021/11/24 09:08
 **/
public class OneTopic {
    public static void main(String[] args) {
        DateTimeFormatter df = DateTimeFormatter.ofPattern("yyyy-MM-dd HH:mm:ss");
        LocalDateTime timeBegin = LocalDateTime.parse("2021-11-24 09:30:00",df);
        LocalDateTime timeEnd = LocalDateTime.parse("2021-11-24 10:45:00",df);
        System.out.println(getTimeCalc(timeBegin, timeEnd, ChronoUnit.MINUTES));


        String str = new String(new char[]{'d','o','v','e'},1,2);
        System.out.println(str);
        //String[]

    }
    public static long getTimeCalc(Temporal a, Temporal b, ChronoUnit unit){
        return unit.between(a,b);
    }
}

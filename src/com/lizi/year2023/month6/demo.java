package com.lizi.year2023.month6;

import java.util.Comparator;
import java.util.List;
import java.util.Stack;
import java.util.stream.Collectors;
import java.util.stream.Stream;

/**
 * @author lizi
 * @since 2023-06-21
 **/
public class demo {


    public static void main(String[] args) {
        TimeTest t1 = new TimeTest(1, "09:06");
        TimeTest t2 = new TimeTest(6, "10:00");
        TimeTest t3 = new TimeTest(3, "09:00");
        TimeTest t4 = new TimeTest(4, "09:00");
        TimeTest t5 = new TimeTest(5, "10:10");
        TimeTest t6 = new TimeTest(2, "10:10");
        List<TimeTest> collect = Stream.of(t1, t2, t3, t4, t5, t6).collect(Collectors.toList());

        collect.stream().sorted(Comparator.comparingInt(TimeTest::getId).reversed()).collect(Collectors.toList());
        Stack<Integer> stackOne = new Stack<>();

        int[] binarySearch = new int[]{1,2,3,6,9,10,19,28,39};
        System.out.println("");
    }
}
class TimeTest{
    Integer id;
    String time;

    public TimeTest(Integer id, String time) {
        this.id = id;
        this.time = time;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getTime() {
        return time;
    }

    public void setTime(String time) {
        this.time = time;
    }
}

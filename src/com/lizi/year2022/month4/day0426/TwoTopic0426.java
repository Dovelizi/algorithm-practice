package com.lizi.year2022.month4.day0426;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

/**
 * @author lizi
 * @description TODO
 * @date 2022/4/26 14:28
 **/
public class TwoTopic0426 {
    public static void main(String[] args) {
        People p1 = new People("n1", 1);
        People p2 = new People("n2", 1);
        People p3 = new People("n2", 2);
        List<People> list = new ArrayList<>();
        list.add(p1);
        list.add(p2);
        list.add(p3);
        list.stream().map(People::getAge).collect(Collectors.toList()).stream().distinct().collect(Collectors.toList());
    }
}
class People{
    String name;
    int age;

    public People(String name, int age) {
        this.name = name;
        this.age = age;
    }

    public String getName() {
        return name;
    }

    public int getAge() {
        return age;
    }
}

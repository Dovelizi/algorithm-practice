package com.lizi.test;

import java.util.Arrays;
import java.util.Comparator;
import java.util.List;
import java.util.Objects;
import java.util.stream.Collectors;

/**
 * @author lizi
 * @description TODO
 * @date 2022/5/26 17:06
 **/
public class MathDemo {
    public static void main(String[] args) {


        Student s1 = new Student("1", "--");
        Student s2 = new Student("21", "2");
        Student s3 = new Student("--", "4");
        Student s4 = new Student("3", "--");
        Student s5 = new Student("--", "10");
        Student s6 = new Student("14", "2");
        Student s7 = new Student("5", "--");
        Student s8 = new Student("--", "15");
        Student s9 = new Student("--", "5");
        Student s10 = new Student("--", "--");
        Student s11 = new Student("--", "--");
        Student s12 = new Student("--", "--");
        Student s13 = new Student("--", "--");
        Student s14 = new Student("--", "--");
        Student s15 = new Student("--", "--");
        Student s16 = new Student("--", "--");
        Student s17 = new Student("--", "--");

        List<Student> list = Arrays.asList(s1, s2, s3, s4, s5, s6, s7, s8, s9, s10, s11, s12, s13, s14, s15, s16, s17);

        list.sort((o1, o2) ->{
            int num1 = Objects.equals("--", o1.getAge()) ? Integer.MAX_VALUE : Integer.parseInt(o1.getAge());
            int num2 = Objects.equals("--", o2.getAge()) ? Integer.MAX_VALUE : Integer.parseInt(o2.getAge());
            return Integer.compare(num1, num2);

        });
        list.stream().sorted(Comparator.comparing(Student::getAge)).collect(Collectors.toList());
        System.out.println("dddddd");
    }

    public static void printOne(int n){
        for (int i = 0; i < n; i++) {
            System.out.print(i + 1);
        }
    }

    public static void printTwo(int n){
        if(n > 0){
            printTwo(n - 1);
            System.out.print(n);
        }
    }
}
class Student{
    public String age;
    public String old;

    public Student(String age, String old) {
        this.age = age;
        this.old = old;
    }

    public String getAge() {
        return age;
    }

    public void setAge(String age) {
        this.age = age;
    }

    public String getOld() {
        return old;
    }

    public void setOld(String old) {
        this.old = old;
    }
}

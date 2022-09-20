package com.lizi.year2022.month7.day0719;

import java.util.TreeSet;

/**
 * @author lizi
 * @description TODO
 * @date 2022/7/19 09:04
 **/
public class OneTopic0719 {
    TreeSet<int[]> calendars1;
    TreeSet<int[]> calendars2;
    public OneTopic0719() {
        calendars1 = new TreeSet<>((a, b) -> {
            if(a[1] <= b[0])
                return -1;
            else if(a[0] >= b[1])
                return 1;
            else
                return 0;
        });
        calendars2 = new TreeSet<>((a, b) -> {
            if(a[1] <= b[0])
                return -1;
            else if(a[0] >= b[1])
                return 1;
            else
                return 0;
        });
    }

    public boolean book(int start, int end) {

        int[] arr = new int[]{start, end};
        if(calendars1.contains(arr) && calendars2.contains(arr)){
            return false;
        }
        if(calendars1.contains(arr) || calendars2.isEmpty()){
          return  calendars2.add(arr);

        }
        if(calendars2.contains(arr) || calendars1.isEmpty()){
          return  calendars1.add(arr);
        }
        return calendars1.size() < calendars2.size() ? calendars1.add(arr) : calendars2.add(arr);
    }

    public static void main(String[] args) {
        OneTopic0719 test = new OneTopic0719();
        test.book(10, 20);
        test.book(50, 60);
        test.book(10, 40);
        test.book(5, 15);
        test.book(5, 10);
        test.book(25, 55);
    }
}

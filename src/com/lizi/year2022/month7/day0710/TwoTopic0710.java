package com.lizi.year2022.month7.day0710;

import java.util.ArrayList;
import java.util.List;
import java.util.Objects;

/**
 * @author lizi
 * @description TODO
 * @date 2022/7/10 10:25
 **/
public class TwoTopic0710 {
    static List<Integer> list = new ArrayList<>();
    static int minNum = 1;

    public static void main(String[] args) {
        addBack(2);
        popSmallest();
        popSmallest();
        popSmallest();
        addBack(1);
        popSmallest();
        popSmallest();
        popSmallest();
    }
    public TwoTopic0710() {

    }

    public static int popSmallest() {
       while(list.contains(minNum)){
           minNum++ ;
       }
       int rem = minNum ;
       list.add(rem);
       minNum++ ;
       return rem;
    }

    public static void addBack(int num) {
        list.removeIf(o -> Objects.equals(o, num));
        minNum = Math.min(minNum, num);
    }
}

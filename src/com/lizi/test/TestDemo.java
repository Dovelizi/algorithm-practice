package com.lizi.test;

import java.util.*;
import java.util.stream.Collectors;

/**
 * @author lizi
 * @description TODO
 * @date 2022/2/14 16:49
 **/
public class TestDemo {
    public static void main(String[] args) {
        Map<Integer, String> map = new HashMap<>(64);
        U u1 = new U(0,1,2);
        U u2 = new U(0,1,2);
        U u3 = new U(2,2,26);
        U u4 = new U(2,2,22);
        U u5 = new U(2,2,22);
        U u6 = new U(2,4,22);
        U u7 = new U(0,5,22);
        U u8 = new U(0,17,12);
        U u9 = new U(0,17,12);

        List<U> list = new ArrayList<>();
        list.add(u1);
        list.add(u2);
        list.add(u3);
        list.add(u4);
        list.add(u5);
        list.add(u6);
        list.add(u7);
        list.add(u8);
        list.add(u9);
        list.stream().sorted(Comparator.comparing(U::getRank3))
                .sorted(Comparator.comparing(U::getRank2))
                .sorted(Comparator.comparing(U::getRank1)).collect(Collectors.toList());
    }
}
class U{
    private int rank1;
    private int rank2;
    private int rank3;

    public U(int rank1, int rank2, int rank3){
        this.rank1 = rank1;
        this.rank2 = rank2;
        this.rank3 = rank3;
    }
    public int getRank1() {
        return rank1;
    }

    public void setRank1(int rank1) {
        this.rank1 = rank1;
    }

    public int getRank2() {
        return rank2;
    }

    public void setRank2(int rank2) {
        this.rank2 = rank2;
    }

    public int getRank3() {
        return rank3;
    }

    public void setRank3(int rank3) {
        this.rank3 = rank3;
    }
}
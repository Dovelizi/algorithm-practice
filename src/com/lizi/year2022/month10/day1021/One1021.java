package com.lizi.year2022.month10.day1021;

import java.util.TreeMap;

/**
 * @author lizi
 * @date 2022/10/21 09:05
 * @description 901. 股票价格跨度
 **/
public class One1021 {
    TreeMap<Integer, Integer> map = new TreeMap<>((o1, o2) -> o1 - o2);
    public One1021() {

    }

    public int next(int price) {
        map.floorKey(price);
        return 0;
    }
}

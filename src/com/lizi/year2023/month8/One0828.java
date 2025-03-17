package com.lizi.year2023.month8;

import java.util.LinkedHashMap;
import java.util.Map;

/**
 * @author lizi
 * @since 2023-08-28
 **/
public class One0828 extends LinkedHashMap<Integer, Integer> {
    private int cap;

    public One0828(int cap){
        super(cap, 0.75f, true);
        this.cap = cap;
    }

    public int getCap(int key){
        return super.getOrDefault(key, -1);
    }

    public void putCap(int key, int value){
        super.put(key, value);
    }

    @Override
    protected boolean removeEldestEntry(Map.Entry<Integer, Integer> entry){
        return super.size() > cap;
    }


}

package com.lizi.year2021.day1219;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * @author lizi
 * @description TODO
 * @date 2021/12/19 18:04
 **/
public class FiveTopic {
    public int findJudge(int n, int[][] trust) {
        int judder = -1;
        List<Integer> listTrust = new ArrayList<>();
        Map<Integer,Integer> mapTrusted = new HashMap<>();
        if(trust.length == 1){
            return trust[0][1];
        }
        for(int i = 0; i < trust.length; i++){
            listTrust.add(trust[i][0]);
            int num = mapTrusted.get(trust[i][1]) == null ? 0 : mapTrusted.get(trust[i][1]);
            mapTrusted.put(trust[i][1], num + 1);
        }
        for(Map.Entry<Integer,Integer> map : mapTrusted.entrySet()){
            if(map.getValue() == (n-1) && !listTrust.contains(map.getKey())){
                judder = map.getKey();
            }
        }
        return judder;
    }
}

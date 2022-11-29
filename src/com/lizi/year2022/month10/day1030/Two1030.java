package com.lizi.year2022.month10.day1030;

import javafx.util.Pair;

import java.util.*;

/**
 * @author lizi
 * @date 2022/10/30 10:20
 * @description 6221. 最流行的视频创作者
 **/
public class Two1030 {
    public static void main(String[] args) {
        String[] creators = {"a","a","a","a"};
        String[] ids = {"a","a","a","a"};
        int[] views = {1000,1000,1000,1000};
        mostPopularCreator(creators, ids, views);
    }
    public static List<List<String>> mostPopularCreator(String[] creators, String[] ids, int[] views) {
        List<List<String>> ans = new ArrayList<>();
        Map<String, List<Pair<Integer, String>>> userMap = new HashMap<>();
        Map<String, Integer> userView = new TreeMap<>();
        int len = creators.length;
        int maxV = Integer.MIN_VALUE;
        for (int i = 0; i < len; i++) {
            String userName = creators[i];
            Integer viewOrDefault = userView.getOrDefault(userName, 0)+ views[i];
            maxV = Math.max(maxV, viewOrDefault);
            userView.put(creators[i], viewOrDefault);
            // top2
            List<Pair<Integer, String>> list = userMap.getOrDefault(userName, new ArrayList<>());
            list.add(new Pair<>(views[i], ids[i]));
            userMap.put(userName, list);
        }



        for (Map.Entry<String, Integer> entry : userView.entrySet()){
            if(entry.getValue() == maxV){
                List<String> temp = new ArrayList<>();
                temp.add(entry.getKey());
                List<Pair<Integer, String>> pairs = userMap.get(entry.getKey());
                Collections.sort(pairs, (o1, o2) -> o1.getKey() == o2.getKey() ?
                        o1.getValue().compareTo(o2.getValue()) : o2.getKey() - o1.getKey());
                temp.add(pairs.get(0).getValue());
                ans.add(temp);
            }
        }
        if(ans.isEmpty()){
            List<String> temp = new ArrayList<>();
            temp.add(creators[0]);
            temp.add(ids[0]);
            ans.add(temp);
        }
        return ans;
    }
}

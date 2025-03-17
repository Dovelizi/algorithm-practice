package com.lizi.year2023.month2.day07;

import java.util.*;

/**
 * @author lizi
 * @date 2023/2/7 09:05
 * @description 1604. 警告一小时内使用相同员工卡大于等于三次的人
 **/
public class One0207 {
    public List<String> alertNames(String[] keyName, String[] keyTime) {
        List<String> ans = new ArrayList<>();
        Map<String, List<Integer>> map = new HashMap<>();
        int len = keyName.length;
        for(int i = 0; i < len; i++){
            List<Integer> list = map.getOrDefault(keyName[i], new ArrayList<>());
            list.add(Integer.parseInt(keyTime[i].split(":")[0]) * 60 + Integer.parseInt(keyTime[i].split(":")[1]));
            map.put(keyName[i] ,list);
        }

        Set<String> set = map.keySet();
        for(Map.Entry<String, List<Integer>> entry : map.entrySet()){
            List<Integer> list = entry.getValue();
            if(list.size() >= 3){
                Collections.sort(list);
                for (int i = 0; i < list.size() - 2; i ++){
                    if(list.get(i + 2) - list.get(i) <= 60){
                        ans.add(entry.getKey());
                        break;
                    }
                }
            }
        }
        Collections.sort(ans);
        return ans;
    }
}

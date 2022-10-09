package com.lizi.year2022.month10.day1005;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * @author lizi
 * @date 2022/10/5 15:14
 * @description 811. 子域名访问计数
 **/
public class One1005 {
    public static void main(String[] args) {
        subdomainVisits(new String[]{"900 google.mail.com", "50 yahoo.com", "1 intel.mail.com", "5 wiki.org"});
    }
    public static List<String> subdomainVisits(String[] cpdomains) {
        List<String> ans = new ArrayList<>();
        Map<String, Integer> map = new HashMap<>();
        for (String str : cpdomains){
            String[] split = str.replace(" ", ".").split("\\.");
            StringBuilder cpStr = new StringBuilder();
            for (int i = split.length - 1; i > 0; i--) {
                if(i != split.length - 1){
                    cpStr.insert(0, ".");
                }
                cpStr.insert(0, split[i]);
                map.put(cpStr.toString(), map.getOrDefault(cpStr.toString(), 0) + Integer.parseInt(split[0]));
            }
        }
        for (Map.Entry<String, Integer> entry : map.entrySet()){
            ans.add(entry.getValue() + " " + entry.getKey());
        }
        return ans;
    }
}

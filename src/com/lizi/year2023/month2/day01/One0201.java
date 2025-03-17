package com.lizi.year2023.month2.day01;

import java.util.*;

/**
 * @author lizi
 * @date 2023/2/1 08:57
 * @description 2325. 解密消息
 **/
public class One0201 {
    public static void main(String[] args) {
        decodeMessage("the quick brown fox jumps over the lazy dog", "vkbs bs t suepuv");
    }
    public static String decodeMessage(String key, String message) {
        StringBuilder ans = new StringBuilder();
        String str = key.replaceAll(" ", "");
        int len = str.length();
        int idx = 0;
        char[] ch = str.toCharArray();
        Map<Character, Character> map = new HashMap<>();
        for(int i = 0; i < len; i++){
           if(!map.containsKey(ch[i])){
               map.put(ch[i], (char)('a' + idx));
               idx++ ;
               PriorityQueue<Integer> queue = new PriorityQueue<>(Comparator.comparingInt(o -> o));

           }
        }
        for(int i = 0; i < message.length(); i++){
            char c = message.charAt(i);
            if(c == ' '){
                ans.append(c);
            }else{
                ans.append(map.get(c));
            }
        }
        System.out.println(map.get('y'));
        return ans.toString();
    }
    public String[] getFolderNames(String[] names) {
        Map<String, Integer> map = new HashMap<>();
        for(int i = 0; i < names.length; i++){
            String[] arr = names[i].split("\\(");
            int num = 0;
            if(arr.length > 1){
                int mapCount = map.getOrDefault(arr[0], 0);
                num = Math.max(Integer.parseInt(arr[1].replace(")", "")), mapCount) + 1;
            }
            map.put(arr[0], num);
            String ret = num > 1 ? arr[0] : arr[0] + "(" + num + ")";
            names[i] = ret;
        }

        return names;
    }
}

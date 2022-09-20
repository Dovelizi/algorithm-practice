package com.lizi.year2022.month4.day04010;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;

/**
 * @author lizi
 * @description TODO
 * @date 2022/4/10 10:22
 **/
public class ThreeTopic0410 {

    public int uniqueMorseRepresentations(String[] words) {
        Map<Character, String> map = new HashMap<>(35);
        Set<String> set = new HashSet<>();
        map.put('a',".-");
        map.put('b',"-...");
        map.put('c',"-.-.");
        map.put('d',"-..");
        map.put('e',".");
        map.put('f',"..-.");
        map.put('g',"--.");
        map.put('h',"....");
        map.put('i',"..");
        map.put('j',".---");
        map.put('k',"-.-");
        map.put('l',".-..");
        map.put('m',"--");
        map.put('n',"-.");
        map.put('o',"---");
        map.put('p',".--.");
        map.put('q',"--.-");
        map.put('r',".-.");
        map.put('s',"...");
        map.put('t',"-");
        map.put('u',"..-");
        map.put('v',"...-");
        map.put('w',".--");
        map.put('x',"-..-");
        map.put('y',"-.--");
        map.put('z',"--..");
        for(String str : words){
            StringBuilder temp = new StringBuilder();
            for(char ch : str.toCharArray()){
                temp.append(map.get(ch));
            }
            set.add(temp.toString());
        }
        return set.size();
    }
}

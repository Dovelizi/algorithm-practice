package com.lizi.year2022.month6.day0625;

/**
 * @author lizi
 * @description TODO
 * @date 2022/6/25 22:32
 **/
public class OneTopic0625 {
    public int countAsterisks(String s) {
        int ans = 0;
        String[] split = s.split("\\|");
        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < split.length; i += 2) {
            sb.append(split[i]);
        }
        for (char ch : sb.toString().toCharArray()){
            if(ch == '*'){
                ans++ ;
            }
        }
        return ans;
    }
}

package com.lizi.year2022.month3.day0308;

import java.util.ArrayList;
import java.util.List;

/**
 * @author lizi
 * @description TODO
 * @date 2022/3/8 20:17
 **/
public class OneTopic0308 {
    public static void main(String[] args) {
        platesBetweenCandles("**|**|***|" ,new int[][]{{2,5},{5,9}});
    }
    public static int[] platesBetweenCandles(String s, int[][] queries) {
        int len = queries.length;
        List<Integer> resList = new ArrayList<>();
        int[] resArr = new int[len];
        for (int i = 0; i < len; i++) {
            String str = s.substring(queries[i][0], queries[i][1] + 1);
            int fhLen = str.replace("*","").length();
            int starNum = 0;
            int flagNum = 0;
            for(char c : str.toCharArray()){
                if(c == '|'){
                    flagNum++ ;
                }
                if(flagNum == fhLen){
                    resList.add(starNum);
                    break;
                }
                if(flagNum > 0 && c == '*'){
                    starNum++;
                }
            }
        }
        for (int i = 0; i < resList.size(); i++) {
            if(resList.get(i) != 0){
                resArr[i] = resList.get(i);
            }
        }
        return resArr;
    }
}

package com.lizi.year2021.day1226;

import java.util.ArrayList;
import java.util.List;

/**
 * @author lizi
 * @description TODO
 * @date 2021/12/26 10:46
 **/
public class TwoTopic {
    public static void main(String[] args) {
        executeInstructions(1,new int[]{0,0},"LRUD");
    }
    public static int[] executeInstructions(int n, int[] startPos, String s) {
        int idx = 0;
        List<Integer> list = new ArrayList<>();
        int starRow = startPos[0];
        int starCol = startPos[1];
        while(idx < s.length()){
            int step = 0;
            for(int i = idx; i < s.length(); i++){
                char ch = s.charAt(i);
                if(ch == 'U' && startPos[0] - 1 >= 0){
                    startPos[0] -= 1;
                    step++;
                }else  if(ch == 'D' && startPos[0] + 1 < n){
                    startPos[0] += 1;
                    step++;
                }else if (ch == 'L' && startPos[1] - 1 >= 0){
                    startPos[1] -= 1;
                    step++;
                }else if (ch == 'R' && startPos[1] + 1 < n){
                    startPos[1] += 1;
                    step++;
                }else{
                    list.add(step);
                    break;
                }
                if(i == s.length() - 1){
                    list.add(step);
                }

            }
            startPos[0] = starRow;
            startPos[1] = starCol;
            idx++;
        }
        Math.pow(6,2);
        return list.stream().mapToInt(Integer :: valueOf).toArray();
    }
}

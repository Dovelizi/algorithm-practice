package com.lizi.year2022.month10.day1016;

import java.util.Arrays;

/**
 * @author lizi
 * @date 2022/10/16 10:27
 * @description TODO
 **/
public class Four1016 {
    public boolean possibleBipartition(int n, int[][] dislikes) {
       int[] color = new int[2001];
       int len = dislikes.length;
        Arrays.sort(dislikes, (o1, o2) -> o1[0] == o2[0] ? o1[1] - o2[1] : o1[0] - o2[0] );
        for (int i = 0; i < len; i++) {
            int A = dislikes[i][0];
            int B = dislikes[i][1];
            if(color[A] == 0 && color[B] == 0){
                color[A] = 1;
                color[B] = -1;
            }else if(color[A] != 0 && color[B] == 0){
                color[B] = -color[A];
            }else if(color[A] == 0 && color[B] != 0){
                color[A] = -color[B];
            }else {
                return false;
            }
        }
        return true;
    }
}

package com.lizi.year2022.month1.day0123;

/**
 * @author lizi
 * @description TODO
 * @date 2022/1/23 11:43
 **/
public class FourTopic0123 {
    public int maximumGood(int[][] statements) {
        int len = statements.length;
        int resNum = 0;
        for(int i = 0; i < len; i++){
            for (int j = 0; j < len; j++) {
                if(statements[i][j] == 1){
                    resNum++;
                }
            }
        }
        return Math.max(resNum,0);
    }
}

package com.lizi.year2022.month1.day0116;

/**
 * @author lizi
 * @description TODO
 * @date 2022/1/16 10:51
 **/
public class TwoTopic0116 {
    public static void main(String[] args) {
        minMoves(10,2);
    }
    public static int minMoves(int target, int maxDoubles) {
        if(maxDoubles == 0){
            return target - 1;
        }
        int ans = 0;
        while (maxDoubles > 0 && target != 1){
            if((target&1) != 0){
                target--;
            }else{
                target >>= 1;
                maxDoubles--;
            }
            ans++;
        }
       return target - 1 + ans;
    }
}


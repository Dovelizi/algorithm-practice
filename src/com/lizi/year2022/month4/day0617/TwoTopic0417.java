package com.lizi.year2022.month4.day0617;

import java.util.HashMap;
import java.util.Map;

/**
 * @author lizi
 * @description TODO
 * @date 2022/4/17 10:28
 **/
public class TwoTopic0417 {
    public static void main(String[] args) {
        minimumRounds(new int[]{2,2,3,3,2,4,4,4,4,4});
        //calcCount(7);
    }
    public static int minimumRounds(int[] tasks) {
        int ans = 0;
        Map<Integer, Integer> map = new HashMap<>();
        for(int n : tasks){
            int temp = map.get(n) == null ? 0 : map.get(n);
            map.put(n,temp+1);
        }
        for(Map.Entry<Integer, Integer> entry : map.entrySet()){
            if(calcCount(entry.getValue()) == -1){
                return -1;
            }
            ans += calcCount(entry.getValue());
        }
        return ans;
    }
    public static int calcCount(int n){
        int ans = 0;
        while(n > 4){
            n -= 3;
            ans++ ;
        }
        if(n < 2){
            return ans - 1;
        }
        if(n == 2 || n == 3){
            return ans + 1;
        }
        if(n == 4){
            return ans + 2;
        }
        return ans;
    }

}
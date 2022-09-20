package com.lizi.year2022.month3.day0306;

import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;

/**
 * @author lizi
 * @description TODO
 * @date 2022/3/6 10:23
 **/
public class TwoTopic0306 {
    public static void main(String[] args) {
        minimalKSum(new int[]{114,510,376,537,240,534}, 93696335);
    }
    public static long minimalKSum(int[] nums, int k) {
        Set<Integer> reSameArr = new HashSet<>();
        for (int n : nums) {
            reSameArr.add(n);
        }
        Integer[] dealArr = reSameArr.toArray(new Integer[]{});
        Arrays.sort(dealArr);
        long resNum = 0L;
        int len = dealArr.length;
        int idx = 0;
        long num = 1;
        while(k > 0){
            if(idx == len){
                break;
            }
            if(dealArr[idx] == num){
                idx++ ;
            }else{
                resNum += num;
                k-- ;
            }
            num++;
        }
        if(k > 0){
            for(long i = num; i < (num + k); i++){
                resNum += i;
            }
        }
        return resNum;
    }
}



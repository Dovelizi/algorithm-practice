package com.lizi.year2022.month1.day0124;

import java.util.*;

/**
 * @author lizi
 * @description TODO
 * @date 2022/1/24 09:11
 **/
public class OneTopic0124 {
    public static void main(String[] args) {
        findDisappearedNumbers(new int[]{1,1,1,1,1,1,1,1,1,1});
    }
    public static List<Integer> findDisappearedNumbers(int[] nums) {
        int len = nums.length;
        List<Integer> list = new LinkedList<>();
        int[] arr = new int[len];
        for(int i = 1; i <= len; i++){
            arr[i-1] = i;
        }
        for(int n : nums){
            arr[n - 1] = -1;
        }
        for(int n : arr){
            if(n != -1){
                list.add(n);
            }
        }
        return list;
    }
}

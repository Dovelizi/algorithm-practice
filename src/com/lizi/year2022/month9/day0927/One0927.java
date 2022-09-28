package com.lizi.year2022.month9.day0927;

/**
 * @author lizi
 * @date 2022/9/27 08:55
 * @description 面试题 01.02. 判定是否互为字符重排
 **/
public class One0927 {
    public boolean CheckPermutation(String s1, String s2) {
        int[] arr = new int[128];
        for(char ch : s1.toCharArray()){
            arr[ch]++;
        }
        for(char ch : s2.toCharArray()){
            arr[ch]--;
        }
        for(int n : arr){
            if(n != 0){
                return false;
            }
        }
        return true;
    }
}

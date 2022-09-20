package com.lizi.year2022.month7.day0703;

import java.util.Arrays;

/**
 * @author lizi
 * @description TODO
 * @date 2022/7/3 10:29
 **/
public class TwoTopic0703 {
    public static void main(String[] args) {
        nextGreaterElement(1999999999);
    }
    public static int nextGreaterElement(int n) {
        String str = String.valueOf(n);
        int[] arr = new int[10];
        int ans = -1;
        int max = 0;
        char[] chars = str.toCharArray();
        for(char ch : chars){
            arr[ch - '0']++ ;
        }
        for (int i = arr.length - 1; i >= 0; i--) {
            if(arr[i] > 0){
                max = i;
                break;
            }
        }
        for (int i = 0; i < chars.length; i++) {
            if((chars[i] - '0') == max){
                char temp = chars[0];
                chars[0] = chars[i];
                chars[i] = temp;
                break;
            }
        }
        long maxValue = Math.min(Long.parseLong(String.valueOf(chars)), Integer.MAX_VALUE);

        for(int i = Math.min(n + 1, Integer.MAX_VALUE); i <= maxValue; i++){
            if(i < 0){
                break;
            }
            if(check(Arrays.copyOf(arr, arr.length), i)){
                ans = i;
                break;
            }
        }
        return ans;
    }
    public static boolean check(int[] arr, int n){
        for(char ch : String.valueOf(n).toCharArray()){
            arr[ch - '0']-- ;
        }
        for (int num : arr){
            if(num != 0){
                return false;
            }
        }
        return true;
    }
}

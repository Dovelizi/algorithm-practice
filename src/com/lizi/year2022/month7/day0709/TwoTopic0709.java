package com.lizi.year2022.month7.day0709;

import java.util.Arrays;

/**
 * @author lizi
 * @description TODO
 * @date 2022/7/9 22:17
 **/
public class TwoTopic0709 {
    public static void main(String[] args) {
        minSumSquareDiff(new int[]{7,11,4,19,11,5,6,1,8},new int[]{4,7,6,16,12,9,10,2,10}, 3,6);
    }
    public static long minSumSquareDiff(int[] nums1, int[] nums2, int k1, int k2) {
        int len = nums1.length;
        int[] arr = new int[len];
        long ans = 0L;
        int k = k1 + k2;
        int idx = len - 1;
        for (int i = 0; i < len; i++) {
            arr[i] = Math.abs(nums1[i] - nums2[i]);
        }
        Arrays.sort(arr);
        while (k > 0){
            if(isZero(arr)){
                int remNum = k / len;
                if(remNum > 0){
                    for (int i = 0; i < len; i++){
                        arr[i] = remNum;
                    }
                    k -= (len * remNum);
                }
                int temp = 0;
                while (k > 0){
                    arr[temp++]++ ;
                    k--;
                }
                break;
            }
            if(idx < 0 || arr[idx] == 0){
                idx = len - 1;
            }
            arr[idx]-- ;
            idx-- ;
            k-- ;
        }
        for(int n : arr){
            ans += (long) n * n;
        }
        return ans;
    }
    public static boolean isZero(int[] arr){
        for (int n : arr){
            if(n != 0){
                return false;
            }
        }
        return true;
    }
}

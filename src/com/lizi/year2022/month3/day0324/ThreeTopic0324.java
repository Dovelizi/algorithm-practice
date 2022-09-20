package com.lizi.year2022.month3.day0324;

import java.util.Arrays;

/**
 * @author lizi
 * @description TODO
 * @date 2022/3/24 19:55
 **/
public class ThreeTopic0324 {
    public static void main(String[] args) {
        merge(new int[]{2,0},1, new int[]{1}, 1);
    }
    public static void merge(int[] nums1, int m, int[] nums2, int n) {
        int len = m + n;
        for (int i = 0; i < n; i++) {
            for (int j = len; j > 0; j--) {
                nums1[j] = nums2[i];
            }
        }
        Arrays.sort(nums1);
    }
}

package com.lizi.year2021.day1227;

import java.util.Arrays;

/**
 * @author lizi
 * @description TODO
 * @date 2021/12/27 09:52
 **/
public class OneTopic {
    public static void main(String[] args) {
        numFriendRequests(new int[]{17,19,20,30,99,100,100,45,47,54,23,58,110,120,120});

    }
    public static int numFriendRequests(int[] ages) {
        int n = ages.length;
        Arrays.sort(ages);
        int left = 0, right = 0, ans = 0;
        for (int age : ages) {
            if (age < 15) {
                continue;
            }
            while (ages[left] <= 0.5 * age + 7) {
                left++;
            }
            while (right + 1 < n && ages[right + 1] <= age) {
                right++;
            }
            ans += right - left;
        }
        return ans;
    }
}

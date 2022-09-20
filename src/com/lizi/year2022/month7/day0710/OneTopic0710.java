package com.lizi.year2022.month7.day0710;

import java.util.Arrays;

/**
 * @author lizi
 * @description TODO
 * @date 2022/7/10 10:25
 **/
public class OneTopic0710 {
    public static void main(String[] args) {
        fillCups(new int[]{1,4,2});
    }
    public static int fillCups(int[] amount) {
        int ans = 0;
        while (amount[0] != 0 || amount[1] != 0 || amount[2] != 0) {
            Arrays.sort(amount);
            if (amount[0] == 0 && amount[1] == 0) {
                amount[2]--;
            } else {
                amount[2]--;
                amount[1]--;
            }
            ans++;
        }
        return ans;
    }
}

package com.lizi.year2023.month1.day10;

/**
 * @author lizi
 * @date 2023/1/10 16:45
 * @description 1109. 航班预订统计
 **/
public class One0110 {
    public int[] corpFlightBookings(int[][] bookings, int n) {
        int[] ans = new int[n];
        int[] diff = new int[n];
        for (int[] arr : bookings){
            int start = arr[0] - 1;
            int last = arr[1];
            int seats = arr[2];
            diff[start] += seats;
            if(last < n){
                diff[last] -= seats;
            }
        }
        ans[0] = diff[0];
        for (int i = 1; i < n; i++) {
            ans[i] = ans[i - 1] + diff[i];
        }
        return ans;
    }
}

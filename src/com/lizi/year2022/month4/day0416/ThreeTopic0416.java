package com.lizi.year2022.month4.day0416;

/**
 * @author lizi
 * @description TODO
 * @date 2022/4/16 22:28
 **/
public class ThreeTopic0416 {
    public static void main(String[] args) {
        waysToBuyPensPencils(100, 1, 1);
    }
    public static long waysToBuyPensPencils(int total, int cost1, int cost2) {
        long ans = 0L;
        int count1 = total / cost1;
        for (int i = 0; i <= count1; i++) {
            ans += (total - ((long) i * cost1)) / cost2 + 1;
        }
        return ans == 0 ? 1 : ans;
    }
}

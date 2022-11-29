package com.lizi.year2022.month10.day1015;

import java.util.LinkedList;

/**
 * @author lizi
 * @date 2022/10/15 22:28
 * @description TODO
 **/
public class Two1015 {
    public static void main(String[] args) {
        productQueries(53, new int[][]{{2,3},{0,1},{0,1},{0,1},{0,0},{0,3},{3,3},{2,3},{1,1},{2,3}});
    }
    public static int[] productQueries(int n, int[][] queries) {
        int len = queries.length;
        int[] ans = new int[len];
        int maxM = 0;
        int MOD = (int)1e9 + 7;
        LinkedList<Integer> list = new LinkedList<>();
        while ((1 << (maxM + 1)) <= n){
            maxM++ ;
        }
        while (n > 0){
            int temp = 1 << maxM;
            if(n >= temp){
                n -= temp;
                list.addFirst(maxM);
            }
            maxM-- ;
        }
        for (int i = 0; i < len; i++) {
            long sum = 1;
            for (int j = queries[i][0]; j <= queries[i][1]; j++) {
                sum = sum * ((1L << list.get(j)) % MOD);
                sum %= MOD;
            }
            ans[i] = (int) sum;
        }
        return ans;
    }
}

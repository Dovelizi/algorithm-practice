package com.lizi.year2022.month10.day1002;

/**
 * @author lizi
 * @date 2022/10/2 10:30
 * @description 6192. 公因子的数目
 **/
public class Three1002 {
    public int commonFactors(int a, int b) {
        int ans = 0;
        int max = Math.max(a, b);
        for (int i = 1; i <= max; i++) {
            if(a % i == 0 && b % i == 0){
                ans++ ;
            }
        }
        return ans;
    }
}

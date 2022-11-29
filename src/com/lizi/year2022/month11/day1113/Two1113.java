package com.lizi.year2022.month11.day1113;

/**
 * @author lizi
 * @date 2022/11/13 10:29
 * @description TODO
 **/
public class Two1113 {
    public int subarrayLCM(int[] nums, int k) {
        int ans = 0;
        int len = nums.length;
        for(int i = 0; i < len; i++){
            int minLCM = nums[i];
            for(int j = i; j < len; j++){
                if(k % nums[j] == 0){
                    minLCM = lcm(minLCM, nums[j]);
                    ans += minLCM == k ? 1 : 0;
                }else{
                    break;
                }
            }
        }
        return ans;
    }
    public int lcm(int a, int b){
        int beginA = a, beginB = b;
        int res = 0;
        while(b > 0){
            res = a % b;
            a = b;
            b = res;
        }
        return (beginA * beginB) / a;
    }
}

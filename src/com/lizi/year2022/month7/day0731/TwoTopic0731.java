package com.lizi.year2022.month7.day0731;

/**
 * @author lizi
 * @description TODO
 * @date 2022/7/31 10:30
 **/
public class TwoTopic0731 {
    public static void main(String[] args) {
        maximumGroups(new int[]{1,2,1,1,1,1,1,1,1,1,1,1,1,1});
    }
    public static int maximumGroups(int[] grades) {
        int ans = 0;
        int len = grades.length;
        if(len < 3){
            return 1;
        }
        int start = len % 2 == 0 ? len / 2 : len / 2 + 1;
        for(int i = start; i > 0; i--){
            if((i * (i + 1) / 2) <= len){
                ans = i;
                break;
            }
        }
        return ans;
    }


}

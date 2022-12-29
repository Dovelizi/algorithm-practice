package com.lizi.year2022.month12.day1204;

import java.util.Arrays;

/**
 * @author lizi
 * @date 2022/12/4 10:28
 * @description TODO
 **/
public class Two1204 {
    public long dividePlayers(int[] skill) {
        long ans = 0L;
        Arrays.sort(skill);
        int len = skill.length;
        int equalsNum = skill[0] + skill[len - 1];
        for (int i = 0; i < len / 2; i++) {
            int num1 = skill[i];
            int num2 = skill[len - i - 1];
            if(equalsNum != num1 + num2){
                return -1;
            }
            ans += (long) num1 * num2;
        }
        return ans;
    }
}

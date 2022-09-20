package com.lizi.year2022.month6.day0625;

import java.util.Arrays;
import java.util.stream.Collectors;

/**
 * @author lizi
 * @description TODO
 * @date 2022/6/25 23:20
 **/
public class TwoTopic0625 {
    public static void main(String[] args) {
        maximumXOR(new int[]{32,7,1});
    }
    public static int maximumXOR(int[] nums) {
        String[] str = new String[32];
        String sb;
        Arrays.fill(str,"0");
        for(int num : nums){
            for(int i = 31; i >= 0; i--){
                if(str[32 - i].equals("0")){
                    str[32 - i] = (num >> i & 1) == 1 ? "1" : "0";
                }
            }
        }
        sb = Arrays.stream(str).collect(Collectors.joining());
        return Integer.parseInt(sb,2);
    }
}

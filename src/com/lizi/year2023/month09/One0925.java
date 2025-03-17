package com.lizi.year2023.month09;

import java.util.*;

/**
 * @author lizi
 * @since 2023-10-22
 **/
public class One0925 {
        public List<Integer> splitArray(int[] nums) {
            List<Integer> result = new ArrayList<>();
            for (int num : nums) {
                result.addAll(generateSplit(num));
            }
            return result;
        }

        private List<Integer> generateSplit(int num) {
            List<Integer> split = new ArrayList<>();
            if (num <= 0) {
                return split;
            }
            for (int i = 1; i <= num; i++) {
                split.add(i);
            }
            return split;
        }
    public static void main(String[] args) {
        int[] nums = {1, 5, 7, 9};
        One0925 solution = new One0925();
        List<Integer> result = solution.splitArray(nums);
        System.out.println("拆分后的数组元素个数: " + result.size());
        System.out.println("拆分后的数组: " + result);
        countPoints("B0B6G0R6R0R6G9");
    }

    public static int countPoints(String rings) {
        int ans = 0;
        Set<Character>[] set = new Set[10];
        for(int i = 0; i < 10; i++){
            set[i] = new HashSet<>();
        }
        int len = rings.length();
        for(int i = 0; i < len - 1; i += 2){
            char ch = rings.charAt(i);
            int idx = rings.charAt(i + 1) - '0';
            System.out.println(set[idx]);
            set[idx].add(ch);
        }
        for(int i = 0; i < 10; i++){
            if(set[i].size() == 3){
                ans++ ;
            }
        }
        return ans;
    }
}

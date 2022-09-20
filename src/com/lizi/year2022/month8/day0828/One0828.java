package com.lizi.year2022.month8.day0828;

import java.util.Arrays;

/**
 * @author lizi
 * @description TODO
 * @date 2022/8/28 10:25
 **/
public class One0828 {
    public static void main(String[] args) {
        answerQueries(new int[]{4,5,2,1}, new int[]{3, 10, 21});
    }
    public static int[] answerQueries(int[] nums, int[] queries) {
        Arrays.sort(nums);
        int[] result = new int[queries.length];
        for (int i = 0; i < queries.length; i++) {
            while (result[i] < nums.length && (queries[i] -= nums[result[i]]) >= 0){
                result[i]++;
            }
        }
        return result;
    }
}

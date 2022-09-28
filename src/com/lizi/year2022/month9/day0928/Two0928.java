package com.lizi.year2022.month9.day0928;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.stream.Collectors;

/**
 * @author lizi
 * @date 2022/9/28 09:59
 * @description 46. 全排列（元素交换法）
 **/
public class Two0928 {
    List<List<Integer>> ans = new ArrayList<>();
    public List<List<Integer>> permute(int[] nums) {
        List<Integer> list = Arrays.stream(nums).boxed().collect(Collectors.toList());
        traverse(nums.length, 0, list);
        return ans;
    }

    public void traverse(int size, int step, List<Integer> list){
        if(step == size){
            ans.add(new ArrayList<>(list));
        }
        for(int i = step; i < size; i++){
            Collections.swap(list, step, i);
            traverse(size, step + 1, list);
            Collections.swap(list, step, i);
        }

    }
}

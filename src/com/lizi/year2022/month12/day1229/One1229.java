package com.lizi.year2022.month12.day1229;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

/**
 * @author lizi
 * @date 2022/12/29 09:04
 * @description 2032. 至少在两个数组中出现的值
 **/
public class One1229 {
    public List<Integer> twoOutOfThree(int[] nums1, int[] nums2, int[] nums3) {
        List<Integer> ans = new ArrayList<>();
        List<Integer> checkNums1 = Arrays.stream(nums1).boxed().collect(Collectors.toList());
        List<Integer> checkNums2 = Arrays.stream(nums2).boxed().collect(Collectors.toList());
        List<Integer> checkNums3 = Arrays.stream(nums3).boxed().collect(Collectors.toList());
        if(checkNums1.stream().distinct().count() == nums1.length){
            ans.addAll(Arrays.stream(nums1).boxed().filter(i -> checkNums2.contains(i) || checkNums3.contains(i)).collect(Collectors.toList()));
        }
        if(checkNums2.stream().distinct().count() == nums2.length){
            ans.addAll(Arrays.stream(nums1).boxed().filter(i -> checkNums1.contains(i) || checkNums3.contains(i)).collect(Collectors.toList()));
        }
        if(checkNums3.stream().distinct().count() == nums3.length){
            ans.addAll(Arrays.stream(nums1).boxed().filter(i -> checkNums2.contains(i) || checkNums1.contains(i)).collect(Collectors.toList()));
        }
        return ans.stream().distinct().collect(Collectors.toList());
    }
}

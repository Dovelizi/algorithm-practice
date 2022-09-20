package com.lizi.year2022.month3.day0327;

import java.util.ArrayList;
import java.util.List;

/**
 * @author lizi
 * @description TODO
 * @date 2022/3/27 10:22
 **/
public class OneTopic0327 {
    public List<List<Integer>> findDifference(int[] nums1, int[] nums2) {
        List<List<Integer>> ans = new ArrayList<>();
        List<Integer> list1 = new ArrayList<>();
        List<Integer> list2 = new ArrayList<>();
        List<Integer> list3 = new ArrayList<>();
        List<Integer> list4 = new ArrayList<>();
        int len = nums1.length + nums2.length;
        int[] arr = new int[len];
        int idx = 0;
        for (int n : nums1){
            list1.add(n);
            arr[idx++] = n;
        }
        for (int n : nums2){
            list2.add(n);
            arr[idx++] = n;
        }
        for(int n : arr){
            if(!list1.contains(n) && !list4.contains(n)){
                list4.add(n);
            }
            if(!list2.contains(n) && !list3.contains(n)){
                list3.add(n);
            }
        }
        ans.add(list3);
        ans.add(list4);
        return ans;
    }
}

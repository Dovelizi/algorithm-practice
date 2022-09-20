package com.lizi.year2022.month1.day0121;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * @author lizi
 * @description TODO
 * @date 2022/1/21 11:30
 **/
public class OneTopic0121 {
    public static void main(String[] args) {
        intersect(new int[]{54,93,21,73,84,60,18,62,59,89,83,89,25,39,41,55,78,27,65,82,94,61,12,38,76,5,35,6,51,48,61,0,47,60,84,9,13,28,38,21,55,37,4,67,64,86,45,33,41},
                new int[]{17,17,87,98,18,53,2,69,74,73,20,85,59,89,84,91,84,34,44,48,20,42,68,84,8,54,66,62,69,52,67,27,87,49,92,14,92,53,22,90,60,14,8,71,0,61,94,1,22,84,10,55,55,60,98,76,27,35,84,28,4,2,9,44,86,12,17,89,35,68,17,41,21,65,59,86,42,53,0,33,80,20});
    }
    public static int[] intersect(int[] nums1, int[] nums2) {
        Map<Integer, Integer> map1 = new HashMap<>();
        Map<Integer, Integer> map2 = new HashMap<>();
        List<Integer> list = new ArrayList<>();
        for(int n1 : nums1){
            int count = map1.get(n1) == null ? 0 : map1.get(n1);
            map1.put(n1, count+1);
        }
        for(int n2 : nums2){
            int count = map2.get(n2) == null ? 0 : map2.get(n2);
            map2.put(n2, count+1);
        }
        int[] temp = nums1.length > nums2.length ? nums2 : nums1;
        for(int n : temp){
            int count1 = map1.get(n) == null ? 0 : map1.get(n);
            int count2 = map2.get(n) == null ? 0 : map2.get(n);
            if(count2 != 0 && count1 != 0){
                if(count1 == count2 || !list.contains(n)){
                    list.add(n);
                }
            }
        }
        int[] res = new int[list.size()];
        for(int i = 0; i < list.size() ; i++){
            res[i] = list.get(i);
        }
        return res;
    }
}

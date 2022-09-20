package com.lizi.year2022.month7.day0710;

import java.util.*;

/**
 * @author lizi
 * @description TODO
 * @date 2022/7/10 10:25
 **/
public class ThreeTopic0710 {
    public static void main(String[] args) {
        canChange("___LL_RRR","LL____RRR");
    }
    public static boolean canChange(String start, String target) {
        List<Integer> left = new ArrayList<>();
        List<Integer> left1 = new ArrayList<>();
        List<Integer> right = new ArrayList<>();
        List<Integer> right1 = new ArrayList<>();
        int len = start.length();
        for (int i = 0; i < len; i++) {
            if(start.charAt(i) == 'L'){
                left.add(i);
            }
            if(target.charAt(i) == 'L'){
                left1.add(i);
            }
            if (start.charAt(i) == 'R'){
                right.add(i);
            }
            if(target.charAt(i) == 'R'){
                right1.add(i);
            }
        }
        Set<Integer> arrLeft = new HashSet<>();
        Set<Integer> arrRight = new HashSet<>();
        for (int i = 0; i < left.size(); i++) {
            int tempLeft = left.get(i) - left1.get(i);
            if(tempLeft < 0) {
                return false;
            }
            for(int j = left1.get(i); j <= left.get(i); j++){
                arrLeft.add(j);
            }
        }
        for (int i = 0; i < right.size(); i++) {
            int tempRight = right1.get(i) - right.get(i);
            if(tempRight < 0) {
                return false;
            }
            for(int j = right.get(i); j <= right1.get(i); j++){
                arrRight.add(j);
            }
        }
        HashSet<Integer> resSet = new HashSet<>();
        resSet.addAll(arrLeft);
        resSet.retainAll(arrRight);
        if(!resSet.isEmpty()){
            return false;
        }
        for (Integer integer : arrLeft) {
            if (start.charAt(integer) == 'R') {
                return false;
            }
        }
        for (Integer integer : arrRight) {
            if (start.charAt(integer) == 'L') {
                return false;
            }
        }
        return true;
    }
}

package com.lizi.year2021.day1201;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/**
 * @author lizi
 * @description TODO
 * @date 2021/12/1 22:37
 **/
public class ThreeTopic2 {
    public static void main(String[] args) {
        threeSum(new int[]{-1,0,1,2,-1,-4});
    }
    public static List<List<Integer>> threeSum(int[] nums) {
        List<List<Integer>> resultList = new ArrayList<>();
        // 处理长度不够的数组
        if (nums.length < 3){
            return resultList;
        }
        Arrays.sort(nums);
        int len = nums.length;
        // 处理全零的数组
        if (nums[0] == nums[len - 1] && nums[0] == 0){
            List<Integer> zero = new ArrayList<>();
            zero.add(0);
            zero.add(0);
            zero.add(0);
            resultList.add(zero);
            return resultList;
        }
        // 用三个指针遍历
        int pre = 0;
        int next = len - 1;
        int cur = 0;
        while (pre < next) {
            int leftNum = nums[pre];
            int rightNum = nums[next];
            int findNum = - (leftNum + rightNum);
            if (findNum >= leftNum && findNum <= rightNum){
                cur = pre + 1;
                while (cur < next){
                    if (findNum == nums[cur]){
                        List<Integer> findList = new ArrayList<>();
                        findList.add(nums[pre]);
                        findList.add(nums[cur]);
                        findList.add(nums[next]);
                        if (!resultList.contains(findList)) {
                            resultList.add(findList);
                        }
                        break;
                    }
                    cur++ ;
                }
            }
            next-- ;
            if (nums[next] < 0) {
                next = len - 1;
                pre++ ;
            }
        }
        return resultList;
    }
}

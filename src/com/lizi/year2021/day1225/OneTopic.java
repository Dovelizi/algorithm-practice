package com.lizi.year2021.day1225;

import java.util.*;

/**
 * @author lizi
 * @description TODO
 * @date 2021/12/25 20:20
 **/
public class OneTopic {
    public static void main(String[] args) {
        maxSlidingWindow(new int[]{1,3,-1,-3,5,3,6,7} , 2);
    }
    public static int[] maxSlidingWindow(int[] nums, int k) {
        if(nums == null || nums.length == 0) {
            return new int[0];
        }
        List<Integer> list = new ArrayList<>();
        Queue<Integer> queue = new LinkedList<>();
        int maxNumber = Integer.MIN_VALUE;
        for(int i = 0; i < k; i++){
            queue.offer(nums[i]);
            maxNumber = Math.max(nums[i], maxNumber);
        }
        list.add(maxNumber);
        for(int i = k; i < nums.length; i++){
            int temp = queue.poll();
            queue.offer(nums[i]);
            if(maxNumber == temp){
                maxNumber = Collections.max(queue);
            }else{
                maxNumber = Math.max(maxNumber,nums[i]);
            }
            list.add(maxNumber);
        }
        return  list.stream().mapToInt(Integer :: valueOf).toArray();
    }
}

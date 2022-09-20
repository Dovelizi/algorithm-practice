package com.lizi.year2022.month3.day0324;

import java.util.PriorityQueue;

/**
 * @author lizi
 * @description TODO
 * @date 2022/3/24 19:15
 **/
public class TwoTopic0324 {
    public static void main(String[] args) {
        findKthLargest(new int[]{3,2,1,5,6,4}, 4);
    }
    public static int findKthLargest(int[] nums, int k) {
        PriorityQueue<Integer> minRoot = new PriorityQueue<>();
        int len = nums.length;
        for(int i = 0; i < len; i++){
            minRoot.offer(nums[i]);
            if(minRoot.size() > k){
                minRoot.poll();
            }
        }
        return minRoot.peek();
    }
}

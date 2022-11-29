package com.lizi.year2022.month10.day1012;

/**
 * @author lizi
 * @date 2022/10/12 08:54
 * @description 817. 链表组件
 **/
public class One1012 {
    public int numComponents(ListNode head, int[] nums) {
        int ans = 0;
        int count = 0;
        int[] hash = new int[10001];
        for (int n : nums){
            hash[n]++ ;
        }
        while (head.next != null){
            if(hash[head.val] != 0){
                count++ ;
            }else {
                ans = Math.max(count, ans);
                count = 0;
            }
        }
        return ans;
    }
}
class ListNode {
     int val;
     ListNode next;
     ListNode() {}
     ListNode(int val) { this.val = val; }
     ListNode(int val, ListNode next) { this.val = val; this.next = next; }
}


package com.lizi.year2022.month1.day0125;

import java.util.ArrayList;
import java.util.List;

/**
 * @author lizi
 * @description TODO
 * @date 2022/1/25 10:08
 **/
public class OneTopic0125 {
    public static void main(String[] args) {
        ListNode n1 = new ListNode(1);
        ListNode n2 = new ListNode(2);
        ListNode n3 = new ListNode(2);
        ListNode n4 = new ListNode(1);
        n1.next = n2;
        n2.next = n3;
        n3.next = n4;
        isPalindrome(n1);
    }
    public static boolean isPalindrome(ListNode head) {
        List<Integer> list = new ArrayList<>();
        ListNode resNode = resNode(head,list);
        int idx = 0;
        while(resNode != null){
            if(resNode.val != list.get(idx++)){
                return false;
            }
            resNode = resNode.next;
        }
        return true;
    }








    public static ListNode resNode(ListNode head,  List<Integer> list){
        if(head == null){
            return null;
        }
        ListNode headNode = head, nextNode = null, tailNode = null;
        while(headNode != null){
            list.add(headNode.val);
            nextNode = headNode.next;
            headNode.next = tailNode;
            tailNode = headNode;
            headNode = nextNode;
        }
        return tailNode;
    }
}
class ListNode {
      int val;
      ListNode next;
      ListNode() {}
      ListNode(int val) { this.val = val; }
      ListNode(int val, ListNode next) { this.val = val; this.next = next; }
  }

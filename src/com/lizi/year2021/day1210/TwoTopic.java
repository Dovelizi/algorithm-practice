package com.lizi.year2021.day1210;

import java.util.Stack;

/**
 * @author lizi
 * @description TODO
 * @date 2021/12/10 10:38
 **/
public class TwoTopic {
    public static void main(String[] args) {
        ListNode n1 = new ListNode(1);
        ListNode n2 = new ListNode(2);
        ListNode n3 = new ListNode(4);
        ListNode n4 = new ListNode(1);
        ListNode n5 = new ListNode(2);
        ListNode n6 = new ListNode(4);
        n1.next = n2;
        n2.next = n3;
        n4.next = n2;
        //n5.next = n3;
        mergeTwoLists(n1,n4);
        Stack<Character> stack = new Stack<>();
        Character pop = stack.pop();
        StringBuilder sb = new StringBuilder();
    }
    public static ListNode mergeTwoLists(ListNode l1, ListNode l2) {
        ListNode head = null;
        if(l1 == null){
            head = new ListNode(l2.val);
        }else if(l2 == null){
            head = new ListNode(l1.val);
        }else{
            if(l1.val <= l2.val){
                head = new ListNode(l1.val);
                l1 = l1.next;
            }else{
                head = new ListNode(l2.val);
                l2 = l2.next;
            }
        }
        ListNode node = head;
        while(l1 != null || l2 != null){
            if(l1 == null){
                node.next = l2;
                break;
            }else if(l2 == null){
                node.next = l1;
                break;
            }else{
                if(l1.val > l2.val){
                    node.next = new ListNode(l2.val);
                    l2 = l2.next;
                }else{
                    node.next = new ListNode(l1.val);
                    l1 = l1.next;
                }
            }
            node = node.next;
        }
        return head;
    }
}


class ListNode {
    int val;
    ListNode next;
    ListNode(int x) { val = x; }
 }


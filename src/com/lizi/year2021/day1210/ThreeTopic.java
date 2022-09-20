package com.lizi.year2021.day1210;

/**
 * @author lizi
 * @description TODO
 * @date 2021/12/10 11:21
 **/
public class ThreeTopic {
    public static void main(String[] args) {
        ListNode n1 = new ListNode(4);
        ListNode n2 = new ListNode(1);
        ListNode n3 = new ListNode(8);
        ListNode n4 = new ListNode(4);
        ListNode n5 = new ListNode(5);
        ListNode n6 = new ListNode(4);
    }
    public ListNode getIntersectionNode(ListNode headA, ListNode headB) {
        ListNode head = null;
        ListNode ergodicA = headA;
        while(ergodicA != null){
            ListNode ergodicB = headB;
            while(ergodicB != null){
                if(ergodicA.val == ergodicB.val && ergodicA.val != 0){
                    head = new ListNode(ergodicA.val);
                    break;
                }
                ergodicB = ergodicB.next;
            }
            ergodicA = ergodicA.next;
        }
        return head;
    }
}
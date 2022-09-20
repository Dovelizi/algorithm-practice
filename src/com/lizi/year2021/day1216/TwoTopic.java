package com.lizi.year2021.day1216;


/**
 * @author lizi
 * @description TODO
 * @date 2021/12/16 16:12
 **/
public class TwoTopic {
    public static void main(String[] args) {
        ListNode node1 = new ListNode(2);
        ListNode node2 = new ListNode(2);
        ListNode node3 = new ListNode(4);
        ListNode node4 = new ListNode(1);
        ListNode node5 = new ListNode(3);
        ListNode node6 = new ListNode(4);
        node1.next = node2;
        node2.next = node3;
        node4.next = node5;
        node5.next = node6;
        mergeTwoLists(node1,node4);
    }
    public static ListNode mergeTwoLists(ListNode list1, ListNode list2) {
        ListNode newNode = null;
        ListNode resNode = null;
        if(list1.val == list2.val){
            newNode = new ListNode(list1.val);
            list1 = list1.next;
        }
        while(list1 != null || list2 != null){
            if(list1 == null){
                newNode.next = list2;
                break;
            }
            if(list2 == null){
                newNode.next = list1;
                break;
            }
            if(list1.val <= list2.val){
                newNode = new ListNode(list1.val);
                list1 = list1.next;
            }else{
                newNode = new ListNode(list2.val);
                list2 = list2.next;
            }
            if (resNode == null) {
                resNode = newNode;
            }
            newNode = newNode.next;
        }
        return resNode;
    }
}
class ListNode {
    int val;
    ListNode next;
    ListNode() {}
    ListNode(int val) { this.val = val; }
    ListNode(int val, ListNode next) { this.val = val; this.next = next; }
}
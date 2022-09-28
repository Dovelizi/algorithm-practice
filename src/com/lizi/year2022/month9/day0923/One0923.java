package com.lizi.year2022.month9.day0923;

/**
 * @author lizi
 * @date 2022/9/23 09:11
 * @description TODO
 **/
public class One0923 {
  //["MyLinkedList","addAtHead","deleteAtIndex","addAtHead","addAtHead","addAtHead","addAtHead","addAtHead","addAtTail","get","deleteAtIndex","deleteAtIndex"]
  //        [[],[2],[1],[2],[7],[3],[2],[5],[5],[5],[6],[4]]
    public static void main(String[] args) {
        One0923 linkedList = new One0923();
        linkedList.addAtHead(2);
        linkedList.deleteAtIndex(1);
        linkedList.addAtHead(2);
        linkedList.addAtHead(7);
        linkedList.addAtHead(3);
        linkedList.addAtHead(2);
        linkedList.addAtHead(5);
        linkedList.addAtTail(5);
        linkedList.get(5);
        linkedList.deleteAtIndex(6);
        linkedList.deleteAtIndex(4);


    }
    int cap = 0;
    ListNode first = null;
    public One0923() {

    }

    public int get(int index) {
        if(index > cap || index < 0 || first == null){
            return -1;
        }
        ListNode node = first;
        for (int i = 0; i < index; i++) {
            node = node.next;
        }
        return node.val;
    }

    public void addAtHead(int val) {
        ListNode node = new ListNode(val);
        if(first == null){
            first = node;
        }else{
            node.next = first;
            first = node;
        }
        cap++ ;
    }

    public void addAtTail(int val) {
        ListNode addNode = new ListNode(val);
        ListNode node = first;
        for (int i = 0; i < cap - 1; i++) {
            node = node.next;
        }
        if(first == null){
            first = addNode;
        }else{
            node.next = addNode;
        }
        cap++ ;
    }

    public void addAtIndex(int index, int val) {
        if(index > cap){
            return ;
        } else if(index == cap){
            addAtTail(val);
        }else if(index <= 0){
            addAtHead(val);
        }else {
            ListNode node = first;
            ListNode addNode = new ListNode(val);
            for (int i = 0; i < index - 1; i++) {
                node = node.next;
            }
            ListNode temp = node.next;
            node.next = addNode;
            addNode.next = temp;
            cap++ ;
        }
    }

    public void deleteAtIndex(int index) {
        if(index == 0){
            first = first.next;
            cap-- ;
        }
        if(first != null && index > 0 && index < cap){
            ListNode node = first;
            for (int i = 0; i < index - 1; i++) {
                node = node.next;
            }
            node.next = node.next.next;
            cap-- ;
        }
    }
}

class ListNode {
    int val;
    ListNode next;

    public ListNode(int val) {
        this.val = val;
    }
}

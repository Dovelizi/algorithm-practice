package com.lizi.year2022.month2.day0220;

import java.util.LinkedList;
import java.util.List;

/**
 * @author lizi
 * @description TODO
 * @date 2022/2/20 10:29
 **/
public class TwoTopic0220 {
    public ListNode mergeNodes(ListNode head) {
       List<Integer> numList = new LinkedList<>();
       int resNum = 0;
       while(head != null){
           if (head.val == 0){
               numList.add(resNum);
               resNum = 0;
           }else {
               resNum += head.val;
           }
           head = head.next;
       }
       numList.remove(0);
        ListNode node = new ListNode(-1);
        ListNode resNode = node;
        for (int n : numList){
            resNode.next = new ListNode(n);
            resNode = resNode.next;
        }
        return node.next;
    }
}
class ListNode {
      int val;
      ListNode next;
      ListNode() {}
      ListNode(int val) { this.val = val; }
      ListNode(int val, ListNode next) { this.val = val; this.next = next; }
  }

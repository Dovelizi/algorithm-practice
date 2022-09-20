package com.lizi.year2021.day1130;

import java.util.HashMap;
import java.util.Map;

/**
 * @author lizi
 * @description TODO
 * @date 2021/11/30 15:35
 **/
public class TwoTopic {
    static Map<Node, Node> cachedNode = new HashMap<Node, Node>();
    public static void main(String[] args) {
        Node head = new Node(1);
        Node head2 = new Node(2);
        head.random = new Node(0);
        head2.random = new Node(1);
        head.next = head2;
        copyRandomList(head);
    }
    public static Node copyRandomList(Node head) {
        if (head == null) {
            return null;
        }
        if (!cachedNode.containsKey(head)) {
            Node headNew = new Node(head.val);
            cachedNode.put(head, headNew);
            headNew.next = copyRandomList(head.next);
            headNew.random = copyRandomList(head.random);
        }
        return cachedNode.get(head);
    }
}
class Node {
    int val;
    Node next;
    Node random;

    public Node(int val) {
        this.val = val;
        this.next = null;
        this.random = null;
    }
}

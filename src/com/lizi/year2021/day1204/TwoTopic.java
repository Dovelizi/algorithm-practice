package com.lizi.year2021.day1204;


import java.util.ArrayList;
import java.util.Collections;
import java.util.LinkedList;
import java.util.List;

/**
 * @author lizi
 * @description TODO
 * @date 2021/12/4 20:29
 **/
public class TwoTopic {
    public static void main(String[] args) {
        TreeNode n1 = new TreeNode(3);
        TreeNode n2 = new TreeNode(4);
        TreeNode n3 = new TreeNode(5);
        TreeNode n4 = new TreeNode(-7);
        TreeNode n5 = new TreeNode(-6);
        TreeNode n6 = new TreeNode(-7);
        TreeNode n7 = new TreeNode(-5);
        TreeNode n8 = new TreeNode(-4);
        n1.left = n2;
        n1.right = n3;
        n2.left = n4;
        n2.right = n5;
        n3.left = null;
        n3.right = null;
        n4.left = n6;
        n4.right = null;
        n5.left = n7;
        n5.right = null;
        n6.left = null;
        n6.right = null;
        n7.left = n8;
        n7.right = null;
        levelOrder(n1);
    }
    public static List<List<Integer>> levelOrder(TreeNode root) {
        List<List<Integer>> resultList = new ArrayList<>();
        if (root == null) {
            return resultList;
        }
        LinkedList<TreeNode> treeList = new LinkedList<>();
        treeList.offer(root);
        while (!treeList.isEmpty()) {
            List<Integer> tempList = new ArrayList<>();
            for(int i = treeList.size(); i > 0; i--) {
                TreeNode node = treeList.poll();
                tempList.add(node.val);
                if(node.left != null){
                    treeList.add(node.left);
                }
                if(node.right != null){
                    treeList.add(node.right);
                }
            }
            Collections.reverse(tempList);
           resultList.add(tempList);
        }
        return resultList;
    }
}

class TreeNode {
  int val;
  TreeNode left;
  TreeNode right;
  TreeNode(int x) { val = x; }
}

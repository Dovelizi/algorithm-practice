package com.lizi.year2022.month6.day0624;

import java.util.*;

/**
 * @author lizi
 *
 * @description TODO
 * @date 2022/6/24 08:58
 **/
public class OneTopic0624 {
    public List<Integer> largestValues(TreeNode root) {
        List<Integer> ans = new ArrayList<>();
        if(root == null){
            return ans;
        }
        Queue<TreeNode> queue = new LinkedList<>();
        queue.offer(root);
        while(!queue.isEmpty()){
            int maxValue = Integer.MIN_VALUE;
            int size = queue.size();
            while (size-- > 0){
                TreeNode node = queue.peek();
                if(node.left != null){
                    queue.add(node.left);
                }
                if(node.right != null){
                    queue.add(node.right);
                }
                maxValue = Math.max(maxValue, node.val);
            }
            ans.add(maxValue);
        }
        return ans;
    }
}
class TreeNode {
      int val;
      TreeNode left;
      TreeNode right;
      TreeNode() {}
      TreeNode(int val) { this.val = val; }
      TreeNode(int val, TreeNode left, TreeNode right) {
          this.val = val;
          this.left = left;
          this.right = right;
      }
  }

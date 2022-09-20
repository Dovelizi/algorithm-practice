package com.lizi.year2022.month9.day0918;

import javax.swing.tree.TreeNode;
import java.util.*;

/**
 * @author lizi
 * @date 2022/9/18 10:21
 * @description TODO
 **/
public class Three0918 {
    public TreeNode reverseOddLevels(TreeNode root) {
        Queue<TreeNode> queue = new LinkedList<TreeNode>();
        queue.add(root);
        Map<Integer, List<TreeNode>> map = new HashMap<>();
        Map<Integer, Stack<Integer>> map2 = new HashMap<>();
        int high = 0;
        while(!queue.isEmpty()){
            int count = queue.size();
            List<TreeNode> temp = new ArrayList<>();
            Stack<Integer> stack = new Stack<>();
            while (count--  > 0){
                TreeNode node = queue.poll();
//                if(node.left != null){
//                    queue.add(node.left);
//                }
//                if(node.right != null){
//                    queue.add(node.right);
//                }
//                temp.add(node);
//                stack.add(node.val);
            }
            map.put(high, temp);
            map2.put(high, stack);
            high++ ;
        }
        for (Map.Entry<Integer,List<TreeNode>> entry : map.entrySet()){
            if((entry.getKey() & 1) == 1){
                List<TreeNode> list = entry.getValue();
                Stack<Integer> stack = map2.get(entry.getKey());
                for(int i = 0; i < list.size(); i++){
//                    list.get(i).val = stack.pop();
                }
            }
        }
        return root;
    }
}

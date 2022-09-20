package com.lizi.year2021.day1205;

import java.util.ArrayList;
import java.util.List;

/**
 * @author lizi
 * @description TODO
 * @date 2021/12/5 20:44
 **/
public class TwoTopic {
    public static void main(String[] args) {
        TreeNode n1 = new TreeNode(10);
        TreeNode n2 = new TreeNode(12);
        TreeNode n3 = new TreeNode(6);
        TreeNode n4 = new TreeNode(8);
        TreeNode n5 = new TreeNode(3);
        TreeNode n6 = new TreeNode(11);


        TreeNode n7 = new TreeNode(10);
        TreeNode n8 = new TreeNode(12);
        TreeNode n9 = new TreeNode(6);
        TreeNode n10 = new TreeNode(8);

        n1.left = n2;
        n1.right = n3;
        n2.left = n4;
        n2.right = n5;
        n4.left = n6;

        n7.left = n8;
        n7.right = n9;
        n8.left = n10;


//        n4.left = n5;
        isSubStructure(n1,n7);
        List<Integer> list1 = new ArrayList<>();
        list1.add(4);
        list1.add(2);
        list1.add(4);
        list1.add(1);
        list1.add(2);
        list1.add(5);
        List<Integer> list2 = new ArrayList<>();
        list2.add(4);
        list2.add(1);
        list2.add(2);
        list2.add(4);
        containsList(list1,list2);
    }
    public static boolean isSubStructure(TreeNode A, TreeNode B) {
        List<Integer> treeA = new ArrayList<>();
                ergodicTree(A,treeA);
        List<Integer> treeB = new ArrayList<>();
                ergodicTree(B,treeB);
        int idx = 0;
        for(int i = 0; i < treeA.size(); i++){
            if(treeA.get(i).equals(treeB.get(0))){
                idx = i;
                break;
            }
        }
        for(int i = 0; i < treeB.size(); i++){
            if((idx+i) == treeA.size() || !treeB.get(i).equals(treeA.get(idx+i))){
                return false;
            }
        }
        return containsList(treeA,treeB);
    }
    public static List<Integer> ergodicTree(TreeNode root,List<Integer> treeList){
        if(root == null){
            treeList.add(0);
            return treeList;
        }
        ergodicTree(root.left,treeList);
        treeList.add(root.val);
        ergodicTree(root.right,treeList);
        return treeList;
    }

    public static boolean containsList(List<Integer> a, List<Integer> b){
        for(int i = 0; i < a.size();i++){
            if(a.get(i).equals(b.get(0))){
                for(int j = 0; j < b.size();j++){
                    if(!b.get(j).equals(a.get(i+j))){
                        break;
                    }
                    if(j == b.size() - 1){
                        return true;
                    }
                }
            }
        }
        return false;
    }
}
class TreeNode {
    int val;
    TreeNode left;
    TreeNode right;
    TreeNode(int x) { val = x; }
 }


package com.lizi.year2022.month7.day0703;

import java.util.Arrays;

/**
 * @author lizi
 * @description TODO
 * @date 2022/7/3 10:29
 **/
public class ThreeTopic0703 {
    public static void main(String[] args) {
        spiralMatrix(6,6,null);
    }
    public static int[][] spiralMatrix(int m, int n, ListNode head) {
        int[][] matrix = new int[m][n];
        for (int[] arr : matrix){
            Arrays.fill(arr, -1);
        }
        for(int i = 0; i < (Math.min(m,n)+1)/2; i++){
            for (int j=i;j<n-i;j++){
                if(head == null){
                    break;
                }
                matrix[i][j] = head.val;
                head = head.next;
            }
            for (int j=i+1;j<m-i;j++){
                if(head == null){
                    break;
                }
                matrix[j][(n-1)-i] = head.val;
                head = head.next;
            }
            for (int j=i+1;j<n-i;j++){
                if(head == null){
                    break;
                }
                matrix[(m-1)-i][(n-1)-j] = head.val;
                head = head.next;
            }
            for (int j=i+1;j<m-1-i;j++){
                if(head == null){
                    break;
                }
                matrix[(m-1)-j][i] = head.val;
                head = head.next;
            }

        }
        return matrix;
    }
}

  class ListNode {
      int val;
      ListNode next;
      ListNode() {}
      ListNode(int val) { this.val = val; }
      ListNode(int val, ListNode next) { this.val = val; this.next = next; }
  }


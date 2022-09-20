package com.lizi.year2022.month5.day0509;

/**
 * @author lizi
 * @description TODO
 * @date 2022/5/9 10:15
 **/
public class OneTopic0509 {
    public static void main(String[] args) {
        diStringMatch("DDI");
    }
    public static int[] diStringMatch(String s) {
        int len = s.length();
        int[] arr = new int[len + 1];
        int[] ans = new int[len + 1];
        for (int i = 0; i < arr.length; i++) {
            arr[i] = i;
        }
        int left = 0, right = arr.length - 1;
        for (int i = 0; i < s.length(); i++) {
           if(s.charAt(i) == 'D'){
               ans[i] = arr[right];
               arr[right] = -1;
               right-- ;
           }else{
               ans[i] = arr[left];
               arr[left] = -1;
               left++ ;
           }
        }
        ans[ans.length - 1] = arr[left] != -1 ? arr[left] : arr[right];
        return ans;
    }
}

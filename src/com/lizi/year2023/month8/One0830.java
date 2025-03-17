package com.lizi.year2023.month8;

import java.util.Arrays;

/**
 * @author lizi
 * @since 2023-08-30
 **/
public class One0830 {
    public static void main(String[] args) {
        int[] arr1 = new int[]{1, 3, 6, 7};
        int[] arr2 = new int[]{2, 5, 7, 7};
        System.out.println(Arrays.toString(mage(arr1, arr2)));

        int[] arr3 = new int[]{2, 3, 1, 4};
        sort(arr3);
        System.out.println(Arrays.toString(arr3));
    }

    public static int[] mage(int[] arr, int[] arr2){
        int len1 = arr.length;
        int len2 = arr2.length;
        int[] ans = new int[len1 + len2];
        int idx = 0, idx1 = 0, idx2 = 0;
        while(idx1 < len1 && idx2 < len2){
            if(arr[idx1] < arr2[idx2]){
                ans[idx++] = arr[idx1++];
            }else{
                ans[idx++] = arr2[idx2++];
            }
        }
//        if(idx != ans.length){
//            if(idx1 != len1){
//                System.arraycopy(arr, idx1, ans, idx, ans.length);
//            }
//        }
        while(idx1 != len1){
            ans[idx++] = arr[idx1++];
        }
        while(idx2 != len2){
            ans[idx++] = arr2[idx2++];
        }
        return ans;
    }

    public static void sort(int[] arr){
        int len = arr.length;
        for(int i = 0; i < len; i++){
            for(int j = 0; j < i + 1; j++){
                if(arr[i] < arr[j]){
                    int temp = arr[i];
                    arr[i] = arr[j];
                    arr[j] = temp;
                }
            }
        }
    }
}


/**
 * 1 2
 * 1 3
 * 2 4
 * 2 4
  */

//server{
//    hostname 127.0.0.1;
//    xx : www.baidu.com
//            locacation / {
//
//            }
//            location 404 {
//
//    }
//    500
//}

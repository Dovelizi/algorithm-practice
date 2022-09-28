package com.lizi.year2022.month9.day0928;

/**
 * @author lizi
 * @date 2022/9/28 08:58
 * @description 面试题 17.09. 第 k 个数
 **/
public class One0928 {
    public int getKthMagicNumber(int k) {
        int idx3 = 0, idx5 = 0, idx7 = 0;
        int[] arr = new int[k];
        arr[0] = 1;
        for (int i = 1; i < k; i++) {
            int temp = Math.min(Math.min(arr[idx3] * 3, arr[idx5] * 5), arr[idx7] * 7);
            if(temp % 3 == 0){
                idx3++ ;
            }
            if(temp % 5 == 0){
                idx5++ ;
            }
            if(temp % 7 == 0){
                idx7++ ;
            }
            arr[i] = temp;
        }
        return arr[k - 1];
    }
}

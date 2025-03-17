package com.lizi.year2023.month1.day02;

/**
 * @author lizi
 * @date 2023/1/3 08:46
 * @description 2522. 将字符串分割成值不超过 K 的子字符串
 **/
public class One0103 {
    public int minimumPartition(String s, int k) {
        int count = 0;
        for (int i = 0; i < s.length(); count++) {
            if (s.charAt(i) - '0' > k) {
                return -1;
            }
            long curr = 0;
            while (i < s.length() && (curr = curr * 10 + s.charAt(i) - '0') <= k){
                i++ ;
            }
        }
        return count;
    }
}

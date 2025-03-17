package com.lizi.year2023.month1.day04;

/**
 * @author lizi
 * @date 2023/1/4 08:53
 * @description 1802. 有界数组中指定下标处的最大值
 **/
public class One0104 {
    public static void main(String[] args) {
        maxValue(2, 0, 798870804);
    }
    public static int maxValue(int n, int index, int maxSum) {
        maxSum -= n;
        int prev = index, next = index;
        int flag = maxSum == 0 ? 1 : 2;
        if(flag == 2){
            maxSum-- ;
        }
        while (maxSum > 0){
            flag++ ;
            if(prev > 0){
                prev-- ;
            }
            if(next < n - 1){
                next++ ;
            }
            int width = next - prev + 1;
            if(width > maxSum){
                return flag - 1;
            }else {
                maxSum -= width;
            }
        }
        return flag;
    }
}

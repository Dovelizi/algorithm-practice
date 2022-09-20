package com.lizi.year2022.month7.day0708;

/**
 * @author lizi
 * @description TODO
 * @date 2022/7/8 09:04
 **/
public class OneTopic0708 {
    public int minCostToMoveChips(int[] position) {
        int oddNumber = 0;
        int evenNumbers = 0;
        for (int n : position){
            if((n & 1) == 0){
                evenNumbers++ ;
            }else{
                oddNumber++ ;
            }
        }
        return Math.min(oddNumber, evenNumbers);
    }
}

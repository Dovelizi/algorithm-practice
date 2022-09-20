package com.lizi.year2022.month8.day0821;


import java.util.Arrays;

/**
 * @author lizi
 * @description TODO
 * @date 2022/8/21 10:14
 **/
public class Two0821 {
    public static void main(String[] args) {largestPalindromic("00001105");
    }
    public static String largestPalindromic(String num) {
        int[] arr = new int[10];
        int len = num.length();
        int[] arrAns = new int[len];
        Arrays.fill(arrAns,-1);
        int midNumber = 0;
        int pre = 0, next = len - 1;
        for (int i = 0; i < num.toCharArray().length; i++) {
            arr[num.charAt(i) - '0']++ ;
        }
        int sum = Arrays.stream(arr)
                .filter(item -> item != -1)
                .reduce(Integer::sum)
                .getAsInt();
        if(sum - arr[0] < 2){
            arr[0] = -1;
        }
        for (int i = 9; i >= 0; i--){
            if((arr[i] & 1) == 1){
                arr[i]-- ;
                midNumber = Math.max(midNumber, i);
            }
            while (arr[i] > 0){
                arrAns[pre] = i;
                arrAns[next] = i;
                arr[i] -= 2;
                pre++ ;
                next-- ;
            }
        }
        long count = Arrays.stream(arrAns)
                .filter(item -> item == -1)
                .count();

        if(count > 0){
            arrAns[len / 2] = midNumber;
        }
        return Arrays.stream(arrAns)
                .filter(item -> item != -1)
                .mapToObj(String::valueOf)
                .reduce((x, y) -> x + "" + y)
                .get();
    }
}

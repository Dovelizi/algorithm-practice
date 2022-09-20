package com.lizi.year2022.month9.day0905;

/**
 * @author lizi
 * @date 2022/9/4 10:30
 * @description TODO
 **/
public class Three0905 {
    public static void main(String[] args) {
       longestNiceSubarray(new int[]{84139415,693324769,614626365,497710833,615598711,264,65552,50331652,1,1048576,16384,544,270532608,151813349,221976871,678178917,845710321,751376227,331656525,739558112,267703680});
    }
    public static int longestNiceSubarray(int[] nums) {
        int ans = 1;
        int[][] check = new int[nums.length][32];
        for (int i = 0; i < nums.length; i++) {
            check[i] = tranNum(nums[i]);
        }
        int[] ret = check[0];
        int count = 1;
        for (int j = 1; j < nums.length; j++) {
           ret = addNum(check[j], ret);
            if(checkNum(ret)){
                count++ ;
            }else {
                ret = check[j];
                count = 1;
            }
            ans = Math.max(count, ans);
        }
        return ans;
    }
    public static int[] tranNum(int num){
        int[] arr = new int[32];
        for (int i = 31; i >= 0; i--) {
            arr[31 - i] = ((1 << i) & num) == 0 ? 0 : 1;
        }
        return arr;
    }
    public static int[] addNum(int[] arrA, int[] ret){
        for (int i = 0; i < arrA.length; i++) {
            ret[i] += arrA[i];
        }
        return ret;
    }
    public static boolean checkNum(int[] ret){
        for (int n : ret){
            if(n > 1){
                return false;
            }
        }
        return true;
    }
}

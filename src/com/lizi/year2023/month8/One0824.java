package com.lizi.year2023.month8;

/**
 * @author lizi
 * @since 2023-08-24
 **/
public class One0824 {
    public static void main(String[] args) {
        jump(new int[]{1,2,3,4,5,6,7,8,9,10});
    }
    public static int jump(int[] nums) {
        int ans = 1;
        int len = nums.length;
        int idx = 0;
        int max = nums[0];
        while(idx + nums[idx] < len - 1){
            ans++ ;
            System.out.println(idx);
            int tempIdx = idx;
            for(int j = idx + 1; j <= tempIdx + nums[tempIdx]; j++){
                if(nums[j] >= max){
                    max = nums[j];
                    idx = j;
                }
            }
        }
        return ans;
    }
}

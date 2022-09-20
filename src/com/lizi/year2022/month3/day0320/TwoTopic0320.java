package com.lizi.year2022.month3.day0320;

/**
 * @author lizi
 * @description TODO
 * @date 2022/3/20 10:23
 **/
public class TwoTopic0320 {
    public static void main(String[] args) {
        countCollisions("SSSRRSLLLLL");

    }
    public static int countCollisions(String directions) {
        // RLRSLL
        char[] arr = directions.toCharArray();
        int ans = 0;
        int len = arr.length;
        StringBuilder sb = new StringBuilder();
        // RL RS SL
        for (int i = 1; i < len; i++) {
            if(arr[i] == 'L' && arr[i - 1] == 'R'){
                sb.append('S');
                ans += 2;
            }else{
                sb.append(arr[i]);
            }
        }
        if(arr[1] != 'L' || arr[0] != 'R'){
            sb.insert(0,arr[0]);
        }

        String[] str = sb.toString().split("S");
        boolean flag = false;
        for(String s : str){
            int count = 0;
            if(s.contains("R")){
                count += s.length();
                flag = true;
            }
            if(flag && s.contains("L")){
                count += s.length();
                flag = false;
            }
            if(!flag){
                ans += count;
            }
        }
        return ans;
    }
}

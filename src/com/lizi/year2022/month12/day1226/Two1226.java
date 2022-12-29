package com.lizi.year2022.month12.day1226;

/**
 * @author lizi
 * @date 2022/12/26 17:22
 * @description 2516. 每种字符至少取 K 个
 **/
public class Two1226 {
    public static void main(String[] args) {
        takeCharacters2("acbcc", 1);
    }
    public static int takeCharacters(String s, int k) {
        int ans = -1;
        int start = 0;
        int len = s.length();
        int[] ret = new int[3];
        while (ret[0] < k || ret[1] < k || ret[2] < k){
            if(start == len){
                return ans;
            }
            ret[s.charAt(start++) - 'a']++ ;
        }
        ans = start;
        start-- ;
        for (int i = len - 1; i >= 0; i--) {
            ret[s.charAt(i) - 'a']++ ;
            while (start >= 0 && ret[s.charAt(start) - 'a'] > k){
                ret[s.charAt(start) - 'a']-- ;
                start-- ;
            }
            ans = Math.min(ans, start + 1 + len - i);
        }
        return ans;
    }

    public static int takeCharacters2(String s, int k) {
        int ans = -1;
        int len = s.length();
        int width = k * 3;
        while (width <= len){
            int[] ret = new int[3];
            int start = len - width;
            for (int i = start; i < start + width; i++) {
                ret[s.charAt(i) - 'a']++ ;
            }
            if(check(ret, k)){
                return width;
            }
            for (int i = start; i < start + width; i++){
                ret[s.charAt(i) - 'a']-- ;
                ret[s.charAt((i + width) % len) - 'a']++ ;
                if(check(ret, k)){
                    return width;
                }
            }
            width++ ;
        }
        return ans;
    }
    public static boolean check(int[] ret, int k){
        if(k == 0){
            return true;
        }
        return ret[0] >= k && ret[1] >= k && ret[2] >= k;
    }
}

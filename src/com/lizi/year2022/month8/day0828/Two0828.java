package com.lizi.year2022.month8.day0828;

/**
 * @author lizi
 * @description TODO
 * @date 2022/8/28 10:25
 **/
public class Two0828 {
    public static void main(String[] args) {
        removeStars("abb*cdfg*****x*");
    }
    public static String removeStars(String s) {
        char[] charArray = s.toCharArray();
        int len = charArray.length;
        int wid = 0;
        int count = 0;
        StringBuilder ans = new StringBuilder();
        boolean[] vis = new boolean[len];
        for (int i = len - 1; i >= 0; i--) {
            if(vis[i]){
                continue;
            }
            if(s.charAt(i) == '*'){
                wid++ ;
                vis[i] = true;
            }else {
                while (wid-- > 0){
                    int idx = Math.max(i - wid, 0);
                    if(s.charAt(idx) == '*'){
                        count++ ;
                    }else {
                        vis[Math.max(i - wid, 0)]  = true;
                    }
                }
                wid = Math.max(wid, 0) + count;
                count = 0;
            }
        }
        for (int j = 0; j < len; j++) {
            if(!vis[j]){
                ans.append(s.charAt(j));
            }
        }
        return ans.toString();
    }
}

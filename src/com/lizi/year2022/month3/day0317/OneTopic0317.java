package com.lizi.year2022.month3.day0317;

import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;

/**
 * @author lizi
 * @description TODO
 * @date 2022/3/17 09:51
 **/
public class OneTopic0317 {
    public static void main(String[] args) {
        longestWord(new String[]{"yo","ew","fc","zrc","yodn","fcm","qm","qmo","fcmz","z","ewq","yod","ewqz","y"});
    }
        public static String longestWord(String[] words) {
            String ans = "";
            Set<String> set = new HashSet<>(Arrays.asList(words));
            for (String s : set) {
                int n = s.length(), m = ans.length();
                if (n < m) {
                    continue;
                }
                if (n == m && s.compareTo(ans) > 0) {
                    continue;
                }
                boolean ok = true;
                for (int i = 1; i <= n && ok; i++) {
                    String sub = s.substring(0, i);
                    if (!set.contains(sub)) {
                        ok = false;
                    }
                }
                if (ok){
                    ans = s;
                }
            }
            return ans;
        }
}

package com.lizi.year2022.month11.day1114;

import java.util.Objects;

/**
 * @author lizi
 * @date 2022/11/14 10:09
 * @description 6236. 不重叠回文子字符串的最大数目
 **/
public class One1114 {
    public int maxPalindromes(String s, int k) {
        int ans = 0;
        int len = s.length();
        for (int i = 0; i < len - k; i++) {

        }
        return ans;
    }
    public boolean checkStr(String str){
        StringBuilder sb = new StringBuilder(str).reverse();
        return Objects.equals(sb.toString(), str);
    }
}

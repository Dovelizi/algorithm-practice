package com.lizi.year2022.month12.day1228;

/**
 * @author lizi
 * @date 2022/12/28 08:44
 * @description 1750. 删除字符串两端相同字符后的最短长度
 **/
public class One1228 {
    public static void main(String[] args) {
        minimumLength("bbbbbbbbbbbbbbbbbbb");
    }
    public static int minimumLength(String s) {
        int ans = 0 ;
        int len = s.length();
        int pre = 0, next = len - 1;
        while (pre <= next){
            char ch = s.charAt(pre);
            if(pre < next && s.charAt(next) == ch){
                while (pre < len - 1 && s.charAt(++pre) == ch);
                while (next > 0 && s.charAt(--next) == ch);
            }else {
                return next - pre + 1;
            }
        }
        return ans;
    }
}

package com.lizi.year2022.month11.day1108;

/**
 * @author lizi
 * @date 2022/11/8 08:54
 * @description 1684. 统计一致字符串的数目
 **/
public class One1108 {
    public static void main(String[] args) {
        System.out.println("");
        countConsistentStrings("ab", new String[]{"y","ad","bd","aaab","baa","badab"});
    }
    public static int countConsistentStrings(String allowed, String[] words) {
        int ans = 0;
        for (String str : words){
            int count = 0;
           for(char ch : str.toCharArray()){
                if(allowed.contains(String.valueOf(ch))){
                    count++ ;
                }else {
                    break;
                }
           }
           if(count == str.length()){
               ans++ ;
           }
        }
        return ans;
    }
}

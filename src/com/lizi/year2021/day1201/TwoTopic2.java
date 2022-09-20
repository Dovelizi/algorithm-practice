package com.lizi.year2021.day1201;

/**
 * @author lizi
 * @description TODO
 * @date 2021/12/1 11:29
 **/
public class TwoTopic2 {
    public String replaceSpace(String s) {
        int len = s.length();
        // 按照官方题解扩充字符串赋值
        char[] expansionArr = new char[len * 3];
        int idx = 0;
        while(idx < len){
            char ch = s.charAt(idx);
            if (ch == ' ') {
                expansionArr[idx] = '%';
                idx++ ;
                expansionArr[idx] = '2';
                idx++ ;
                expansionArr[idx] = '0';
                idx++ ;
            }else {
                expansionArr[idx] = ch;
                idx++ ;
            }
        }
        return new String(expansionArr,0,len);
    }
}

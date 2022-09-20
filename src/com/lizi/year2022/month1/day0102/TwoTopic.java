package com.lizi.year2022.month1.day0102;

import java.util.LinkedList;
import java.util.List;

/**
 * @author lizi
 * @description TODO
 * @date 2022/1/2 10:47
 **/
public class TwoTopic {
    public static void main(String[] args) {
        numberOfBeams(new String[]{"0","0","0"});
    }
    public static int numberOfBeams(String[] bank) {
        List<Integer> list = new LinkedList();
        int resNum = 0;
        for(String str : bank){
            int count = 0;
            for (int i = 0; i < str.toCharArray().length; i++) {
                if(str.charAt(i) == '1'){
                    count++ ;
                }
            }
            if(count != 0){
                list.add(count);
            }
        }
        if(list.size() == 1){
            return resNum;
        }
        for (int i = 1; i < list.size(); i++) {
            resNum += (list.get(i) * list.get(i - 1));
        }
        return resNum;
    }
}

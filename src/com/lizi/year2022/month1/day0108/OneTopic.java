package com.lizi.year2022.month1.day0108;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/**
 * @author lizi
 * @description TODO
 * @date 2022/1/8 18:32
 **/
public class OneTopic {
    public static void main(String[] args) {
        System.out.println("dsd");
        grayCode(2);
    }
    public static List<Integer> grayCode(int n) {
        List<Integer> resList = new ArrayList<>();
        List<String> stringList = diGui(Arrays.asList("0", "1"), n);
        for(String str : stringList){
            resList.add(Integer.parseInt(str,2));
        }
        return resList;
    }

    public static List<String> diGui(List<String> resList, int n){
        if(n == 1){
            return resList;
        }
        List<String> listNew = new ArrayList<>();
        for(String str : resList){
            listNew.add("0" + str);
        }
        for (int i = resList.size() - 1; i >= 0; i--) {
            listNew.add("1"+resList.get(i));
        }
        n--;
        return diGui(listNew,n);
    }

}

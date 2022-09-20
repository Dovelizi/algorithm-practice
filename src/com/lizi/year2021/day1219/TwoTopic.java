package com.lizi.year2021.day1219;

/**
 * @author lizi
 * @description TODO
 * @date 2021/12/19 10:45
 **/
public class TwoTopic {
    public static void main(String[] args) {
        StringBuilder sb  = new StringBuilder("LeetcodeHelpsMeLearn");
        StringBuilder replace = sb.replace(0, 0, " ");
        addSpaces("icodeinpython",new int[]{1,5,7,9});
    }
    public static String addSpaces(String s, int[] spaces) {
        StringBuilder sb = new StringBuilder(s);
        int time = 0;
        for(int num : spaces){
            if(num == 0){
                sb = sb.replace(0, 0, " ");
                time++ ;
            }else{
                sb = sb.replace(num+time, num+time, " ");
                time++ ;
            }
        }
        return sb.toString();
    }
}

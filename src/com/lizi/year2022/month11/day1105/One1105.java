package com.lizi.year2022.month11.day1105;

/**
 * @author lizi
 * @date 2022/11/5 19:11
 * @description 2446. 判断两个事件是否存在冲突
 **/
public class One1105 {
    public static boolean haveConflict(String[] event1, String[] event2) {
        int s1 = trans(event1[0]);
        int s2 = trans(event1[1]);

        int s3 = trans(event1[0]);
        int s4 = trans(event2[1]);

        if(s3 <= s4){
            if(s3 > s2 || s4 < s1){
                return true;
            }
        }else {
            if(s3 > s2 && s4 < s1){
                return true;
            }
        }
        return false;
    }

    public static int trans(String str){
        return Integer.parseInt(str.replace(":", ""));
    }
}

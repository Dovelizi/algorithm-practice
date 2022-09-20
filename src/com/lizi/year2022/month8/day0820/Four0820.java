package com.lizi.year2022.month8.day0820;

/**
 * @author lizi
 * @description TODO
 * @date 2022/8/20 22:05
 **/
public class Four0820 {
    public static void main(String[] args) {
        smallestNumber("IIIIIII");
    }
    public static String smallestNumber(String pattern) {
        int len = pattern.length();
        int flag = 1;
        StringBuilder stringBuilder = new StringBuilder();
        for (int i = 0; i < len; i++) {
            if(pattern.charAt(i) == 'I') {
                stringBuilder.append(flag);
                flag++ ;
            }else {
                int idx = 0;
                while (i < len && pattern.charAt(i) == 'D'){
                    idx++ ;
                    i++ ;
                }
                idx += flag;
                int temp = flag;
                flag = idx + 1;
                while (idx >= temp){
                    stringBuilder.append(idx--);
                }
            }
        }
        if(stringBuilder.length() == len){
            stringBuilder.append(flag);
        }
        return stringBuilder.toString();
    }
}

package com.lizi.year2022.month4.day04010;

/**
 * @author lizi
 * @description TODO
 * @date 2022/4/10 10:22
 **/
public class TwoTopic0410 {
    public static void main(String[] args) {
        minimizeResult("987+654");
    }
    public static String minimizeResult(String expression) {
        String[] split = expression.split("\\+");
        int min = Integer.MAX_VALUE;
        String ans = "";
        int len1 = split[0].length();
        int len2 = split[1].length();
        for(int i = 1; i <= len1; i++){
            for (int j = 1; j <= len2; j++){
                StringBuilder sb = new StringBuilder();
                int temp1 = Integer.parseInt("".equals(split[0].substring(0,len1 - i)) ? "1" : split[0].substring(0,len1 - i));
                int temp2 = Integer.parseInt(split[0].substring(len1 - i, len1));
                int temp3 = Integer.parseInt(split[1].substring(0,j));
                int temp4 = Integer.parseInt("".equals(split[1].substring(j,len2)) ? "1" : split[1].substring(j,len2));
                int temp5 = temp1 * (temp2 + temp3) * temp4;
                if(temp5 < min){
                    min = temp5;
                    if(temp2 == Integer.parseInt(split[0])){
                        sb.append("(");
                        sb.append(split[0]);
                        sb.append("+");
                    }else{
                        sb.append(temp1);
                        sb.append("(");
                        sb.append(temp2);
                        sb.append("+");
                    }
                    if(temp3 == Integer.parseInt(split[1])){
                        sb.append(temp3);
                        sb.append(")");
                    }else{
                        sb.append(temp3);
                        sb.append(")");
                        sb.append(temp4);
                    }
                    ans = sb.toString();
                }
            }
        }
        return ans;
    }
}

package com.lizi.year2022.month1.day0110;

/**
 * @author lizi
 * @description TODO
 * @date 2022/1/10 11:05
 **/
public class OneTopic {
    public static void main(String[] args) {
        isAdditiveNumber("8911100111");
    }
    public static boolean isAdditiveNumber(String num) {
        int numLen = num.length();
        int findIdx = 0;
        long findNum = 0;
        long findFirstNum = 0;
        int findWid = 0;
        boolean flag = false;
        for(int i = 1; i <= numLen / 2; i++){
            for(int j = i + 1; j <= numLen / 2 + 1; j++){
//                if(i + j <= numLen / 2){
                    long sum = Long.parseLong(num.substring(0, i)) + Long.parseLong(num.substring(i, j));
                    int maxLen = Math.max(i,j-i);
                    long l1 = Long.parseLong(num.substring(j, j + maxLen));
                    if(j + maxLen + 1 < numLen){
                        long l2 = Long.parseLong(num.substring(j, j + maxLen + 1));
                        if(l2 == sum){
                            flag = true;
                        }
                    }
                    if(sum == l1 || flag){
                        findIdx = (sum == l1) ? j : j + 1;
                        findWid = String.valueOf(sum).length();
                        findFirstNum = Long.parseLong(num.substring(i, j));
                        findNum = sum;
                        flag = true;
                        break;
                    }
//                }
            }
            if(flag){
                break;
            }
        }
        if(flag && findIdx == numLen - 1){
            return true;
        }
        if(flag){
            while(findWid + findIdx <= numLen){
                long sum = findFirstNum + findNum;
                long l1 = Long.parseLong(num.substring(findIdx, findIdx + findWid));
                if (findIdx + findWid + 1 <= numLen) {
                    long l2 = Long.parseLong(num.substring(findIdx, findIdx + findWid + 1));
                    if(l1 != sum && l2 != sum){
                        return false;
                    }
                }
                if(l1 != sum){
                    return false;
                }
                findIdx += findWid;
                findFirstNum = findNum;
                findNum = sum;
            }
        }else{
            return false;
        }
            return true;
    }
}

package com.lizi.year2022.month9.day0913;

/**
 * @author lizi
 * @date 2022/9/13 13:23
 * @description TODO
 **/
public class One0913 {
    public static void main(String[] args) {
        maximumSwap(2342342);

    }
    public static int maximumSwap(int num) {
        int ans = num;
        char[] array = String.valueOf(num).toCharArray();
        int len = array.length;
        for (int i = 0; i < len; i++) {
            for (int j = i + 1; j < len; j++) {
                char[] copy = array.clone();
                char ch = copy[i];
                copy[i] = copy[j];
                copy[j] = ch;
                String transNum = String.valueOf(copy);
                int parseInt = Integer.parseInt(transNum);
                if(parseInt >= 0){
                    ans = Math.max(ans, parseInt);
                }
            }
        }
        return ans;
    }
}

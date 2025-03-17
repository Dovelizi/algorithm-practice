package com.lizi.year2023.month1.day02;

/**
 * @author lizi
 * @date 2023/1/3 08:59
 * @description 2042. 检查句子中的数字是否递增
 **/
public class Two0103 {
    public boolean areNumbersAscending(String s) {
        int ans = -1;
        String[] split = s.split("\\s+");
        for (String str : split){
            int startNum = str.charAt(0) - '0';
            if(startNum >= 0 && startNum <= 9){
                int num = Integer.parseInt(str);
                if(ans < num){
                    ans = num;
                }else {
                    return false;
                }
            }
        }
        return true;
    }
}

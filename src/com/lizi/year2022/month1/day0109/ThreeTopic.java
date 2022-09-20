package com.lizi.year2022.month1.day0109;

/**
 * @author lizi
 * @description TODO
 * @date 2022/1/9 11:41
 **/
public class ThreeTopic {
//    ["g","vf","ylpuk","nyf","gdj","j","fyqzg","sizec"]
//            ["r","am","jg","umhjo","fov","lujy","b","uz","y"]
    public static void main(String[] args) {
        wordCount(new String[]{"g","fo","j"},new String[]{"jg","fov"});
    }
    public static int wordCount(String[] startWords, String[] targetWords) {
        int resNum = 0;
        for (String str : startWords){
            for(int i = 0; i < targetWords.length; i++){
                int flag = 0;
                if(targetWords[i].length() != (str.length() + 1)){
                    continue;
                }
                for(char ch : targetWords[i].toCharArray()){
                    if(!str.contains(String.valueOf(ch))){
                        flag++ ;
                    }
                }
                if(flag == 1){
                    targetWords[i] = "";
                    resNum++ ;
                    break;
                }
            }
        }

        return resNum;
    }
}

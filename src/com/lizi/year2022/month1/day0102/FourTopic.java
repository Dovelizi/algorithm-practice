package com.lizi.year2022.month1.day0102;


/**
 * @author lizi
 * @description TODO
 * @date 2022/1/2 11:15
 **/
public class FourTopic {
    public static void main(String[] args) {
        maximumInvitations(new int[]{1,0,0,2,1,4,7,8,9,6,7,10,8});
    }
    public static int maximumInvitations(int[] favorite) {
        int len = favorite.length;
        int[] rank = new int[len];
        int numberLiked = len;
        for(int num : favorite){
            rank[num]++ ;
        }
        for (int num : rank){
            if(num == 0){
                numberLiked-- ;
            }else if(num > 2){
                numberLiked++ ;
            }
        }
        return numberLiked;
    }
}

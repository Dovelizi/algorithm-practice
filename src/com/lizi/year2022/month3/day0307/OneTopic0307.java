package com.lizi.year2022.month3.day0307;

import java.util.ArrayList;
import java.util.List;

/**
 * @author lizi
 * @description TODO
 * @date 2022/3/7 19:36
 **/
public class OneTopic0307 {
    public static void main(String[] args) {
        goodDaysToRobBank(new int[]{1,2,5,4,1,0,2,4,5,3,1,2,4,3,2,4,8}, 2);
    }
    public static List<Integer> goodDaysToRobBank(int[] security, int time) {
      List<Integer> resList = new ArrayList<>();
      int len = security.length;
      int[] pre = new int[len];
      int[] next = new int[len];
      for(int i = 1; i < len; i++){
          if(security[i-1] >= security[i]){
              pre[i] = pre[i-1] + 1;
          }
      }
      for(int i = len - 1; i > 0; i--){
          if(security[i] >= security[i-1]){
              next[i-1] = next[i] + 1;
          }
      }

      for(int i = time; i < len - time; i++){
          if(time <= pre[i] && time <= next[i]){
              resList.add(i);
          }
      }
      return resList;
    }
}

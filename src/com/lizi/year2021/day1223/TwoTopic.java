package com.lizi.year2021.day1223;

import java.util.Stack;

/**
 * @author lizi
 * @description TODO
 * @date 2021/12/23 19:44
 **/
public class TwoTopic {
    public static void main(String[] args) {
        validateStackSequences(new int[]{4,0,1,2,3},new int[]{4,2,3,0,1});
    }
    public static boolean validateStackSequences(int[] pushed, int[] popped) {
        Stack<Integer> stackOne = new Stack<>();
        int idxPushed = 0;
        int idxPopped = 0;
           while(idxPopped < popped.length){
               if(pushed[idxPushed] == popped[idxPopped]){
                   idxPopped++ ;
                   idxPushed++ ;
               }else{
                   while(idxPopped < popped.length){
                       if(!stackOne.isEmpty() && stackOne.peek() == popped[idxPopped]){
                           idxPopped++;
                           stackOne.pop();
                       }else if(idxPushed < pushed.length){
                           stackOne.push(pushed[idxPushed]);
                           idxPushed++;
                       }else{
                           break;
                       }
                   }
                   break;
               }
           }
        if(stackOne.isEmpty()){
            return true;
        }
        return false;
    }
}

package com.lizi.year2022.month4.day0416;

import java.util.*;

/**
 * @author lizi
 * @description TODO
 * @date 2022/4/16 23:20
 **/
class ATM {

    public static void main(String[] args) {
        ATM obj = new ATM();
        obj.deposit(new int[]{0,0,1,2,1});
        obj.withdraw(600);
        obj.deposit(new int[]{0,1,0,1,1});
        obj.withdraw(600);
        obj.withdraw(550);

    }

    int[] withdrawArr = new int[]{20,50,100,200,500};
    Map<Integer, Integer> drawMap = new HashMap<>();
    int[] money = new int[5];
    public ATM() {
        drawMap.put(20,0);
        drawMap.put(50,1);
        drawMap.put(100,2);
        drawMap.put(200,3);
        drawMap.put(500,4);
    }

    public void deposit(int[] banknotesCount) {
        for (int i = 0; i < banknotesCount.length; i++) {
          money[i] += banknotesCount[i];
        }

    }

    public int[] withdraw(int amount) {
        List<Integer> list = new LinkedList<>();
        int[] tempArr = Arrays.copyOf(money, money.length);
        int[] ans = new int[5];
        int idx = 4;
        while(amount > 0 && idx >= 0){
            if(money[idx] > 0 && withdrawArr[idx] <= amount){
                list.add(withdrawArr[idx]);
                money[idx]-- ;
                amount -= withdrawArr[idx];
            }else{
                idx--;
            }
        }
        if(amount != 0){
            money = Arrays.copyOf(tempArr, tempArr.length);
            return new int[]{-1};
        }
        for (int i = 0; i < ans.length; i++) {
            ans[i] = money[i] - tempArr[i];
        }
        return ans;
    }

}
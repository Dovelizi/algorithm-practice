package com.lizi.year2022.month8.day0818;

import java.util.Arrays;

/**
 * @author lizi
 * @description TODO
 * @date 2022/8/18 15:30
 **/
public class Two0818 {
    public volatile int inc = 0;
    public void increase(){
        inc++;
    }
    public static void main(String[] args) {
        int[] array = new int[9];
        Arrays.copyOfRange(array, 5, 9);

       final Two0818 two0818 = new Two0818();
        for (int i = 0; i < 10; i++) {
            new Thread(){
                @Override
                public void run() {
                    for (int j = 0; j < 1000; j++) {
                        two0818.increase();
                    }
                };
            }.start();
        }
        while(Thread.activeCount() > 1){
            Thread.yield();
        }
        System.out.println(two0818.inc);
    }
}

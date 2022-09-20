package com.lizi.common;

import java.util.ArrayList;
import java.util.List;

/**
 * @author lizi
 * @description TODO
 * @date 2021/12/27 16:42
 **/
public class SuShu {
    /**
    素数筛法，是一种快速“筛”出2~n之间所有素数的方法。朴素的筛法叫埃氏筛（the Sieve ofEratosthenes，埃拉托色尼筛），它的过程是这样的：

    我们把2~n的数按顺序写出来：
    2 3 4 5 6 7 8 9 10 11 12 13 14 15 16

    从前往后看，找到第一个未被划掉的数，2，这说明它是质数。然后把2的倍数（不包括2）划掉：
    2 3 5 7 9 11 13 15

    下一个未被划掉的数是3，它是质数，把3的倍数划掉：
    2 3 5 7 11 13

    接下来应该是5，但是5已经超过 [公式] 了，所以遍历结束，剩下未被划掉的都是素数：
    2 3 5 7 11 13
     **/
    public static List<Integer> primes = new ArrayList<>();

    public static void main(String[] args) {
        initPrimes(50000);
    }

    public static void initPrimes(int n){
        boolean[] primesFlag = new boolean[n+1];
        for (int i = 2; i <= n; i++) {
            if(!primesFlag[i]){
                primes.add(i);
            }
            for(int num : primes){
                if(num * i > n){
                    break;
                }
                primesFlag[num * i] = true;
                if(i % num == 0){
                    break;
                }
            }
        }
    }


}

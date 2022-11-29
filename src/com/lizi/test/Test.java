package com.lizi.test;

/**
 * @author lizi
 * @description TODO
 * @date 2022/8/22 13:47
 **/
public class Test {
    public static void main(String[] args) {
        String s1 = "aaa";
        String s2 = "bbb";
        String s3 = "aaabbb";
        String s4 = "aaa" + "bbb";
        String s5 = s1 + "bbb";
        String s6 = "aaa" + s2;
        String s7 = s1 + s2;
        String s8 = new String("aaa") + new String("bbb");
        //常量拼接
        System.out.println(s3 == s4);	//true

        //至少含一个变量的拼接
        System.out.println(s3 == s5);	//false
        System.out.println(s3 == s6);	//false
        System.out.println(s3 == s7);	//false
        System.out.println(s3 == s8);	//false

        String s = new String("1");
        s.intern();//调用此方法之前，字符串常量池中已经存在了“1”
        String s00 = "1";
        System.out.println(s == s00);//jdk6:false jdk7/8:false

//        String s = new String("a") + new String("b");//new String("ab")
//        String s2 = s.intern();//jdk6中，在串池中创建一个字符串“ab”
//        //jdk7/8中，串池中没有创建字符串“ab”，而是创建一个引用，指向new String("ab")
//        String s3 = "ab";
//        System.out.println(s2==s3);//jdk6:true  jdk8:true
//        System.out.println(s==s3);//jdk6:false  jdk8:true
    test(new int[]{5,1,4,4,3,9}, 3);
    }
    public static int test(int[] nums, int k){
        int[] arr = new int[20001];
        int len = nums.length;
        // 题目中最大为 |10e4|
        int flag = 10000;
        for (int n : nums){
            // 给每个值计数
            arr[n + flag]++ ;
        }
        for(int i = arr.length- 1; i >= 0; i--){
            if(arr[i] == 0){
                continue;
            }
            // 从最大的数的个数一直往前面减（可能存在多个一样的值 所以这里要减对应的数组中的值 而不是自减）
            k -= arr[i];
            if(k <= 0){
                return i - flag;
            }
        }
        return 0;
    }
}


package com.lizi.year2023.month6;

import java.util.*;

/**
 * @author lizi
 * @since 2023-07-10
 **/
public class Two0710 {

    public static void main(String[] args) {
//        int[][] arr = new int[][]{{2,1,3},{6,5,4}, {7,8,9}};
//        letterCombinations("23");
//        int[][] fx = new int[][]{{0, 1}, {1, 0}, {0, -1}, {-1, 0}};
//        int[] fx1 = fx[0];
////        insertionSort(new int[]{1,5,4,2,3});
////        int sum = Arrays.stream(new int[]{1, 5, 4, 2, 3}).sum();
//        halveArray(new int[]{1,1,1,1,1,1,1});
//        Map<Integer, Integer> map = new HashMap<>();
//
//        StringBuilder stringBuilder = new StringBuilder();
//        List<Integer> list = new ArrayList<>();
//        Set<String> set = new HashSet<>();
//        Iterator<String> iterator = set.iterator();
//        Integer n = map.getOrDefault(0, null);
//        //canChange("_L", "LL");
//        map.compute(3, (k, v) -> v + 1);
//        System.out.println();
        int a = 3;
        a -= 2 - 1;
        Deque<Integer> deque = new LinkedList<>();
        System.out.println(a);
    }

    public int minAbsoluteDifference(List<Integer> nums, int x) {
        int ans = 0;
        int len = nums.size();
        while (true) {
            for (int i = 0; i < len - x; i++) {
                List<Integer> tempList = nums.subList(i + x, len);
                if (tempList.contains(nums.get(i) + ans) || tempList.contains(nums.get(i) - ans)) {
                    return ans;
                }
            }
            ans++;
        }
    }
    public static int halveArray(int[] nums) {
        int ans = 0;
        double sum = Arrays.stream(nums).sum();
        PriorityQueue<Double> queue = new PriorityQueue<>(Comparator.reverseOrder());
        double halfSum = sum / 2.0;
        for(int num : nums){
            queue.offer((double) num);
        }
        while(!queue.isEmpty()){
            double temp = queue.poll();
            System.out.println(sum + " " + temp);
            if(sum <= halfSum){
                break ;
            }
            double halfTemp = temp / 2.0;
            System.out.println(" halfTemp " + halfTemp + "temp" + temp);
            sum -= halfTemp;
            queue.offer(halfTemp);
            ans++ ;
        }
        return ans;
    }
    public static void insertionSort(int[] arr){
        for( int i = 1; i < arr.length; i++ ) {
            int temp = arr[i];    // 取出下一个元素，在已经排序的元素序列中从后向前扫描
            for( int j = i; j >= 0; j-- ) {
                if( j > 0 && arr[j-1] > temp ) {
                    arr[j] = arr[j-1];    // 如果该元素（已排序）大于取出的元素temp，将该元素移到下一位置
                    System.out.println("Temping:  " + Arrays.toString(arr));
                } else {
                    // 将新元素插入到该位置后
                    arr[j] = temp;
                    System.out.println("Sorting:  " + Arrays.toString(arr));
                    break;
                }
            }
        }
    }

   static List<String> wordList = Arrays.asList("", "", "abc", "def", "ghi", "jkl", "mno", "pqrs", "tuv", "wxyz");
    public static List<String> letterCombinations(String digits) {
        List<String> ans = new ArrayList<>();

        if(digits.length() == 0){
            return ans;
        }
        findCom(digits, ans, wordList, new StringBuilder(), 0);
        return ans;
    }

    public static void findCom(String digits, List<String> ans, List<String> wordList, StringBuilder str, int idx){
        if(idx == digits.length()){
            ans.add(str.toString());
        }else{
            String word = wordList.get(digits.charAt(idx) - '0');
            int len  = word.length();
            for(int i = 0; i < len; i++){
                str.append(word.charAt(i));
                findCom(digits, ans, wordList, str, idx + 1);
                str.deleteCharAt(idx);
            }
        }
    }

    public static boolean canChange(String start, String target) {
        int sp = 0, tp = 0;
        int len = start.length();
        while(sp < len && tp < len){
            while(sp < len && start.charAt(sp) == '_'){
                sp++ ;
            }
            while(tp < len && target.charAt(tp) == '_'){
                tp++ ;
            }
            if(sp == tp && sp == len){
                return true;
            }
            if(sp < len && tp < len && start.charAt(sp) == target.charAt(tp)){
                if((start.charAt(sp) == 'L' && sp >= tp) || (start.charAt(sp) == 'R' && sp <= tp)){
                    sp++ ;
                    tp++ ;
                }else{
                    return false;
                }
            }else{
                return false;
            }
        }
        return true;
    }
}

package com.lizi.year2023.month2.day07;

import java.util.Arrays;

/**
 * @author lizi
 * @date 2023/2/8 10:19
 * @description TODO
 **/
public class Two0207 {
    public static void quickSort(int[] array, int low, int high) {
        if (array == null || array.length == 0) {
            return;
        }

        if (low >= high) {
            return;
        }

        int middle = low + (high - low) / 2;
        int pivot = array[middle];

        int i = low, j = high;
        while (i <= j) {
            while (array[i] < pivot) {
                i++;
            }

            while (array[j] > pivot) {
                j--;
            }

            if (i <= j) {
                int temp = array[i];
                array[i] = array[j];
                array[j] = temp;
                i++;
                j--;
            }
        }

        if (low < j) {
            quickSort(array, low, j);
        }

        if (high > i) {
            quickSort(array, i, high);
        }
    }

    public static void main(String[] args) {
        int[] array = {9, 8, 7, 6, 5, 4, 3, 2, 1};
        quickSort(array, 0, array.length - 1);
        System.out.println(Arrays.toString(array));
    }
}

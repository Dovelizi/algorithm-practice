package com.lizi.year2023.month4;

import java.util.Arrays;

/**
 * @author lizi
 * @since 2023-04-23
 **/
public class One0423 {
    public static void main(String[] args) {
        int[][] arr = {{1,2}, {4,0}};
        Arrays.stream(arr)
                .mapToInt(row -> row[0])
                .sum();
    }
}

package com.javacodingchallenges.leetcode.sorting;

import java.util.Arrays;
import java.util.stream.IntStream;

public class DeleteGreatestValueInEachRow {
    public static void main(String[] args) {
        int[][] nums = {{1, 2, 4}, {3, 3, 1}};
        System.out.println(deleteGreatestValue(nums)); // 8

    }


    public static int deleteGreatestValue(int[][] grid) {
        int count = 0;
        for ( int i = 0; i < grid.length; i++ ) {
            int[] elementArray = grid[i];
            int max = Arrays.stream(elementArray).max().getAsInt();
//            IntStream.range(0, elementArray.length)
//                            .filter(i -> i)
            System.out.println( "max is " + max);

        }

        return count;
    }

}

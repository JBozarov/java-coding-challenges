package com.javacodingchallenges.leetcode.binary_search;

public class CountNegativeNumbersInASortedMatrix {
    public static void main(String[] args) {
        int[][] grid = {{4, 3, 2, -1}, {3, 2, 1, -1}, {1, 1, -1, -2}, {-1, -1, -2, -3}};
        System.out.println(countNegatives(grid));

    }

    public static int countNegatives(int[][] grid) {
        int count = 0;
        for (int i = 0; i < grid.length; i++ ) {
            int[] currentArray = grid[i];
            for (int k = 0; k < currentArray.length; k++ ) {
                if (currentArray[k] < 0) {
                    count++;
                }
            }
        }
        return count;
    }
}

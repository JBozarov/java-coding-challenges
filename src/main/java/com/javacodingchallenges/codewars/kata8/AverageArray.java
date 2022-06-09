package com.javacodingchallenges.codewars.kata8;

import java.util.Arrays;

public class AverageArray {
    public static void main(String[] args) {
        int[] arrOne = {1
                , 2, 3, 4};
        int[] arrTwo = {5, 6, 7, 8};

        System.out.println(Arrays.toString(averageArray(arrOne, arrTwo)));
    }

    private static int[] averageArray(int[] arrOne, int[] arrTwo) {
        int[] result = new int[arrOne.length];
        for (int i = 0; i < arrOne.length; i++ ) {
            result[i] = ( arrOne[i] + arrTwo[i] ) / 2;
        }
        return result;
    }
}

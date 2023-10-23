package com.javacodingchallenges.javascriptinjava;

import java.util.Arrays;

public class AverageArray {
    public static void main(String[] args) {
        int[] arr1 = {1, 2, 3, 4};
        int[] arr2 = {5, 6, 7, 8};
        int[] average = averageArr(arr1, arr2);
        System.out.println(Arrays.toString(average));
    }

    private static int[] averageArr(int[] arr1, int[] arr2) {
        int[] result = new int[arr1.length];
        for ( int i = 0; i < arr1.length; i++ ) {
            result[i] = ( arr1[i] + arr2[i] ) / 2;
        }
        return result;
    }
}

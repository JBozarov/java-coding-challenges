package com.javacodingchallenges.leetcode.binary_search;

import java.util.Arrays;

public class FindTheDistanceValueBetweenTwoArrays {
    public static void main(String[] args) {
        int[] arr1 = {4, 5, 8}, arr2 = {10, 9, 1, 8};
        System.out.println(findTheDistanceValue(arr1, arr2, 2));

        int[] arr3 = {1, 4, 2, 3}, arr4 = {-4, -3, 6, 10, 20, 30};
        System.out.println(findTheDistanceValue(arr3, arr4, 3));
    }

    public static int findTheDistanceValue(int[] arr1, int[] arr2, int d) {
        int count = 0;
        for (int i = 0; i < arr1.length; i++ ) {
            boolean isBroker = false;
            for ( int k = 0; k < arr2.length; k++ ) {
                int currDiff = Math.abs(arr1[i] - arr2[k]);
                if (currDiff <= d ) {
                    isBroker = true;
                }
            }
            if (!isBroker) {
                count++;
            }
        }
        return count;
    }
}

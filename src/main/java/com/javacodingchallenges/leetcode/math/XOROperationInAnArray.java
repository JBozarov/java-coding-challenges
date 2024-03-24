package com.javacodingchallenges.leetcode.math;

import java.util.Arrays;

public class XOROperationInAnArray {
    public static void main(String[] args) {
        System.out.println(xorOperation(5, 0));
        System.out.println(xorOperation(4, 3));

        System.out.println(3 ^ 3 ^ 5 ^ 7 ^ 9);
    }


    public static int xorOperation(int n, int start) {
        int[] arr = new int[n];
        for ( int i = 0; i < arr.length; i++ ) {
            arr[i] = start + 2 * i;
        }

        int result = arr[0];

        for ( int k = 1; k < arr.length; k++ ) {
            result = result ^ arr[k];
        }

        return result;
    }
}

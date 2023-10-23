package com.javacodingchallenges.leetcode.array;

import java.util.Arrays;

public class DecodeXORedArray {
    public static void main(String[] args) {

        // Note: https://github.com/jbozarov/java-notes/blob/master/bitwise/bitwise_operators.java#L23

        int[] arr = {1, 2, 3};
        System.out.println(Arrays.toString(decode(arr, 1)));  // [1, 0, 2, 1]

        int[] arr2 = {6, 2, 7, 3};
        System.out.println(Arrays.toString(decode(arr2, 4))); // [4, 2, 0, 7, 4]
    }

    public static int[] decode(int[] encoded, int first) {
        int[] result = new int[encoded.length + 1];
        result[0] = first;
        for ( int i = 0; i < encoded.length; i++ ) {
            result[i+1] = result[i]^encoded[i];
        }
        return result;
    }
}

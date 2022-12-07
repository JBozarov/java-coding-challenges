package com.javacodingchallenges.leetcode.array;

import java.util.Arrays;

public class CheckIfTwoStringArraysAreEquivalent {
    public static void main(String[] args) {
        String[] word1 = {"ab", "c"};
        String[] word2 = {"a", "bc"};
        System.out.println(arrayStringsAreEqual(word1, word2)); // true

        String[] word3 = {"abc", "d", "defg"};
        String[] word4 = {"abcddefg"};
        System.out.println(arrayStringsAreEqual(word3, word4)); // true
    }

    public static boolean arrayStringsAreEqual(String[] word1, String[] word2) {
        return Arrays.stream(word1).reduce("", (subtotal, element) -> subtotal + element).equals(Arrays.stream(word2).reduce("", (subtotal, element) -> subtotal + element));
    }
}

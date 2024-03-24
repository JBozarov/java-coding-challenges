package com.javacodingchallenges.leetcode.string;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class ShuffleString {
    public static void main(String[] args) {
        String s = "codeleet";
        int[] indices = { 4, 5, 6, 7, 0, 2, 1, 3 };
        System.out.println(restoreString(s, indices)); // leetcode

        String s1 = "abc";
        int[] indices1 = {0, 1, 2 };
        System.out.println(restoreString(s1, indices1)); // abc
    }


    public static String restoreString(String s, int[] indices) {
        StringBuilder result = new StringBuilder("");
        List<Integer> integerList = Arrays.stream(indices).boxed().collect(Collectors.toList());
        for (int i = 0; i < indices.length; i++ ) {
            int current = integerList.indexOf(i);
            result.append(s.charAt(current));
        }
        return result.toString();
    }
}

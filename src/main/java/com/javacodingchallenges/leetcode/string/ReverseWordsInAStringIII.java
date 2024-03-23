package com.javacodingchallenges.leetcode.string;

import java.util.Arrays;
import java.util.stream.Collectors;

public class ReverseWordsInAStringIII {
    public static void main(String[] args) {
        String s = "Let's take LeetCode contest";
        System.out.println(reverseWords(s)); // s'teL ekat edoCteeL tsetnoc

        String s2 = "God Ding";
        System.out.println(reverseWords(s2)); // doG gniD
    }

    public static String reverseWords(String s) {
        return String
                .join(" ", Arrays.stream(s.split(" "))
                .map(v -> new StringBuilder(v).reverse().toString())
                .collect(Collectors.toList()));
    }
}

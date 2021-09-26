package com.javacodingchallenges.leetcode;

import java.util.Arrays;

public class LongestCommonPrefix {
    public static void main(String[] args) {
        String[] strs = {"flower", "flow", "flight"};
        System.out.println(longestCommonPrefix(strs));
    }

    private static String longestCommonPrefix(String[] strs) {

        String shortest = Arrays.asList(strs)
                .stream()
                .sorted(( v1, v2 ) -> v1.length() > v2.length() ? 1 : -1)
                .findFirst()
                .get();

        for (int i = 0; i < shortest.length(); i ++ ) {
            for (String s : strs) {
                char c = s.charAt(i);
                System.out.println(s);
            }
        }


        return shortest;
    }
}

package com.javacodingchallenges.leetcode.general;

import java.util.*;

public class LongestCommonPrefix {
    public static void main(String[] args) {
        String[] strs = {"flower", "flow", "flight"};
        System.out.println(longestCommonPrefix(strs));

        String[] sec = {"cir", "car"};
        System.out.println(longestCommonPrefix(sec));
    }

    private static String longestCommonPrefix(String[] strs) {
        int shortestWordLength = Arrays.asList(strs)
                .stream()
                .sorted(( v1, v2 ) -> v1.length() > v2.length() ? 1 : -1)
                .findFirst()
                .get().length();

        StringBuilder result = new StringBuilder("");
        for (int i = 0; i < shortestWordLength; i ++ ) {
            Set<Character> characterSet = new HashSet<>();
            for (String s : strs) {
                characterSet.add(s.charAt(i));
            }
            if (characterSet.size() == 1) {
                result.append(strs[0].charAt(i));
            } else {
                break;
            }
        }
        return result.toString();
    }
}

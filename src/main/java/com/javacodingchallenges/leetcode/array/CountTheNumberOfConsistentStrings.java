package com.javacodingchallenges.leetcode.array;

import java.util.*;

public class CountTheNumberOfConsistentStrings {
    public static void main(String[] args) {
        String[] words = {"ad", "bd", "aaab", "baa", "badab"};
        System.out.println(countConsistentStrings("ab", words));

        String[] words2 = {"cc", "acd", "b", "ba", "bac", "bad", "ac", "d"};
        System.out.println(countConsistentStrings("cad", words2));

    }

    public static int countConsistentStrings(String allowed, String[] words) {

        int count = 0;
        char[] allowedChars = allowed.toCharArray();
        List<Character> characterList = new ArrayList<>();
        for (char c : allowedChars) {
            characterList.add(c);
        }
        for (int i = 0; i < words.length; i++) {
            char[] temp = words[i].toCharArray();
            int singleLength = 0;
            for (char c : temp) {
                if (characterList.contains(c)) {
                    singleLength++;
                }
            }
            if (singleLength == temp.length) {
                count++;
            }
        }
        return count;
    }
}

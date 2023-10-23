package com.javacodingchallenges.leetcode.hash_table_sorting;

import java.util.*;

public class CheckIfAllCharactersHaveEqualNumberOfOccurrences {
    public static void main(String[] args) {
        System.out.println(areOccurrencesEqual("abacbc")); // true
        System.out.println(areOccurrencesEqual("aaabb")); // false

        String s = "mmmccmcccccmcccccmmmcmccmmccccmmmcmmcmcmcmcmmmmmmmmmcccmmcmmmcmmcmcmcmmmcmmmcmmccccmcmccmmcmccmmmcmmccccmcmmccmcmmcccmmcmmcmmcmccmmccmcmmcmmccmmccmcccmmcccmmcccccmcmmmmcmccmmmmmmcmmccmccmmcccccccccmcccmmmccmmccccmmcmcmcmcmmcmmcmcmcmccccmmcccmmmccmmcmmmcmmmcmccccmcmcccmmccmm";
        System.out.println(areOccurrencesEqual(s)); //
    }

    public static boolean areOccurrencesEqual(String s) {
        Map<Character, Integer> map = new HashMap<>();
        for (char c : s.toCharArray()) {
            if (map.containsKey(c)) {
                map.put(c, map.get(c) + 1);
            } else {
                map.put(c, 1);
            }
        }

        Set<Integer> resultSet = new HashSet<>();
        for (Map.Entry<Character, Integer> entry : map.entrySet()) {
            resultSet.add(entry.getValue());
        }
        return resultSet.size() == 1;
    }
}

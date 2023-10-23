package com.javacodingchallenges.leetcode.hash_table_sorting;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;

public class RingsAndRods {
    public static void main(String[] args) {
        System.out.println(countPoints("B0B6G0R6R0R6G9")); // 1
        System.out.println(countPoints("B0R0G0R9R0B0G0")); // 1
        System.out.println(countPoints("G4")); // 0

    }

    public static int countPoints(String rings) {
        int count = 0;
        char[] chars = rings.toCharArray();
        Map<String, Set<Character>> stringSetMap = new HashMap<>();

        for (int i = 1; i < chars.length; i+=2 ) {
            String currentKey = String.valueOf(chars[i]);
            char currentValue = chars[i-1];
            if (stringSetMap.containsKey(currentKey)) {
                Set<Character> currentValues = stringSetMap.get(currentKey);
                currentValues.add(currentValue);
                stringSetMap.put(currentKey, currentValues);
            } else {
                Set<Character> newSet = new HashSet<>();
                newSet.add(currentValue);
                stringSetMap.put(currentKey, newSet);
            }
        }
        for (Map.Entry<String, Set<Character>> entry : stringSetMap.entrySet()) {
            if (entry.getValue().size() == 3) {
                count++;
            }
        }
        return count;
    }
}

package com.javacodingchallenges.leetcode.string;

import java.util.Arrays;

public class CountAsterisks {
    public static void main(String[] args) {
        System.out.println(countAsterisks("l|*e*et|c**o|*de|"));  // 2
        System.out.println(countAsterisks("iamprogrammer"));    // 0
        System.out.println(countAsterisks("yo|uar|e**|b|e***au|tifu|l")); // 5
        System.out.println(countAsterisks("*jsaxclgfcyjds")); // 1
    }

    private static int countAsterisks(String s) {
        int count = 0;
        if (!s.contains("|")) {
            for (int i = 0; i < s.length(); i++) {
                if (String.valueOf(s.charAt(i)).equals("*")) {
                    count++;
                }
            }
            return count;
        }

        String[] array = s.split("\\|");
        for (int i = 0; i < array.length; i += 2) {
            String currentElement = array[i];
            for (int k = 0; k < currentElement.length(); k++) {
                if (String.valueOf(currentElement.charAt(k)).equals("*")) {
                    count++;
                }
            }
        }
        return count;
    }
}

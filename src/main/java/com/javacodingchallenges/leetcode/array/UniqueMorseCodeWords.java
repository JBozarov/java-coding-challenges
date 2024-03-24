package com.javacodingchallenges.leetcode.array;

import java.util.HashSet;
import java.util.Set;

public class UniqueMorseCodeWords {
    public static void main(String[] args) {
        String[] words = {"gin", "zen", "gig", "msg"};
        String[] words2 = {"a"};

        System.out.println(uniqueMorseRepresentations(words)); // 2
        System.out.println(uniqueMorseRepresentations(words2)); // 1

        System.out.println("a".hashCode());
        System.out.println((int) 'a');
    }

    public static int uniqueMorseRepresentations(String[] words) {
        String[] morseCode = {".-", "-...", "-.-.", "-..", ".", "..-.", "--.", "....", "..",
                ".---", "-.-", ".-..", "--", "-.", "---", ".--.", "--.-", ".-.", "...", "-",
                "..-", "...-", ".--", "-..-", "-.--", "--.."};
        Set<String> transformations = new HashSet<>();
        for ( int i = 0; i < words.length; i++ ) {
            StringBuilder temp = new StringBuilder("");
            for (char c : words[i].toCharArray()) {
                temp.append(morseCode[(int) c - 97]);
            }
            transformations.add(temp.toString());
        }
        return transformations.size();
    }
}

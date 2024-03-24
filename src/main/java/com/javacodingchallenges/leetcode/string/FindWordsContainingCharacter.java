package com.javacodingchallenges.leetcode.string;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class FindWordsContainingCharacter {
    public static void main(String[] args) {

        String[] words = {"leet","code"};
        System.out.println(Arrays.toString(findWordsContaining(words, 'e').toArray()));


        String[] words2 = {"abc","bcd","aaaa","cbc"};
        System.out.println(Arrays.toString(findWordsContaining(words2, 'a').toArray()));
    }


    public static List<Integer> findWordsContaining(String[] words, char x) {
        List<Integer> result = new ArrayList<>();
        for (int i = 0; i < words.length; i++) {
            if (words[i].contains(String.valueOf(x))) {
                result.add(i);
            }
        }

        return result;

    }
}

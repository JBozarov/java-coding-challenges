package com.javacodingchallenges.leetcode.string;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class LengthOfLastWord {
    public static void main(String[] args) {
        String s = "Hello World";
        String s1 = "   fly me   to   the moon  ";
        String s2 = "luffy is still joyboy";

        System.out.println(lengthOfLastWord(s)); // 5
        System.out.println(lengthOfLastWord(s1)); // 4
        System.out.println(lengthOfLastWord(s2)); // 6
    }

    public static int lengthOfLastWord(String s) {
        List<String> words = Arrays.stream(s.split(" ")).collect(Collectors.toList());
        return words.get(words.size()-1).length();
    }
}

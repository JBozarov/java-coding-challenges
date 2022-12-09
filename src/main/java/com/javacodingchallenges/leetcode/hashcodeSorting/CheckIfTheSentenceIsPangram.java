package com.javacodingchallenges.leetcode.hashcodeSorting;

import java.util.*;

public class CheckIfTheSentenceIsPangram {
    public static void main(String[] args) {
        System.out.println(checkIfPangram("thequickbrownfoxjumpsoverthelazydog")); // true
        System.out.println(checkIfPangram("leetcode")); // false
    }

    public static boolean checkIfPangram(String sentence) {
        char[] chars = sentence.toCharArray();
        Arrays.sort(chars);
        Set<Character> characterSet = new HashSet<>();
        for (char c : chars) {
            characterSet.add(c);
        }
        return characterSet.size() == 26;
    }
}

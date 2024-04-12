package com.javacodingchallenges.leetcode.hash_table_sorting;

public class MaximumNumberOfWordsYouCanType {
    public static void main(String[] args) {

        System.out.println(canBeTypedWords("hello world", "ad")); // 1
        System.out.println(canBeTypedWords("leet code", "lt"));   // 1
        System.out.println(canBeTypedWords("leet code", "e"));    // 0

    }


    public static int canBeTypedWords(String text, String brokenLetters) {
        int count = 0;
        for (String word : text.split(" ")) {
            boolean unbroken = true;
            for (char singleChar : brokenLetters.toCharArray()) {
                if (word.contains(String.valueOf(singleChar))) {
                    unbroken = false;
                }
            }
            if (unbroken) {
                count++;
            }
        }
        return count;
    }
}

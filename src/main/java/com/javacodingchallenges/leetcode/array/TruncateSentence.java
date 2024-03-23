package com.javacodingchallenges.leetcode.array;

public class TruncateSentence {
    public static void main(String[] args) {
        String s = "Hello how are you Contestant";
        System.out.println(truncateSentence(s, 4)); // Hello how are you
    }

    public static String truncateSentence(String s, int k) {
        StringBuilder stringBuilder = new StringBuilder();
        String[] words = s.split(" ");
        for (int i = 0; i < k; i++) {
            if (i == k - 1) {
                stringBuilder.append(words[i]);
            } else {
                stringBuilder.append(words[i] + " ");
            }
        }
        return stringBuilder.toString();
    }
}

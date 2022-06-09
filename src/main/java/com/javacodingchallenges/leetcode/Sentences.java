package com.javacodingchallenges.leetcode;

public class Sentences {
    public static void main(String[] args) {
        String[] sentences = {"alice and bob love leetcode", "i think so too", "this is great thanks very much"};
        System.out.println(mostWordsFound(sentences)); // 6
    }

    public static int mostWordsFound(String[] sentences) {
        int max = 0;
        for (int i = 0; i < sentences.length; i++ ) {
            int curLen = sentences[i].split(" ").length;
            if (curLen > max) {
                max = curLen;
            }
        }
        return max;
    }
}

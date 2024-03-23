package com.javacodingchallenges.leetcode.hash_table_sorting;

import java.util.*;

public class DecodeTheMessage {

    public static void main(String[] args) {

        String key = "the quick brown fox jumps over the lazy dog";
        String message = "vkbs bs t suepuv";
        System.out.println(decodeMessage(key, message));

        String key2 = "eljuxhpwnyrdgtqkviszcfmabo";
        String message2 = "zwx hnfx lqantp mnoeius ycgk vcnjrdb";
        System.out.println(decodeMessage(key2, message2));

    }


    public static String decodeMessage(String key, String message) {
        char[] chars = Arrays.stream(key.split(" ")).reduce("", (a, b) -> a + b).toCharArray();
        // chars [t, h, e, q, u, i, c, k, b, r, o, w, n, f, o, x, j, u, m, p, s, o, v, e, r, t, h, e, l, a, z, y, d, o, g]

        List<Character> alphabetList = new ArrayList<>();
        for (char c : chars) {
            if (!alphabetList.contains(c)) alphabetList.add(c);
        }
        // alphabetList [t, h, e, q, u, i, c, k, b, r, o, w, n, f, x, j, m, p, s, v, l, a, z, y, d, g]

        StringBuilder result = new StringBuilder("");
        for (int i = 0; i < message.length(); i++) {
            if (message.charAt(i) == ' ') {
                result.append(" ");
            } else {
                result.append((char) (97 + alphabetList.indexOf(message.charAt(i))));
            }
        }
        return result.toString();
    }
}

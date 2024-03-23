package com.javacodingchallenges.leetcode.string;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class JewelsAndStones {
    public static void main(String[] args) {
        String jewels = "aA";
        String stones = "aAAbbbb";
        System.out.println(numJewelsInStones(jewels, stones)); // 3

        String  jewels2 = "z";
        String stones2 = "ZZ";
        System.out.println(numJewelsInStones(jewels2, stones2)); // 0
    }

    public static int numJewelsInStones(String jewels, String stones) {
        List<String> jewelsChars = Arrays.stream(jewels.split("")).collect(Collectors.toList());
        int count = 0;
        for ( int i = 0; i < stones.length(); i++ ) {
            if ( jewelsChars.contains(String.valueOf(stones.charAt(i))) ) {
                count++;
            }
        }
        return count;
    }
}

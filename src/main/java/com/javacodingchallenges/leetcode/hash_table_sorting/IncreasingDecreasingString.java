package com.javacodingchallenges.leetcode.hash_table_sorting;

import java.util.Arrays;
import java.util.HashSet;
import java.util.List;
import java.util.Set;
import java.util.stream.Collectors;

public class IncreasingDecreasingString {
    public static void main(String[] args) {
        String s = "aaaabbbbcccc";
        //System.out.println(sortString(s)); // abccbaabccba

        String s2 = "rat";
        //System.out.println(sortString(s2)); // art

        String leetcode = "leetcode";
        System.out.println(sortString(leetcode)); // expected: cdelotee got ctdelo
    }

    public static String sortString(String s) {
        Set<String> set = new HashSet<>();
        for (Character c : s.toCharArray()) {
            set.add(c.toString());
        }

        int iteration = s.length() / set.size();

        StringBuilder stringBuilder = new StringBuilder("");
        String setString = String.join("", set);
        for (int i = 0; i < iteration; i++ ) {
            if ( i % 2 == 0) {
                stringBuilder.append(setString);
            } else if (i % 2 != 0) {
                stringBuilder.append(new StringBuilder(setString).reverse());
            }
        }

        return stringBuilder.toString();
    }
}

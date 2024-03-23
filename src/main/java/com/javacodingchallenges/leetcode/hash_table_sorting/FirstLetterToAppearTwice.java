package com.javacodingchallenges.leetcode.hash_table_sorting;

public class FirstLetterToAppearTwice {
    public static void main(String[] args) {
        String s = "abccbaacz";
        System.out.println(repeatedCharacter(s));

        String s2 = "abcdd";
        System.out.println(repeatedCharacter(s2));
    }


    public static char repeatedCharacter(String s) {
        for (int i = 0; i < s.length(); i++ ) {
            String subString = s.substring(0, i);
            if (subString.contains(String.valueOf(s.charAt(i)))) {
                return s.charAt(i);
            }
        }
        return 'a';
    }

}

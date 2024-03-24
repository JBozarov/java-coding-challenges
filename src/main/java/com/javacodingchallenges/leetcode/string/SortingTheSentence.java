package com.javacodingchallenges.leetcode.string;

import java.util.Arrays;

public class SortingTheSentence {
    public static void main(String[] args) {
        String s = "is2 sentence4 This1 a3";
        System.out.println(sortSentence(s)); // This is a sentence

        String s2 = "Myself2 Me1 I4 and3";
        System.out.println(sortSentence(s2)); // Me Myself and I
    }

    public static String sortSentence(String s) {
        String[] stringArray = s.split(" ");
        String[] result = new String[stringArray.length];
        for ( int i = 0; i < stringArray.length; i++ ) {
            String currentElement = stringArray[i];
            int orderNumber = Integer.parseInt(String.valueOf(currentElement.charAt(currentElement.length() - 1)));
            String subString = currentElement.substring(0, currentElement.length() - 1);
            result[orderNumber -1] = subString;
        }
        return String.join(" ", result);
    }
}

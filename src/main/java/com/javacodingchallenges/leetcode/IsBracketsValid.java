package com.javacodingchallenges.leetcode;

import java.util.HashMap;
import java.util.Map;
import java.util.Stack;

public class IsBracketsValid {
    public static void main(String[] args) {
        System.out.println(isValid("(([]))"));
        System.out.println(isValid("(]"));
        System.out.println(isValid("()[]{}"));
        System.out.println(isValid("()"));
    }

    private static boolean isValid(String s) {
        if (s.length() % 2 == 1) {
            System.out.println("odd " + s);
            return false;
        } else {
            String partOne = s.substring(0, s.length()/2);
            String partTwo = s.substring(s.length()/2);
            String reversedTwo = new StringBuilder(partTwo).reverse().toString();
            System.out.println("1: " + partOne + " 2: " + partTwo + " 3: " + reversedTwo);
            if (partOne.equals(reversedTwo) || partOne.equals(partTwo)) {
                System.out.println(" hit " + s);
                return true;
            }
        }


        Stack<String> stack = new Stack<>();
        Map<String, String> map = new HashMap<>();
        map.put(")", "(");
        map.put("]", "[");
        map.put("}", "{");

        String[] chars = s.split("");
        for (String c : chars) {
            
        }
        return false;
    }
}

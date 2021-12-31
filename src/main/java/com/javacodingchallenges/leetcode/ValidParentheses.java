package com.javacodingchallenges.leetcode;

import java.util.Stack;

public class ValidParentheses {
    public static void main(String[] args) {
        String s1 = "()";
        String s2 = "()[]{}";
        String s3 = "(]";
        String s4 = "()[]{}";
        String s5 = "[([{}])]";
        String s6 = "[([{}])}";
        String s7 = "){";
        String s8 = "(){}}{";


        System.out.println(isValid(s1)); // true
        System.out.println(isValid(s2)); // true
        System.out.println(isValid(s3)); // false
        System.out.println(isValid(s4)); // true
        System.out.println(isValid(s5)); // true
        System.out.println(isValid(s6)); // false
        System.out.println(isValid(s7)); // false
        System.out.println(isValid("")); // true
        System.out.println(isValid(s8)); // false
        System.out.println(isValid("([}}])")); // false


    }

    public static boolean isValid(String s) {
        if (s.length() %2 != 0) {
            return false;
        }
        Stack<Character> characterStack = new Stack<>();
        for (char c : s.toCharArray()) {
            if (characterStack.isEmpty() && ( c == '}' || c == ')' || c == ']')) {
                return false;
            }
            if (c == '(' || c == '{' || c == '[') {
                characterStack.push(c);
            } else {
                if (characterStack.peek() == '(' && c == ')') {
                    characterStack.pop();
                } else if (characterStack.peek() == '{' && c == '}') {
                    characterStack.pop();
                } else if (characterStack.peek() == '[' && c == ']') {
                    characterStack.pop();
                } else {
                    return false;
                }
            }

        }
        return characterStack.isEmpty();
    }


}
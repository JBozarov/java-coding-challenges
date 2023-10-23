package com.javacodingchallenges.leetcode.string;

public class MaximumNestingDepthOfTheParentheses {
    public static void main(String[] args) {
        String s = "(1+(2*3)+((8)/4))+1";
        String s2 = "(1)+((2))+(((3)))";

        System.out.println(maxDepth(s));
        System.out.println(maxDepth(s2));
    }

    private static int maxDepth(String s) {
        int maxCount = 0;
        if (s.length() < 1) {
            return maxCount;
        }

        StringBuilder maxParentheses = new StringBuilder("");
        for (int i = 0; i < s.length(); i++ ) {
            String currentElement =  String.valueOf(s.charAt(i));
            if (i + 1 < s.length()) {
                if ( currentElement.equals("(") ) {
                    maxParentheses.append(currentElement);
                    if (maxCount < maxParentheses.length()) {
                        maxCount = maxParentheses.length();
                    }
                } else if (currentElement.equals(")")) {
                    maxParentheses.deleteCharAt(maxParentheses.length()-1);
                }
            }
        }
        return maxCount;
    }
}

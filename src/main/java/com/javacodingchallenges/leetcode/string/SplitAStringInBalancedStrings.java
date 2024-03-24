package com.javacodingchallenges.leetcode.string;


public class SplitAStringInBalancedStrings {
    public static void main(String[] args) {
        String s = "RLRRLLRLRL";
        System.out.println(balancedStringSplit(s));  // 4

        String k = "RLEKRLEK";
        System.out.println(balancedStringSplit(k)); // 2

        String m = "LLLLRRRR";
        System.out.println(balancedStringSplit(m)); // 1
    }

    public static int balancedStringSplit(String s) {
        int count = 0;
        StringBuilder stringL = new StringBuilder();
        StringBuilder stringR = new StringBuilder();

        for (int i = 0; i < s.length(); i++) {
            String currentElement = String.valueOf(s.charAt(i));
            if (currentElement.equalsIgnoreCase("L")) {
                stringL.append(currentElement);
            } else if (currentElement.equalsIgnoreCase("R")) {
                stringR.append(currentElement);
            }

            if (stringL.length() == stringR.length() && ( stringL.length() != 0 && stringR.length() != 0) ){
                stringL = new StringBuilder("");
                stringR = new StringBuilder("");
                count++;
            }
        }

        return count;
    }


}

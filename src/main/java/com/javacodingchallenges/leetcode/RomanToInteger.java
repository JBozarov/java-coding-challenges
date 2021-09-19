package com.javacodingchallenges.leetcode;

import java.util.Map;
import java.util.TreeMap;

public class RomanToInteger {
    public static void main(String[] args) {
        System.out.println(romanToInt("XXVII"));
        System.out.println("--------------------------------------------");
        System.out.println(romanToInt("XXIV"));
        System.out.println("--------------------------------------------");
        System.out.println(romanToInt("MCMXCIV"));
        System.out.println("--------------------------------------------");
        System.out.println(romanToInt("VIII"));
        System.out.println("--------------------------------------------");
        System.out.println(romanToInt("MCMXCVI")); // 1996
    }

    public static int romanToInt(String s) {
        Map<Character, Integer> romanValues = new TreeMap<>();
        romanValues.put('I', 1);
        romanValues.put('V', 5);
        romanValues.put('X', 10);
        romanValues.put('L', 50);
        romanValues.put('C', 100);
        romanValues.put('D', 500);
        romanValues.put('M', 1000);

        int result = 0;
        int count = 1;
        for (int i = 0; i < s.length(); i++ ) {
            System.out.println(" count-" + count + " i-" + i + " s.length()-" + s.length());
            if (count < s.length() && i < s.length() - 1) {
                if ( romanValues.get(s.charAt(i)) < romanValues.get(s.charAt(i+1)) ) {
                  result += romanValues.get(s.charAt(i+1)) - romanValues.get(s.charAt(i));
                  i++;
                } else {
                    result += romanValues.get(s.charAt(i));
                }
            } else {
                result += romanValues.get(s.charAt(i));
            }
            count ++;
            System.out.println(" result is " + result);
        }

        return result;
    }


}



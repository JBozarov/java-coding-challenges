package com.javacodingchallenges.leetcode;

import java.util.Map;
import java.util.TreeMap;

public class RomanToInteger {
    public static void main(String[] args) {
        //romanToInt("XXVII");
        //romanToInt("XXIV");
        romanToInt("MCMXCIV");
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
        for (int i = 0; i < s.length()-1; i++ ) {
            if (count < s.length()) {
                System.out.println("line 28 count " + count );
                System.out.println("line 29 i " + i );
                if ( romanValues.get(s.charAt(i)) < romanValues.get(s.charAt(i+1)) ) {
                  result += romanValues.get(s.charAt(i+1)) - romanValues.get(s.charAt(i));
                  i++;
                  System.out.println("line 33 " +  i + " and result is " + result);
                } else {
                    System.out.println("line 35 " + count);
                    result += romanValues.get(s.charAt(i));
                }
            } else {
                System.out.println(" line 40 " + count);
            }
            count ++;
            System.out.println("result in " + count + " " + result);
            System.out.println(" ------------------------------------------------ ");
        }

        return result;

    }


}



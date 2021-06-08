package com.javacodingchallenges.groups.hackerrank.general;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class IsAnagram {


    static boolean isAnagram(String a, String b) {

        Map<Character, Integer> aMap = new HashMap<>();
        Map<Character, Integer> bMap = new HashMap<>();

        char[] aCharArray = a.toLowerCase().toCharArray();
        char[] bCharArray = b.toLowerCase().toCharArray();

        mapLooper(aMap, aCharArray);
        mapLooper(bMap, bCharArray);

        return aMap.equals(bMap);
    }

    static void mapLooper(java.util.Map<Character, Integer> charMap, char[] charArray) {
        for (char c : charArray) {
            if (charMap.containsKey(c)) {
                charMap.put(c, charMap.get(c) + 1);
            } else {
                charMap.put(c, 1);
            }
        }
    }


    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        String a = scan.next();
        String b = scan.next();
        scan.close();
        boolean ret = isAnagram(a, b);
        System.out.println((ret) ? "Anagrams" : "Not Anagrams");
    }
}

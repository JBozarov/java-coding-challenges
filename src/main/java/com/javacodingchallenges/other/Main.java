package com.javacodingchallenges.other;

import java.util.*;
import java.util.stream.Collectors;

public class Main {
    public static void main(String[] args) {

        int[] arr = {1, 2, 3, 4, 5, 6, 2, 4};
        Arrays.sort(arr);

        Set<Integer> sets = new HashSet<>();

        for ( int i = 0; i < arr.length; i++ ) {
            sets.add(arr[i]);
        }
        System.out.println(sets);

        sets.stream().collect(Collectors.toList());

        String a = " ـبـ ا";
        System.out.println(a);

        Map<String, String> arabicAlphabet = new HashMap<>();

        arabicAlphabet.put("alifIsolated", "ا");
        arabicAlphabet.put("alifEnd", "ـا");
        arabicAlphabet.put("alifMiddle", "ـا");
        arabicAlphabet.put("alifMiddle", "ا");

        arabicAlphabet.put("baaIsolated", "ب");
        arabicAlphabet.put("baaEnd", "ج");
        arabicAlphabet.put("baaEnd", "ي");





    }
}

package com.javacodingchallenges.leetcode.hash_table_sorting;

import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;
import java.util.stream.Collectors;

public class CheckIfNumberHasEqualDigitCountAndDigitValue {
    public static void main(String[] args) {
        String s = "1210";
        System.out.println(digitCount(s));  // true

        String s2 = "030";
        System.out.println(digitCount(s2)); // false
    }


    public static boolean digitCount(String num) {
        int[] arr = new int[num.length()];
        Map<Integer, Integer> map = new HashMap<>();
        int count = 0;
        for ( int i = 0; i < num.length(); i++ ) {
            int currentValue = Integer.parseInt(String.valueOf(num.charAt(i)));
            arr[i] = currentValue;
            if (map.containsKey(currentValue)) {
                map.put(currentValue, map.get(currentValue) + 1);
            } else {
                map.put(currentValue, 1);
            }
        }

        for (int k = 0; k < arr.length; k++ ) {
            if (!map.containsKey(k) && arr[k] == 0) {
                count ++;
            }
            if ( map.containsKey(k) && map.get(k) == arr[k] ) {
                count ++;
            }
        }

        return arr.length == count;
    }
}

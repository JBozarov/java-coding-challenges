package com.javacodingchallenges.leetcode.counting;

import java.util.*;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class SortIntegersByTheNumberOf1Bits {
    public static void main(String[] args) {
        int[] arr = {0, 1, 2, 3, 4, 5, 6, 7, 8};
        System.out.println(Arrays.toString(sortByBits(arr)));  // [0,1,2,4,8,3,5,6,7]

        System.out.println();
        System.out.println("---------------------------------------");
        System.out.println();

        int[] arr2 = {1024, 512, 256, 128, 64, 32, 16, 8, 4, 2, 1};
        System.out.println(Arrays.toString(sortByBits(arr2)));
    }

    public static int[] sortByBits(int[] arr) {

        // counting bits by index
        Map<Integer, Integer> map = new HashMap<>();
        for (int i = 0; i < arr.length; i++) {
            String currentBinaryString = Integer.toBinaryString(arr[i]);
            int count = 0;
            for (int k = 0; k < currentBinaryString.length(); k++) {
                if (String.valueOf(currentBinaryString.charAt(k)).equals("1")) {
                    count++;
                }
            }
            map.put(arr[i], count);
        }
        System.out.println("map is " + map);

        // storing keys and values in 2 separate arrays
        List<Integer> keysList = new ArrayList<>();
        List<Integer> valuesList = new ArrayList<>();
        for (Map.Entry<Integer, Integer> entry : map.entrySet()) {
            keysList.add(entry.getKey());
            valuesList.add(entry.getValue());
        }
        Integer[] keysArray = keysList.toArray(Integer[]::new);
        Integer[] valuesArray = valuesList.toArray(Integer[]::new);


        // buble sort
        for (int i = 0; i < keysArray.length - 1; i++) {
            for (int k = 0; k < keysArray.length - i - 1; k++) {
                if (valuesArray[k] > valuesArray[k+1]) {
                    int temp = valuesArray[k];
                    valuesArray[k] = valuesArray[k + 1];
                    valuesArray[k + 1] = temp;

                    int tempKey = keysArray[k];
                    keysArray[k] = keysArray[k + 1];
                    keysArray[k + 1] = tempKey;
                }
            }
        }


        // returning the result
        int[] result = new int[keysArray.length];
        for (int i = 0; i < result.length; i++ ) {
            result[i] = keysArray[i];
        }
        return result;
    }
}

package com.javacodingchallenges.codewars.kata8;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class DivisibleBy {
    public static void main(String[] args) {
        int[] arr1 = {1, 2, 4, 5, 6};
        divisible(arr1, 2).stream().forEach(System.out::println);
    }

    public static List<Integer> divisible(int[] arr, int divisor) {
        return Arrays.stream(arr).filter(v -> v%divisor == 0).boxed().collect(Collectors.toList());
    }
}

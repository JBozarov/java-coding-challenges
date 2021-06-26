package com.javacodingchallenges.leetcode;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class AddTwoNumbers {

    public static void main(String[] args) {
        List<Integer> listOne = new ArrayList<>(List.of(2, 4, 3));
        List<Integer> listTwo = new ArrayList<>(List.of(5, 6, 4));
        
        System.out.println(add(listOne, listTwo).toString()); // [8, 0, 7]
    }

    public static List<Integer> add(List<Integer> listOne, List<Integer> listTwo) {
        System.out.println(listOne);
        String abc = listOne.stream()
                .map(v -> v + "")
                .reduce("", (current, sum) -> sum += current);

        String def = listTwo.stream()
                .map(v -> v + "")
                .reduce("", (current, sum) -> sum += current);

        System.out.println(looper(abc, def));
        return Arrays
                .stream(String.valueOf(looper(abc, def))
                .split(""))
                .map(Integer::parseInt)
                .collect(Collectors.toList());
    }

    public static int looper(String sOne, String sTwo) {
        return Integer.parseInt(String.valueOf(new StringBuilder(sOne).reverse())) + Integer.parseInt(String.valueOf(new StringBuilder(sTwo).reverse()));
    }
}

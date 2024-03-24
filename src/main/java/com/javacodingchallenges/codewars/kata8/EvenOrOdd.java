package com.javacodingchallenges.codewars.kata8;

public class EvenOrOdd {
    public static void main(String[] args) {
        int[] one = {1, 2, 3};
        int[] two = {1, 2, 3, 4};
        System.out.println(evenOrOdd(one));
        System.out.println(evenOrOdd(two));
    }

    public static String evenOrOdd (int[] arr) {
        String result = "";

        if (arr.length % 2 == 0) {
            result = "Even";
        } else {
            result = "Odd";
        }
        return result;
    }
}

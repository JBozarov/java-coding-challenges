package com.javacodingchallenges.codewars.kata8;

public class FindSmallestInt {
    public static void main(String[] args) {
        int[] arr = {1, 2, 3, -4, 5, 8};
        System.out.println(findSmallest(arr));
    }

    public static int findSmallest(int[] arr) {
        int smallest = 0;
        for ( int i = 0; i < arr.length; i++ ) {
            if (smallest > arr[i]) {
                smallest = arr[i];
            }
        }
        return smallest;
    }
}

package com.javacodingchallenges.leetcode.array;

import java.util.Arrays;

public class MinimumNumberOfMovesToSeatEveryone {
    public static void main(String[] args) {
        int[] seats = {4, 1, 5, 9};
        int[] students = {1, 3, 2, 6};
        System.out.println(minMovesToSeat(seats, students));

        int[] seats2 = {2, 2, 6, 6};
        int[] students2 = {1, 3, 2, 6};
        System.out.println(minMovesToSeat(seats2, students2));
    }

    public static int minMovesToSeat(int[] seats, int[] students) {
        int count = 0;
        Arrays.sort(seats);
        Arrays.sort(students);

        for (int i = 0; i < seats.length; i++) {
            count += Math.abs(seats[i] - students[i]);
        }
        return count;
    }
}

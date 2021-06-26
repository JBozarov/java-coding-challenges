package com.javacodingchallenges.codewars.kata6;

import java.util.Arrays;

public class SmallEnough {
    public static void main(String[] args) {

        System.out.println(smallEnough(new int[] { 66, 1041 }, 200));
    }

    public static boolean smallEnough(int[] a, int limit){
        return Arrays.stream(a).filter(v -> v <= limit).count() == a.length;
    }
}
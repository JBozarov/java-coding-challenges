package com.javacodingchallenges.other;

public class CreateFibanacciSequence {
    public static void main(String[] args) {

        createFinanacci(100);
    }

    private static void createFinanacci(int i) {
        int f1 = 1;
        int f2 = 2;
        int next = 0;
        while (next < i) {
            next = f1 + f2;
            f1 = f2;
            f2 = next;
            System.out.println(next);
        }
    }
}

package com.javacodingchallenges.other;

public class EvenFibonacciNumbers {
    public static void main(String[] args) {
        //System.out.println(sumOfEvenFibonacci(10));
        System.out.println(sumOfEvenFibonacci(1000));
    }


    public static long sumOfEvenFibonacci(int num) {
        int result = 0;
        int n1 = 1;
        int n2 = 2;
        int nextFib = 0;

        while ( nextFib < num ) {
            nextFib = n1 + n2;
            n1 = n2;
            n2 = nextFib;
            if (nextFib % 2 == 0 ) {
                System.out.println(result);
                result += nextFib;
            }
        }

        return result;
    }
}



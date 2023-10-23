package com.javacodingchallenges.codewars.kata8;

public class Summation {

    public static void main(String[] args) {
        System.out.println(summation(1)); // 1
        System.out.println(summation(11)); // 66
        System.out.println(Summation.summation(12)); // 78
    }


    public static int summation ( int num ) {
        if (num == 1) {
            return num;
        }
        return num + summation(num-1);
    }
}

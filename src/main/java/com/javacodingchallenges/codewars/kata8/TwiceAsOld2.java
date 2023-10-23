package com.javacodingchallenges.codewars.kata8;

public class TwiceAsOld2 {
    public static void main(String[] args) {
        System.out.println(howManyYears(30, 7));  // 16
        System.out.println(howManyYears(45, 30)); // 15
    }

    public static int howManyYears(int dadAge, int sonAge) {
        int result = 0;
        if (dadAge >= sonAge * 2) {
            while (dadAge > sonAge * 2) {
                dadAge++;
                sonAge++;
                result++;
            }
        } else {
            while (dadAge < sonAge * 2) {
                dadAge--;
                sonAge--;
                result++;
            }
        }
        return result;
    }
}

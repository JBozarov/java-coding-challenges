package com.javacodingchallenges.other;

public class OverloadingDemo {
    public static void main(String[] args) {
        int i = 0;
        callMe(i);  // long is i, why ?
    }


    public static void callMe(Long l) {
        System.out.println("long is " + l);
    }

    public static void callMe(int i) {
        System.out.println("long is " + i);
    }
}

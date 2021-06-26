package com.javacodingchallenges.hackerrank.general;

import java.util.Scanner;

public class CurrencyFormatter {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        double payment = scanner.nextDouble();
        scanner.close();

        String formatted = String.format("%,.5f", payment);
        System.out.println(formatted);

        String us = Character.toString((char) 36)+formatted;
        String india = "Rs."+formatted;
        String china = "\u00a5"+formatted;
        String france = formatted.replace(",", " ")+ "\u20AC";

        System.out.println("US: " + us);
        System.out.println("India: " + india);
        System.out.println("China: " + china);
        System.out.println("France: " + france);
    }

}

package com.javacodingchallenges.other;

import java.util.Scanner;

public class PensionChallenge {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Start");
        System.out.println("Please enter your name: ");
        String name = scanner.nextLine();

        System.out.println("Please enter your age: ");
        int age = Integer.parseInt(scanner.nextLine());

        System.out.println("Please enter your gender: ");
        String gender = scanner.nextLine();

        System.out.println("Please enter yes if you have disability no if you don't: ");
        String disability = scanner.nextLine();

        if (gender.equalsIgnoreCase("m")) {
            if (disability.equals("yes")) {
                if (age >= 55) {
                    System.out.println("Yes, " + name + " is retired" );
                } else {
                    System.out.println("No, " + name + " is not retired");
                }
            } else if (disability.equals("no")) {
                if (age >= 65) {
                    System.out.println("Yes, " + name + " is retired" );
                } else {
                    System.out.println("No, " + name + " is not retired");
                }
            }
        } else if (gender.equalsIgnoreCase("f")) {
            if (disability.equals("yes")) {
                if (age >= 45) {
                    System.out.println("Yes, " + name + " is retired" );
                } else {
                    System.out.println("No, " + name + " is not retired");
                }
            } else if (disability.equals("no")) {
                if (age >= 55) {
                    System.out.println("Yes, " + name + " is retired" );
                } else {
                    System.out.println("No, " + name + " is not retired");
                }
            }
        }
    }
}

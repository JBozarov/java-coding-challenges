package com.javacodingchallenges.groups.hackerrank.general;

import java.util.Scanner;

public class OutputFormat {


    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.println("================================");
        for (int i = 0; i < 3; i++) {
            String s1 = sc.next();
            int x = sc.nextInt();
            String xString = String.valueOf(x);

            if (x < 10) {
                xString = "00" + String.valueOf(x);
            } else if (x < 100 ) {
                xString = "0" + String.valueOf(x);
            }

            StringBuilder s = new StringBuilder(" ");

            for (int k = 0; k < 15 - s1.length(); k++) {
                s.append(" ");
            }

            System.out.println(s1 + s + xString);
        }
        System.out.println("================================");

    }
}

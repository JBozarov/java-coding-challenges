package com.javacodingchallenges.hackerrank.general;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class EndOfLife {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        List<String> messages = new ArrayList<>(n);

        for (int i = 1; i <= n; i++) {
            String input = scanner.next();
            messages.add(input);
        }

        for (int k = 0; k < messages.size(); k++) {
            System.out.println(k + 1 + " " + messages.get(k));
        }

        // Second way 
        Scanner sc = new Scanner(System.in);
        int line_num = 0;
        while (sc.hasNext())
            System.out.println(++line_num + " " + sc.nextLine());
        sc.close();

    }
}

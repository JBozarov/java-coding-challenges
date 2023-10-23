package com.javacodingchallenges.hackerrank.general;

import java.util.Scanner;

public class JavaStaticInitializerBlock {
    public static void main(String[] args) throws Exception {
        Scanner scanner = new Scanner(System.in);
        int H = scanner.nextInt();
        int B = scanner.nextInt();

        if (H <= 0 || B <= 0) {
            System.out.println("java.lang.Exception: Breadth and height must be positive");
        }
        else {
            System.out.println(H * B);
        }
    }
}

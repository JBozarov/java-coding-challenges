package com.javacodingchallenges.hackerrank.string;


import java.util.Scanner;

public class SubstringComparisons {

    public static String getSmallestAndLargest(String s, int k) {
        String smallest = "";
        String largest = "";
        java.util.List<String> subStringsList = new java.util.ArrayList<>(s.length() - 2);

        for (int i = 0; i < s.length() - (k - 1); i++) {
            String temp = s.substring(i, i + k);
            subStringsList.add(temp);
        }

        java.util.Collections.sort(subStringsList);
        smallest = subStringsList.get(0);
        largest = subStringsList.get(subStringsList.size() - 1);

        return smallest + "\n" + largest;
    }

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        String s = "ASDFHDSFHsdlfhsdlfLDFHSDLFHsdlfhsdlhkfsdlfLHDFLSDKFHsdfhsdlkfhsdlfhsLFDLSFHSDLFHsdkfhsdkfhsdkfhsdfhsdfjeaDFHSDLFHDFlajfsdlfhsdlfhDSLFHSDLFHdlfhs"; //scan.next();
        int k = 30; //scan.nextInt();
        scan.close();

        System.out.println(getSmallestAndLargest(s, k));
    }
}

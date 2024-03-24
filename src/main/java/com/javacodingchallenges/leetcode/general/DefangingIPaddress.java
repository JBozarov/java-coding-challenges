package com.javacodingchallenges.leetcode.general;

public class DefangingIPaddress {
    public static void main(String[] args) {
        String address = "1.1.1.1";
        String address2 = "255.100.50.0";
        System.out.println(defangIPaddr(address));
        System.out.println(defangIPaddr(address2));
    }

    public static String defangIPaddr(String address) {
        String[] chars = address.split("");
        String result = "";

        for (int i = 0; i < chars.length; i++ ) {
            if (chars[i].equals(".")) {
                result += "[.]";
            } else {
                result += chars[i];
            }
        }

        return result;
    }
}

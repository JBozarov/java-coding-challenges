package com.javacodingchallenges.leetcode.string;

public class AddBinary {
    public static void main(String[] args) {
        System.out.println(addBinary("1", "11")); // 100
        String b1 = "10100000100100110110010000010101111011011001101110111111111101000000101111001110001111100001101";
        String b2 = "110101001011101110001111100110001010100001101011101010000011011011001011101111001100000011011110011";

        System.out.println(addBinary(b1, b2));                 // 110111101100010011000101110110100000011101000101011001000011011000001100011110011010010011000000000
        System.out.println(addBinary("1010", "1011"));    // 10101
        System.out.println(addBinary("1011101", "1101")); // 1101010
        System.out.println(addBinary("0", "0")); // 1101010
    }

    public static String addBinary2(String a, String b) {
        return Integer.toBinaryString(Integer.parseInt(a, 2) + Integer.parseInt(b, 2));
    }

    // This is the way of solving using binary adding ( adding directly binary number )
    public static String addBinary(String a, String b) {
        int aLength = a.length() - 1;
        int bLength = b.length() - 1;
        int carry = 0;
        String sum = "";

        if (a.equals("0") && b.equals("0")) {
            return "0";
        }


        while (aLength >= 0 || bLength >= 0) {
            int tempA = 0;
            int tempB = 0;
            if (aLength >= 0) {
                tempA = Character.getNumericValue(a.charAt(aLength));
            }
            if (bLength >= 0) {
                tempB = Character.getNumericValue(b.charAt(bLength));
            }

            int newSum = tempA + tempB + carry;
            if (aLength == bLength && aLength == 0 || aLength > bLength && aLength == 0 || bLength > aLength && bLength == 0) {
                if (newSum == 1) {
                    sum = "1" + sum;
                    carry = 0;
                } else if (newSum == 2) {
                    sum = "10" + sum;
                } else if (newSum == 3) {
                    sum = "11" + sum;
                }
            } else {
                if (newSum == 0) {
                    sum = "0" + sum;
                    carry = 0;
                }

                if (newSum == 1) {
                    sum = "1" + sum;
                    carry = 0;
                }

                if (newSum == 2) {
                    sum = "0" + sum;
                    carry = 1;
                }

                if (newSum == 3) {
                    sum = "1" + sum;
                    carry = 1;
                }
            }
            aLength --;
            bLength --;
        }
        return sum;
    }
}

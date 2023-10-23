package com.javacodingchallenges.codewars.kata7;

public class SixTeenPlusEightTeen {
    public static void main(String[] args) {

        add(16, 18); // 214
        add(16325, 18); // 163 3 13
        add(18, 18); // 216
        add(99, 222); // 21111
    }


    public static int add(int num1,int num2){
        String revNum1 = new StringBuilder(String.valueOf(num1)).toString();
        String revNum2 = new StringBuilder(String.valueOf(num2)).toString();

        int large = 0;
        int equeal = 0;
        int small = 0;

        if (revNum1.length() == revNum2.length()) {
            equeal = revNum1.length();
        } else if (revNum1.length() > revNum2.length()) {
            large = revNum1.length();
            small = revNum2.length();
        } else {
            large = revNum2.length();
            small = revNum1.length();
        }

        String result = "";

        if (revNum1.length() == revNum2.length()) {
            for ( int i = 0; i < equeal ; i++ ) {
                result += Character.getNumericValue(revNum1.charAt(i)) + Character.getNumericValue(revNum2.charAt(i));
            }
        } else if (revNum1.length() > revNum2.length()) {
            int diff = revNum1.length() - revNum2.length();
            result = revNum1.substring(0, diff);
            String newStr = revNum1.substring(diff);
            for (int i = 0; i < revNum2.length(); i++ ) {
                result += Character.getNumericValue(newStr.charAt(i)) + Character.getNumericValue(revNum2.charAt(i));
            }
        } else {
            int diff = revNum2.length() - revNum1.length();
            result = revNum2.substring(0, diff);
            String newStr = revNum2.substring(diff);
            for (int i = 0; i < revNum1.length(); i++ ) {
                result += Character.getNumericValue(newStr.charAt(i)) + Character.getNumericValue(revNum1.charAt(i));
            }
        }

        return Integer.parseInt(result);
    }
}

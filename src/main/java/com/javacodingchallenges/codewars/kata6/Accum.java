package com.javacodingchallenges.codewars.kata6;

import java.io.Serializable;
import java.util.Locale;

public class Accum extends Object implements Serializable {

/* This time no story, no theory. The examples below show you how to write function accum:
    Examples:
    accum("abcd") -> "A-Bb-Ccc-Dddd"
    accum("RqaEzty") -> "R-Qq-Aaa-Eeee-Zzzzz-Tttttt-Yyyyyyy"
    accum("cwAt") -> "C-Ww-Aaa-Tttt"
*/

    public static void main(String[] args) {
        System.out.println(accum("abcd")); // "A-Bb-Ccc-Dddd"
        System.out.println(accum("RqaEzty")); //"R-Qq-Aaa-Eeee-Zzzzz-Tttttt-Yyyyyyy"
        System.out.println(accum("cwAt")); //C-Ww-AAA-Tttt
    }

    private static String accum(String abcd) {
        String result = "";
        char[] chars = abcd.toCharArray();
        for (int i = 0; i < chars.length; i++ ) {
            String temp = String.valueOf(chars[i]);
            String upperTemp = temp.toUpperCase(Locale.ROOT);
            if (!Character.isUpperCase(chars[i])) {
                result += upperTemp + temp.repeat(i);
            } else {
                result += upperTemp + temp.toLowerCase().repeat(i);
            }
            if (i != chars.length - 1) {
                result += "-";
            }
        }

        return result;


    }


}

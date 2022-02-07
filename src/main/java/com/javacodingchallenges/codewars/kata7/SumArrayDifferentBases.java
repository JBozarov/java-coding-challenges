package com.javacodingchallenges.codewars.kata7;

import java.util.HashMap;
import java.util.Map;

public class SumArrayDifferentBases {
    public static void main(String[] args) {

       BasedNumbers[] baseNumbers = new BasedNumbers[3];
       BasedNumbers baseNumbers0 = new BasedNumbers("10", 8);
       BasedNumbers baseNumbers1 = new BasedNumbers("7640", 8);
       BasedNumbers baseNumbers2 = new BasedNumbers("1", 9);
       baseNumbers[0] = baseNumbers0;
       baseNumbers[1] = baseNumbers1;
       baseNumbers[2] = baseNumbers2;

        System.out.println(sumItUpSingle(baseNumbers0));
        System.out.println(sumItUpSingle(baseNumbers1));
        System.out.println(sumItUpSingle(baseNumbers2));

       /*
       Use this formula
        "str" is input number as a string: 7640
        "base" is the base of the input number: 8
        Decimal Equivalent is, 1*str[len-1] + base*str[len-2] + (base)2*str[len-3] + ...
        (7 × 8³) + (6 × 8²) + (4 × 8¹) + (0 × 8⁰) = 4000

        */

    }



    public static long sumItUp(BasedNumbers[] numbersWithBases) {
        long result = 0;
        for (int i = 0; i < numbersWithBases.length; i++ ) {
            for (int k = 0; k < numbersWithBases[i].getNumber().length(); k++ ) {
                result += Character.getNumericValue(numbersWithBases[i].getNumber().charAt(k)) * Math.pow(numbersWithBases[i].getBase(), numbersWithBases[i].getNumber().length() - 1 - k);
            }
        }
        return result;
    }


    public static long sumItUpSingle(BasedNumbers numbersWithBases) {
        long result = 0;
            for (int k = 0; k < numbersWithBases.getNumber().length(); k++ ) {
                result += Character.getNumericValue(numbersWithBases.getNumber().charAt(k)) * Math.pow(numbersWithBases.getBase(), numbersWithBases.getNumber().length() - 1 - k);
        }
        return result;
    }
}


class BasedNumbers {
    String number;
    int base;

    public BasedNumbers() {
    }

    public BasedNumbers(String number, int base) {
        this.number = number;
        this.base = base;
    }

    public String getNumber() {
        return number;
    }

    public void setNumber(String number) {
        this.number = number;
    }

    public int getBase() {
        return base;
    }

    public void setBase(int base) {
        this.base = base;
    }


}
package com.javacodingchallenges.codewars.kata7;

import java.util.HashMap;
import java.util.Map;

public class SumArrayDifferentBases {
    public static void main(String[] args) {

       BasedNumbers[] baseNumbers = new BasedNumbers[3];
       BasedNumbers baseNumbers0 = new BasedNumbers("101", 16);
       BasedNumbers baseNumbers1 = new BasedNumbers("7640", 8);
       BasedNumbers baseNumbers2 = new BasedNumbers("1", 9);
       baseNumbers[0] = baseNumbers0;
       baseNumbers[1] = baseNumbers1;
       baseNumbers[2] = baseNumbers2;

    }



    public static long sumItUp(BasedNumbers[] numbersWithBases) {
        return 34343;
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
}
package com.javacodingchallenges.codewars;


/* Consider an array/list of sheep where some sheep may be missing from their place. We need a function that counts the
        number of sheep present in the array (true means present).

        For example,

        [true,  true,  true,  false,
        true,  true,  true,  true ,
        true,  false, true,  false,
        true,  false, false, true ,
        true,  true,  true,  true ,
        false, false, true,  true] */




import java.util.Arrays;
import java.util.Objects;

public class Counter {
    public int countSheeps(Boolean[] arrayOfSheeps) {
        System.out.println(Arrays.toString(arrayOfSheeps));
        return (int) Arrays.stream(arrayOfSheeps).filter(Objects::nonNull).filter(v -> v.equals(true)).count();
    }
}
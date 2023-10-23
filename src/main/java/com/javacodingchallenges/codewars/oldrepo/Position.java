
   package com.javacodingchallenges.codewars.oldrepo;


public class Position {


    public static String position(char alphabet){
        String letters = "abcdefghijklmnopqrstuvwxyz";
        int temp = letters.indexOf(alphabet);
        System.out.println(temp);
        String result = String.valueOf(temp);
        System.out.println(result);
        return result;
    }

    public static void main(String[] args) {
        position('z'); // 25
    }
}


class Alphabet {
    public static void main(String[] args) {
        System.out.println(position("a"));
    }

    public static String position(String letter) {
        String alphabet = "abcdefghijklmnopqrstuvwxyz";
        return "Position of alphabet: " + (alphabet.indexOf(letter) + 1);
    }
}

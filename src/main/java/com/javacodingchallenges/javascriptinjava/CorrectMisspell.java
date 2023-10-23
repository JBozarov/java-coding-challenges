package com.javacodingchallenges.javascriptinjava;


public class CorrectMisspell {

    /* Character recognition software is widely used to digitise printed texts. Thus the texts can be edited,
        searched and stored on a computer.
        When documents (especially pretty old ones written with a typewriter), are digitised character
        recognition software often make mistakes.
        Your task is correct the errors in the digitised text. You only have to handle the following mistakes:
        S is misinterpreted as 5
        O is misinterpreted as 0
        I is misinterpreted as 1
        The test cases contain numbers only by mistake.
    */

    public static void main(String[] args) {
        correct("Hello1and5and0");
    }

    public static String correct (String word) {
        StringBuilder s = new StringBuilder("");
        System.out.println("Old string is " + word);
        char[] characters = word.toCharArray();
        for (char c : characters) {
            if (c == '5') {
                s.append('s');
            } else if (c == 'o') {
                s.append('O');
            } else if (c == '1') {
                s.append('i');
            } else {
                s.append(c);
            }
        }
        System.out.println("new string is " + s);
        return s.toString();
    }
}

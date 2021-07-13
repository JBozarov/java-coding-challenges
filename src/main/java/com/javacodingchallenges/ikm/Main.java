package main.java.com.javacodingchallenges.ikm;
import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.*;

public class Main {

  public static void main(String[] args) {

    int a = 9, b = 2;
    float f;
    f = a/b;
    System.out.println(f);
    System.out.println("f = " + f);
    f = f/2;
    System.out.println("f = " + f);
    f = a + b/f;
    System.out.println("f = " + f);

    String[] hel = {"DFKJDKF", "DFKDJFKJ"};
    List<String> stringList = new ArrayList<>();
    stringList.add("Aa");
    stringList.add("Bb");

    System.out.println(hel.getClass().getName());

  }
}

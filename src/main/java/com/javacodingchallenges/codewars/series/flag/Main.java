package com.javacodingchallenges.codewars.series.flag;


import java.util.List;
import java.util.Optional;

public class Main {


  public static Optional<StaticClass> optionalStaticClass;

  public static void main(String[] args) {
    TrueMaker trueMaker = new TrueMaker();
    FalseMaker falseMaker = new FalseMaker();

    System.out.println("Value of toggle is " + StaticClass.toggle);

    trueMaker.makeTrue();
    System.out.println("Value of toggle is " + StaticClass.toggle);

    falseMaker.makeFalse();
    System.out.println("Value of toggle is " + StaticClass.toggle);

    trueMaker.makeTrue();
    System.out.println("Value of toggle is " + StaticClass.toggle);

    falseMaker.makeFalse();
    System.out.println("Value of toggle is " + StaticClass.toggle);

    List<StaticClass> staticClassList = List.of(new StaticClass("Name1"), new StaticClass("Name2"), new StaticClass("Name3"));
    optionalStaticClass = staticClassList.stream().filter(v -> v.getName().equalsIgnoreCase("name2")).findAny();

    if (optionalStaticClass.isPresent()) {
      System.out.println("EMPTY");
    }
  }



}

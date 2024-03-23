package main.java.com.javacodingchallenges.codewars.series.allstarcode;

public class Series5 {
  public static void main(String[] args) {
    String[] movies = {"Avatar", "Terminator", "Movie3", "Movie4", "Movie5"};
    System.out.println(randomMovieGenerator(movies));
  }

  private static String randomMovieGenerator(String[] movies) {
    return movies[(int) Math.floor(Math.random() * movies.length)];
  }
}

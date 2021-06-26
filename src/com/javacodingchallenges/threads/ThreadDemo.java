package com.javacodingchallenges.threads;

public class ThreadDemo {
  public static void main(String[] args) {
    System.out.println("Starting thread 1");
    Task task = new Task();
    task.start();

    System.out.println("Starting thread 2");
    Task task2 = new Task();
    task2.start();
  }
}

class Task extends Thread {
  @Override
  public void run() {
    for (int i = 0; i < 10; i++) {
      System.out.println(i + " " + Thread.currentThread().getName());
    }
  }
}

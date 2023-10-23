package com.javacodingchallenges.other;

import java.text.Format;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;

public class DayDemo {
  public static void main(String[] args) {
    Format f = new SimpleDateFormat("MM/dd/yyyy");
    String dateString = f.format(new Date());
    System.out.println(dateString);

    Calendar c = Calendar.getInstance();
    c.add(Calendar.DATE, 30);
    System.out.println(f.format(c.getTime()));
  }
}

package com.javacodingchallenges.hackerrank.data;

import java.util.Calendar;
import java.util.Date;


public class CalendarDay {

        public static String findDay(int month, int day, int year) {

        Calendar calendar = Calendar.getInstance();
        Date date = new Date(year, month-1, day);
        calendar.setTime(date);
        int result = calendar.get(Calendar.DAY_OF_WEEK)-1;

        String returnDay = "";
            switch (result) {
                case 1:
                    returnDay = "Sunday";
                    break;
                case 2:
                    returnDay = "Monday";
                    break;
                case 3:
                    returnDay = "Tuesday";
                    break;
                case 4:
                    returnDay = "Wednesday";
                    break;
                case 5:
                    returnDay = "Thursday";
                    break;
                case 6:
                    returnDay = "Friday";
                    break;
                case 7:
                    returnDay = "Saturday";
                    break;
            }
        return returnDay.toUpperCase();
    }

    public static void main(String[] args) {
        System.out.println(findDay(8, 5, 2015));
    }

}

package com.javacodingchallenges.codewars.series.flag;

public class StaticClass {
    public String name;
    public static boolean toggle = Boolean.FALSE;


    public StaticClass() {
    }

    public StaticClass(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public static boolean isToggle() {
        return toggle;
    }

    public static void setToggle(boolean toggle) {
        StaticClass.toggle = toggle;
    }
}

package com.demo;

import java.util.Calendar;

public class MainDemo {
    public static void main(String[] args) {
        System.out.println("Hello world");
        Calendar meet = Calendar.getInstance();
        meet.set(2008, Calendar.APRIL, 1);
        Calendar getHand = Calendar.getInstance();
        getHand.set(2010, Calendar.NOVEMBER, 15);
        Calendar marry = Calendar.getInstance();
        marry.set(2016, Calendar.FEBRUARY, 2);
        Calendar today = Calendar.getInstance();

        System.out.println("today: " + ( today.get(Calendar.YEAR) - marry.get(Calendar.YEAR) ));

    }
    static boolean m(char a) {
        System.out.print(a);
        return true;
    }


    public String sysHello() {
        return "Hello";
    }
}

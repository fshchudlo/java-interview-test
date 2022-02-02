package com.plesk.java;

import java.util.Calendar;
import java.util.Date;

public class Main {

    public static void main(String[] args) {
        PrintGreeting("John");
    }
    public static void PrintGreeting(String name)
    {
        int currentHour = Calendar.getInstance().get(Calendar.HOUR_OF_DAY);
        if(currentHour < 12)
        {
            System.out.println("Good morning, " + name);
        }
        else if(currentHour < 18)
        {
            System.out.println("Hello, " + name);
        }
        else if(currentHour < 22)
        {
            System.out.println("Good evening, " + name);
        }
        else
        {
            System.out.println("It's time to sleep, " + name);
        }
    }
}

package com.my.first;

import java.util.Scanner;

public class MondayMorningAtBob {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the day");
        String day = sc.nextLine();
        System.out.println("Enter the time");
        String time = sc.nextLine();

        //String time = "8:30";
        // String day = "monday";
        //String alarm = "SNOOZE";
        System.out.println(day + time);

        if (time == "8:30" && day == "monday") {
            String alarmTime = "SNOOZE";
            if (alarmTime == "SNOOZE") {
                coffeeMaker();

            }
        } else if (time == "9:00" && day == "monday") {
            nokiaNavigator();

        }


    }


    public static void coffeeMaker() {
        System.out.println("Hey, the geek's sleeping in again, delay the coffee 12 minutes");
        motoralaToaster();
    }

    public static void motoralaToaster() {
        System.out.println("Hold the toast, Bob's snoozing");
        nokiaNavigator();
    }

    public static void alarmClock() {

    }

    public static void nokiaNavigator() {
        System.out.println("we're running a little late");
    }
}

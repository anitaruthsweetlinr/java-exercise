package org.example;

import java.util.Scanner;

public class TimeConverter {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter time in seconds :");
        int timeInSeconds = sc.nextInt();
        int hours = timeInSeconds / 3600;
        int minutesCalc = timeInSeconds % 3600;
        int minutes = minutesCalc / 60;
        int seconds = minutesCalc % 60;

        System.out.println(hours +":" + minutes + ":" + seconds);


    }
}

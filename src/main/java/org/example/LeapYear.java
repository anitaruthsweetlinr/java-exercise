package org.example;

import java.util.Scanner;

public class LeapYear {
    public static void main(String[] args) {
        //Exercise-2
        System.out.println("Exercise-2");
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a year : ");
        int year = sc.nextInt();
        if(year%4 == 0)
            System.out.println("Year - "+year+ " is a leap year!");
        else
            System.out.println("Year - "+year+ " is not a leap year!");

    }
}
package se.lexicon.exercise;

import java.util.Scanner;

public class PrintName {
    public static void main(String[] args) {
        //Exercise-1
        System.out.println("Exercise-1");
        System.out.println("Hello" + "\n" + "Anita!");

        //Exercise-5
        System.out.println("Exercise-5");
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter name : ");
        String username = sc.nextLine();
        System.out.println("Hello "+username);
    }
}

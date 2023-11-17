package se.lexicon.practise;

import java.util.Scanner;

public class CompareScore {
    public static void main(String[] args) {
        int score = 0;
        Scanner scObj = new Scanner(System.in);
        System.out.println("Enter score :" +
                "");
        score = scObj.nextInt();
        if(score > 65) {
            System.out.println("Hurray, you passed!");
        }
        else if( score >= 55 && score <=64){
            System.out.println("You are almost there!");
        }
        else {
            System.out.println("Sorry you didn't pass!");
        }
    }
}

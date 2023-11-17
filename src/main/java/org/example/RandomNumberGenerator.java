package org.example;

import javax.sound.midi.Soundbank;
import java.sql.SQLOutput;
import java.util.Random;
import java.util.Scanner;

public class RandomNumberGenerator {
    public static void main(String[] args) {
        Random random = new Random();
        Scanner scObj = new Scanner(System.in);
        int randomNumber = random.nextInt(500);
        boolean isGuessRight = false;
        int guessCount = 0;
        int userChoice = 0;
        while(!isGuessRight) {
            System.out.println("Guess the number picked!");
            userChoice = scObj.nextInt();
            if(userChoice == randomNumber) {
                isGuessRight = true;
                break;
            }
            else if (userChoice < randomNumber){
                System.out.println("Your guess was too small !");
            }
            else {
                System.out.println("Your guess was too big !");
            }
            guessCount++;
        }
        System.out.println("You guessed right !! You took "+ guessCount + " attempts to guess the number !!");
    }
}

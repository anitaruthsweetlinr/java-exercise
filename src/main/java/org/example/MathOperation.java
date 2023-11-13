package org.example;

import java.util.Scanner;

public class MathOperation {
    public static void main(String[] args) {
        //Exercise-3
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter first number : ");
        int n1 = sc.nextInt();
        System.out.println("Enter second number : ");
        int n2 = sc.nextInt();
        System.out.println(" Enter Choice number : \n 1.addition \n 2.subtraction \n 3.Multiplication \n 4.Division");
        int choice = sc.nextInt();

        if(choice == 1) {
            System.out.println(" Sum is "+  (n1 + n2));
        }
        else if(choice == 2) {
            if(n1 > n2)
                System.out.println("Difference is "+ (n1- n2));
            else
                System.out.println("n1 must be bigger than n2");
        }
        else if(choice == 3){
            System.out.println("Product is " + (n1*n2));
        }
        else if(choice == 4) {
            System.out.println("Quotient is " + (n1 / n2));
        }
        else {
            System.out.println("Please enter a valid choice");
        }
    }
}
